package eCommecerDemos.core.concretes;

import eCommecerDemos.core.abstracts.ValidatorService;

public class ValidatorManager implements ValidatorService{

	@Override
	public void verificationMail() {
		System.out.println("Do�rulama emaili g�nderilmi�tir. E-postan�z� kontrol ediniz.");
		
	}
	

}
