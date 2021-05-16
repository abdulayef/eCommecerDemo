package eCommecerDemos.dataAccess.Abstracts;

import eCommecerDemos.entities.concretes.User;

public interface UserDaoService {
	void add(User user);
	boolean checkEmail(User user);
	boolean logincheck(String email, String password);

}
