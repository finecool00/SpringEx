package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	@Autowired
	@Qualifier("document1") //빈 이름을 강제연결
	private Document document;
	
	/*
	 * @Autowired
	 * - 멤버변수, 생성자, setter 모두 사용
	 * - bean중에서 주입될 수 있는 적합한 타입을 찾아서 자동 주입
	 */
	
	
	
	//기본생성자(필요함)
	public Printer() {};
	
	//생성자 주입 OK
	public Printer(Document document) { //주입될 수 있는 값(Document 타입)을 bean에서 찾는다
		this.document = document;
	}
	
	//getter, setter 통한 주입 OK
	public void setDocument(Document document) {
		this.document = document;
	}
	
	public Document getDocument() {
		return document;
	}
}
