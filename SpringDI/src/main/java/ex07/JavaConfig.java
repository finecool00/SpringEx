package ex07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;
import ex05.Document;
import ex05.Printer;

@Configuration
public class JavaConfig {
	
	//<bean id="test" class="ex01.SpringTest"/>
	@Bean
	public SpringTest test() {
		return new SpringTest();
	}
	
	//<bean id="chef" class="ex02.Chef"/>
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	@Bean
	/*
	 * <bean id="hotel" class="ex02.Hotel">
	 * 	  <constructor-arg ref="chef"/>
	 * </bean>
	 */
	
	public Hotel hotel() {
		return new Hotel(chef());
	}
	
	/*
	 * <bean id="dev" class="ex03.DatabaseDev">
	 *    <property name="url" value="jdbc:mysql://localhost~~"/>
	 *    <property name="uid" value="coding404"/>
	 *    <property name="upw" value="1234"/>
	 * </bean>
	 */
	
	@Bean
	public DatabaseDev dev() {
		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("자바파일로 생성! 변환!!");
		dev.setUid("hello");
		dev.setUpw("world:p");
		
		return dev;
	}
	
	/*
	 * <bean id="memberDAO" class="ex03.MemberDAO">
	 *    <property name="dataSource" ref="dev"/>
	 * </bean>
	 */
	
	@Bean
	public MemberDAO dao() {
		MemberDAO dao = new MemberDAO();
		dao.setDataSource(dev());
		
		return dao;
	}
	
	/*
	 * <bean id="document1" class="ex05.Document"/> 
	 * <bean id="document2" class="ex05.Document"/>
	 */
	
	@Bean
	public Document document1() {
		return new Document();
	}
	@Bean
	public Document document2() {
		return new Document();
	}
	
	//<bean class="ex05.Printer"/>
	
	@Bean
	public Printer printer() {
		return new Printer();
	}
	
	
	/* 리스트, 맵 빈 만들어보기
	 * @Bean public Customer customer() {
	 * 
	 * }
	 */
	
	
	
}
