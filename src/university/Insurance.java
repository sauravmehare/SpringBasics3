package university;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Insurance {
	
	@Value("Life Insurance")
	private String policyName;
	@Value("1234.5")
	private float premium;
	

}
