package ex04;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

import ex03.MemberDAO;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("collection-context.xml");
		
		Customer customer = ctx.getBean(Customer.class);
		List<String> list = customer.getLists();
		
		System.out.println(list.toString());
		
		Map<String, Object> map = customer.getMap();
		
		System.out.println(map.toString());
		
		
		List<MemberDAO> list2 = customer.getDao();
		System.out.println(list2.toString());
		
	}
	
}
