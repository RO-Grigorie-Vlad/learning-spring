package udemy.spring.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import udemy.spring.springdemo.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout()); 
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getRandomFortune());
		
		
		//close the context
		context.close();
	}

}
