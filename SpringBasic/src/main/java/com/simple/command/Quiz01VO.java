package com.simple.command;

public class Quiz01VO {

	private String id;
	private String pw;
	
	//생성자
	Quiz01VO() {}

	public Quiz01VO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	//값 빨리 얻기~
	@Override
	public String toString() {
		return "Quiz01VO [id=" + id + ", pw=" + pw + "]";
	}

	
	//getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
	
	
}
