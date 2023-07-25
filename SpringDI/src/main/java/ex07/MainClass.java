package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

public class MainClass {

	public static void main(String[] args) {
		
		
		//자바 설정 파일을 읽을 때
		AnnotationConfigApplicationContext atx =
				new AnnotationConfigApplicationContext(JavaConfig.class); //컨테이너 클래스를 꺼내는 것!?!
		
		Hotel hotel = atx.getBean(Hotel.class);
		hotel.getChef().cooking();
		
		DatabaseDev  dev = atx.getBean(DatabaseDev.class);
		System.out.println(dev.getUrl());
		System.out.println(dev.getUid());
		System.out.println(dev.getUpw());
		
		MemberDAO dao = atx.getBean(MemberDAO.class);
		System.out.println(dao.getDataSource().getUrl());
		System.out.println(dao.getDataSource().getUid());
		System.out.println(dao.getDataSource().getUpw());
		
		
		
		
		
		
		
	}
	
	
}
