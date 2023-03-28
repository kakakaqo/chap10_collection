package com.javalab.collection.pkg07;

import java.util.*;

public class StudentCollectionMain {

	public static void main(String[] args) {
		
		// Data 생성
		Student stu1 = new Student(1, "John", 87);
		Student stu2 = new Student(2, "Mary", 90);
		Student stu3 = new Student(3, "Bob", 85);
		
		// 1. ArrayList
		List<Student> studentList = new ArrayList<>();
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
		System.out.println();
		
		// 2. HashSet(출력 순서 없음)
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(stu1);
		studentSet.add(stu2);
		studentSet.add(stu3);
		studentSet.add(stu3); // 중복 (무시됨)
		
		for (Student student : studentSet) {
			System.out.println(student.getStudentId() + " " + student.getName() 
							+ " " + student.getScore());
		}
		System.out.println();
		Iterator<Student> iter = studentSet.iterator();
		while(iter.hasNext()) {
			Student stu = iter.next();
			System.out.println(stu.getStudentId() + " " + stu.getName() 
						+ " " + stu.getScore());
		}
		System.out.println();
		
		// 3. HashMap<Key, Value>
		Map<Integer, Student> studentMap = new HashMap<>();
		// map에 학생 객체 저장(추가)
		studentMap.put(stu1.getStudentId(), stu1);
		studentMap.put(stu2.getStudentId(), stu2);
		studentMap.put(stu3.getStudentId(), stu3);
		
		for (Integer key : studentMap.keySet()) { // key를 담고 있는 Set반환
			System.out.println(studentMap.get(key).getStudentId() + "\t" 
					+ studentMap.get(key).getName() + "\t" 
					+ studentMap.get(key).getScore());
			//System.out.println(key + " - " + studentMap.get(key).toString());
		}
		System.out.println();
		
		Set<Integer> key = studentMap.keySet(); // 1. 키만 선별해서 Set<K> 반환
		Iterator<Integer> sIter = key.iterator(); // 반복자 얻음
		while(sIter.hasNext()) {
			Integer k = sIter.next(); // key
			System.out.println(k + " - " + studentMap.get(k).getStudentId() + "\t" 
			+ studentMap.get(k).getName() + "\t" 
					+ studentMap.get(k).getScore());
			//System.out.println(k + " - " + studentMap.get(k).toString());
		}
	}
}