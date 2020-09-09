package udemy.spring.springdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		List<String> fortuneList =  new ArrayList<String>();
		fortuneList.add("You will have good luck today");
		fortuneList.add("You will have bad luck today");
		fortuneList.add("You will have a normal day");
		
		int rnd = new Random().nextInt(fortuneList.size());
	    
		return fortuneList.get(rnd);
	}

}
