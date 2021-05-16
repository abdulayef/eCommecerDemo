package eCommecerDemos.core.concretes;

import eCommecerDemos.core.abstracts.ValidatorService;

public class ValidatorManager implements ValidatorService{

	@Override
	public void verificationMail() {
		System.out.println("Doðrulama emaili gönderilmiþtir. E-postanýzý kontrol ediniz.");
		
	}
	

}
