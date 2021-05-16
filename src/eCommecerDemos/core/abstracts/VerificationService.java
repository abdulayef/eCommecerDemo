package eCommecerDemos.core.abstracts;

import eCommecerDemos.entities.concretes.User;

public interface VerificationService {
	
	boolean isValid(User user);

}
