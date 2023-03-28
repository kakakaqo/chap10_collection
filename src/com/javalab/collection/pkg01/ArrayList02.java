package com.javalab.collection.pkg01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {

	public static void main(String[] args) {

		// ArrayList 컬렉션 객체 생성(10칸짜리)
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(new Integer(5)); // 박싱
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		// public List<E> subList(...)
		// 1번째부터 4번째까지  5 4 2 0 1 3 -> 5 4 2 0 까지 
 		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4)); // [4, 2, 0]
		print(list1, list2);
		System.out.println();

		// 정렬(String)
		// list1과 list2를 정렬한다
		Collections.sort(list1); 
		Collections.sort(list2); // Collections.sort(List l)
		print(list1, list2);

	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
	}
}