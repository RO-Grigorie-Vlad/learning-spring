package udemy.spring.springdemo;

import udemy.spring.springdemo.service.FortuneService;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a mile!";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: " + fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartupStuff method");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside doMyCleanupStuff method");
	}
	
	
}
