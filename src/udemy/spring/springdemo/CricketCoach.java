package udemy.spring.springdemo;

import udemy.spring.springdemo.service.FortuneService;
import udemy.spring.springdemo.service.RandomFortuneService;

public class CricketCoach implements Coach {
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside the cricketCoach constructor");
	}
	
	
	private FortuneService fortuneService;
	private RandomFortuneService randomFortuneService;
	
	//adding new fields for emails and team
	private String email;
	private String team;
	
	public RandomFortuneService getRandomFortuneService() {
		return randomFortuneService;
	}

	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		System.out.println("CricketCoach: Inside the setRandomFortuneService()");
		this.randomFortuneService = randomFortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: Inside the setEmail()");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside the setTeam()");
		this.team = team;
	}


	public void setFortuneService (FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside the setFortuneService()");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	public String getRandomFortune() {
		
		return randomFortuneService.getFortune();
		
	}

}
