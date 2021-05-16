package eCommecerDemos.core.concretes;

import eCommecerDemos.Google.GoogleVerificationService;
import eCommecerDemos.core.abstracts.VerificationService;
import eCommecerDemos.entities.concretes.User;

public class GoogleUserVerificationAdapter implements VerificationService{

	@Override
	public boolean isValid(User user) {
		GoogleVerificationService googleUserValid =new 	GoogleVerificationService();
				
				return googleUserValid.isValidGoogle();
	}

}
