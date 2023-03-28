package com.javalab.collection.pkg11;

public class Board {

	// 필드
	private int id; // 게시물 번호
	private String title; // 게시물 제목
	private String writer; // 작성자
	private String date; // 작성일
	private int hitcount; // 조회수

	// 기본 생성자 = 기본값으로 초기화
	public Board() {
		super();
	}
    // 오버로딩 생성자 = 초기화 하면서 전달된 객체 저장
	public Board(int id, String title, String writer, String date, int hitcount) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
	
	// 게터 세터 메소드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	// 디버깅용 toString()메소드 구현
	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", date=" + date + ", hitcount="
				+ hitcount + "]";
	}

}