package udemy.spring.springdemo;


public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "You will have good luck today";

	}

}
