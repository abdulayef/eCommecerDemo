package eCommecerDemos.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommecerDemos.dataAccess.Abstracts.UserDaoService;
import eCommecerDemos.entities.concretes.User;

public class UserDao implements UserDaoService{
	List<User> users=new ArrayList<>();                    

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+ " "+user.getLastName()  + "kullan�c�s� kay�t edildi.");
		
	}

	@Override
	public boolean checkEmail(User user) {
		for( User u:users) {                        //B�t�n emailleri teker teker geziyor. 
			if(u.getEmail()==user.getEmail()) {
				System.out.println(u.getEmail() +"Kullan�lmaktad�r. ");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean logincheck(String email, String password) {
		for(User u:users) {
			if (u.getEmail()==email && u.getPassword()==password) {   // && = ve
				return false;
			}
				
			}
		return true;
	}                        //|| // Alt gr+ �izgi ile
	

}
