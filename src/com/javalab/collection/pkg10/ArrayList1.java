package com.javalab.collection.pkg10;

import java.util.*;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		// 문제 1
		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);
//		list.add(10);
//		
		for(int i = 0; i <= 10; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}
		System.out.println();
		
//		for (Integer inte : list) {
//			System.out.println(inte);
//		}
//		System.out.println();
		
		// 문제 2
		List<String> car = new ArrayList<>();
		car.add("Volvo");
		car.add("Benz");
		car.add("BMW");
		car.add("Hyundai");
		
		for (String ca : car) {
			System.out.println(ca);
		}
		System.out.println();
		
		// 문제 3
		List<Student> liststudent = new ArrayList<>();
		liststudent.add( new Student("1234", "123456-1234567", "홍길동", 3, "천안", 210));
		liststudent.add( new Student("5678", "987456-2334567", "김길동", 4, "대전", 220));
		liststudent.add( new Student("8970", "357556-2334789", "이길동", 1, "서울", 230));
		
		for (Student stu : liststudent) {
			System.out.println(stu.getStudentId() + "\t" + stu.getJumin() + "\t" 
					+ stu.getName() + "\t" + stu.getYear() + "\t" 
					+ stu.getJuso() + "\t" + stu.getDepartment());
			//System.out.println(stu.toString());
		}
		
	}
}