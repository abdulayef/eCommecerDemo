package eCommecerDemos.core.concretes;

import java.util.regex.Pattern;

import eCommecerDemos.core.abstracts.VerificationService;
import eCommecerDemos.entities.concretes.User;

public class VerificationManager  implements VerificationService{

	public boolean isValidName(String name) {
	if ( name == null || name.length()  <=2) {
		return false;
	}
	return true;
	}
	
	
	public boolean isValidEmail(String regexEmail) {
		
	String regexEmail1 = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regexEmail1);                 //Pattern=d�zenleme
	if (regexEmail == null) {
		return false;
	}
	return pattern.matcher(regexEmail1).matches();
    }
	
	
	public boolean isValidPassword(String password) {
		if( password == null || password.length() <=6 ) {
			return false;
		}
		return true;
	}
	
	
	@Override
	public boolean isValid(User user) {

           if(!isValidEmail(user.getEmail())) {
            	 System.out.println("Yanl�� email format�");
            	 return false;
               }
		
          if(!isValidName(user.getFirstName())) {
        	  System.out.println("�sminiz yanl�� girildi. ");
        	  return false;
          }
        	  
        	  
          
          if(!isValidPassword(user.getPassword())) {
        	  System.out.println("�ifre uzunlu�unuz en az 6 karakter olmal�");
        	  return false;
          }
          return true;
          
	}
}

















