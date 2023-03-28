/**
 * 제네릭 클래스
 * - 사용시점에 타입 파라미터를 전달받고 그 형태로 클래스 내부 구조가 재편된다.(정해진다)
 * 
 * @param<T>
 */

package com.javalab.collection.pkg07_01;

import java.util.*;

public class Box<T> {

	// 필드
	private List<T> items;

	public Box() {
		this.items = new ArrayList<>();
	}

	public void addItem(T item) {
		this.items.add(item);
	}

	public List<T> getItems() {
		return this.items;
	}
}