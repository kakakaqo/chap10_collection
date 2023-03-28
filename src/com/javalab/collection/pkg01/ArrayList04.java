/**
 * Board 클래스를 사용한 예제
 * [Raw Data]
   "제목1", "내용1", "글쓴이1"
   "제목2", "내용2", "글쓴이2"
   "제목3", "내용3", "글쓴이3"
   "제목4", "내용4", "글쓴이4"
   "제목5", "내용5", "글쓴이5"
 */

package com.javalab.collection.pkg01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {

		// ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();

		// 객체 추가
		Board board1 = new Board("제목1", "내용1", "글쓴이1");
		Board board2 = new Board("제목2", "내용2", "글쓴이2");
		Board board3 = new Board("제목3", "내용3", "글쓴이3");
		Board board4 = new Board("제목4", "내용4", "글쓴이4");
		Board board5 = new Board("제목5", "내용5", "글쓴이5");

		list.add(board1);
		list.add(board2);
		list.add(board3);
		list.add(board4);
		list.add(board5);

		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 " + size);
		System.out.println();

		// 2번째 인덱스의 객체 가져와서 출력하기
		Board board = list.get(2);
//		System.out.println("두번째 인덱스 : " + board.getSubject() 
//				+ " " + board.getContent() + " " + board.getWriter());
		System.out.println(board.toString());
		System.out.println();

		// 객체 삭제
		list.remove(2);
		list.remove(2);

//		 일반 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSubject() + " " 
					+ list.get(i).getContent() + " " + list.get(i).getWriter());
		}
		System.out.println();
//		
//		// 향상된  for문
//		for (Board board : list) {
//			System.out.println(board.getSubject() + " " 
//					+ board.getContent() + " " + board.getWriter());
//		}
		
		// "제목11", "내용11", "글쓴이11" <- list 인덱스 1번에 넣으세요
		list.set(1, new Board("제목11", "내용11", "글쓴이11"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}

}

class Board {

	private String subject;
	private String content;
	private String writer;

	public Board() {
		super();
	}

	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() { // Object 상속받음
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
}