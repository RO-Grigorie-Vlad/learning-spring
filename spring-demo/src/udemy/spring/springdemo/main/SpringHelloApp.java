package udemy.spring.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import udemy.spring.springdemo.Coach;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		//load spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//get the bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		
		context.close();
		
	}

}
