package eCommecerDemos;

import eCommecerDemos.business.abstracts.UserService;
import eCommecerDemos.business.concretes.UserManager;
import eCommecerDemos.core.concretes.GoogleUserVerificationAdapter;
import eCommecerDemos.core.concretes.ValidatorManager;
import eCommecerDemos.core.concretes.VerificationManager;
import eCommecerDemos.dataAccess.concretes.UserDao;
import eCommecerDemos.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Semanur", "Hut", "semanur@gmail.com", "12345");
		

		UserService service = new UserManager(new VerificationManager(), new UserDao(), new ValidatorManager());

		System.out.println("Kayıt başarılı");
		System.out.println("----------");
		service.register(user1);
		service.login(user1.getEmail(), user1.getPassword());

		

		UserService service2 = new UserManager(new GoogleUserVerificationAdapter(), new UserDao(), new ValidatorManager());
		
		System.out.println("Google kaydı başarılı.");
		System.out.println("----------");
		
	}

}
