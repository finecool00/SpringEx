package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("quiz-context.xml");
		
		Car car = ctx.getBean(Car.class);
		System.out.println("Car에 주입되는 배터리는 :");
		car.getBattery().energy();
		
		Airplane ap = ctx.getBean(Airplane.class);
		System.out.println("Airplane에 주입되는 배터리는 :");
		ap.getBattery().energy();
		
		
	}
	
}
