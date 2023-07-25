package ex01;

import java.util.Arrays;

import org.springframework.context.support.GenericXmlApplicationContext;

import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

public class MainClass {
	
	public static void main(String[] args) {
		
//		SpringTest st = new SpringTest();
//		st.hello();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		
		//1st
		SpringTest st = (SpringTest)ctx.getBean("test");
		st.hello();
		
		//클래스의 제네릭 타입을 확인하는 방법 - 클래스명.class해보면 알 수 있음
		Class<SpringTest> ass = SpringTest.class;
		
		//2nd
		SpringTest st2 = ctx.getBean(SpringTest.class);
		st2.hello();
		
		//1, 2 방법은 같다!
		System.out.println(st == st2);
		
		
//		Hotel hotel = ctx.getBean(Hotel.class);
//		hotel.getChef().cooking();
//	
//		
//		//
//		MemberDAO dao = ctx.getBean(MemberDAO.class);
//		
//		DatabaseDev dev = dao.getDataSource();
//		System.out.println(dev.getUrl());
//		System.out.println(dev.getUid());
//		System.out.println(dev.getUpw());
//		
//		//IOC컨테이너 안에 빈의 이름반환(xml파일에 정의한 빈 확인 가능)
//		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		
		
	}
}
