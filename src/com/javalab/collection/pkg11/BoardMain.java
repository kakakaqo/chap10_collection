/**
 * 배열과 ArrayList 차이점 
 * - 배열 수를 늘릴수가 없다
 * - ArrayList 는 수를 변경할수 있다 
 */

package com.javalab.collection.pkg11;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {


		// 게시물 객체를 저장할 ArrayList 선언
		List<Board> ArrayList = new ArrayList<>();
		
		// ArrayList에 게시물 저장
		ArrayList.add(new Board(100, "객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요", "김정희", "2023.03.03", 84));
		ArrayList.add(new Board(101, "객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버", "최윤희", "2021.07.21", 99));
		ArrayList.add(new Board(102, "클래스와 객체지향 프로그래밍(Object Oriented Programming)", "우성민", "2020.06.10", 264));
		ArrayList.add(new Board(103, "[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77));
		ArrayList.add(new Board(104, "Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94));
		ArrayList.add(new Board(105, "배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70));
		ArrayList.add(new Board(106, "배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80));
		ArrayList.add(new Board(107, "문자열(장문) 처리하기", "성수정", "2019.12.30", 56));
		ArrayList.add(new Board(108, "[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2020.05.17", 84));
		ArrayList.add(new Board(109, "[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64));
		ArrayList.add(new Board(110, "다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94));
		ArrayList.add(new Board(111, "제어문 반복문", "정연남", "2022.08.03", 84));
		ArrayList.add(new Board(112, "연산자(Operator)", "최정빈", "2020.01.01", 64));
		ArrayList.add(new Board(113, "키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984));
		ArrayList.add(new Board(114, "변수와 자료형 #1", "이의정", "2022.09.03", 164));

		// 전체 회원 출력
		printAllBoard(ArrayList); // 모듈화

		// 우성민, 홍세나 출력
		List<Board> name = getBoardByName(ArrayList); // 반환받은 ArrayList (홍세나, 우성민)
		for (Board arrayList : name) {
			System.out.println(arrayList.getId() + "\t" + arrayList.getTitle() + "\t" + arrayList.getWriter() + "\t"
					+ arrayList.getDate() + "\t" + arrayList.getHitcount());
		}
		System.out.println();

		// 배열과 관련된 게시물 출력
		printBoard(ArrayList);

		// 조회수가 가장 큰 게시물
		printHitCountBoard(ArrayList);

		// set 컬렉션
		printSetBoard(ArrayList);

		// map
		printMapBoard(ArrayList);
	}

	// map 메소드
	private static void printMapBoard(List<Board> arrayList) {
		System.out.println("6. HashMap을 통하여 전체 개시물 출력");
		Map<Integer, Board> mapa = new HashMap<>();
		for (Board board : arrayList) {
			mapa.put(board.getId(), board);
			System.out.println(board.getId() + "\t" + board.getTitle() + "\t" + board.getWriter() + "\t"
					+ board.getDate() + "\t" + board.getHitcount());
		}
		System.out.println();
		
		for (Integer id : mapa.keySet()) {
			System.out.println(mapa.get(id).getId() + "\t" + mapa.get(id).getTitle() + "\t" + mapa.get(id).getWriter() + "\t"
					+ mapa.get(id).getDate() + "\t" + mapa.get(id).getHitcount());
		}
	}

	// set컬렉션 메소드
	private static void printSetBoard(List<Board> arrayList) {
		System.out.println("5. HashSet을 통하여 전체 게시물 출력");
		Set<Board> setboard = new HashSet<>(arrayList);
		for (Board board : setboard) {
			System.out.println(board.getId() + "\t" + board.getTitle() + "\t" + board.getWriter() + "\t"
					+ board.getDate() + "\t" + board.getHitcount());
		}
		System.out.println();
	}

	// 조회수가 가장 큰 게시물 메소드
	private static void printHitCountBoard(List<Board> arrayList) {
		int max = 0;
		int a = 0;
		System.out.println("4. 조회수가 가장 큰 게시물 출력");
		for (Board board : arrayList) {
			if (board.getHitcount() > max) {
				max = board.getHitcount();
				a = board.getId();
			}
		}
		System.out.println("찾아진 인덱스 : " + a);
		for (Board board : arrayList) {
			if(board.getId() == a) {
				System.out.println(board.getId() + "\t" + board.getTitle() + "\t" + board.getWriter() + "\t"
						+ board.getDate() + "\t" + board.getHitcount());
			}
		}
		System.out.println();

	}

	// 배열과 관련된 게시물 출력 메소드
	private static void printBoard(List<Board> arrayList) {
		System.out.println("3. 배열과 관련된 게시물 출력");
		for (Board board : arrayList) {
			if (board.getTitle().contains("배열")) {
				System.out.println(board.getId() + "\t" + board.getTitle() + "\t" + board.getWriter() + "\t"
						+ board.getDate() + "\t" + board.getHitcount());
			}
		}
		System.out.println();
	}

	// 우성민, 홍세나 출력 메소드
	private static List<Board> getBoardByName(List<Board> arrayList) {
		System.out.println("2. 우성민, 홍세나가 작성한  게시물위 목록을 출력");
		List<Board> name = new ArrayList<>();
		for (Board board : arrayList) {
			if (board.getWriter().equals("우성민") || board.getWriter().equals("홍세나")) {
				name.add(board);
			}
		}
		return name; // 우성민 홍세나가 작성한 게시물을 담은 ArrayList 반환
	}

	// 전체 게시물 출력 메소드
	private static void printAllBoard(List<Board> arrayList) {
		System.out.println("1. 일반for문으로 전체 게시물 출력");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(
					arrayList.get(i).getId() + "\t" + arrayList.get(i).getTitle() + "\t" + arrayList.get(i).getWriter()
							+ "\t" + arrayList.get(i).getDate() + "\t" + arrayList.get(i).getHitcount());
		}
		System.out.println();

		System.out.println("1. 향상된for문으로 전체 게시물 출력");
		for (Board board : arrayList) {
			System.out.println(board.getId() + "\t" + board.getTitle() + "\t" + board.getWriter() + "\t"
					+ board.getDate() + "\t" + board.getHitcount());
		}
		System.out.println();
	}
}