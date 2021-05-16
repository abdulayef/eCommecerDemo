package eCommecerDemos.business.concretes;

import eCommecerDemos.business.abstracts.UserService;
import eCommecerDemos.core.abstracts.ValidatorService;
import eCommecerDemos.core.abstracts.VerificationService;
import eCommecerDemos.dataAccess.Abstracts.UserDaoService;
import eCommecerDemos.entities.concretes.User;

public class UserManager implements UserService{
	
	VerificationService verificationService;
	UserDaoService userDaoService;
	ValidatorService validatorService;

	public UserManager(VerificationService verificationService, UserDaoService userDaoService,
			ValidatorService validatorService) {

		this.verificationService = verificationService;
		this.userDaoService = userDaoService;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if (!verificationService.isValid(user)) {
			System.out.println("Kay�t ba�ar�s�z. �stenilen �artlara uymad�n�z.");
		}else if(!userDaoService.checkEmail(user)) {
			System.out.println("Bu email adresi al�nm�yor. Farkl�  bir email adresi giriniz.");
		}else {
			userDaoService.add(user);
			validatorService.verificationMail();
		}
		
	}

	@Override
	public void login(String email, String password) {
		if (userDaoService.logincheck(email, password)) {
			System.out.println("Giri� ba�ar�l�.");
		} else {
			System.out.println("Giri� ba�ar�s�z. ");
		
	}
	}

}
