package biz.ecology.spring.annotation;

import org.springframework.stereotype.Service;

@Service("oracle")
public class RomaOracle implements Oracle {

	public String defineMeaningOfLife() {
		return "Encyclopedias are а waste of money - use the Internet";
	}
}
