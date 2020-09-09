package udemy.spring.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import udemy.spring.springdemo.Coach;

public class BeanCircleDemoApp {

public static void main(String[] args) {
		
		
		// load the spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCicle-applicationContext.xml");
		
		
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("theCoach getDailyFortune: " + theCoach.getDailyFortune());
		System.out.println("theCoach getDailyWorkout: " + theCoach.getDailyWorkout());
		
		//Note : For "prototype" scoped beans, Spring does not call the destroy method.  Gasp!  

		//close context
		
		context.close();
		
	}

}
