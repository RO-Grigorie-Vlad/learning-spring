package udemy.spring.springdemo;

public class FitnessCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public FitnessCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {

		return "Do pullups for 4 sets of 12-10-10-8 reps";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	
	
	
}
