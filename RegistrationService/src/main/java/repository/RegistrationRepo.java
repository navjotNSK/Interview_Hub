package repository;

import java.util.List;

public interface RegistrationRepo {

	public boolean addUser(String userName , long phoneNo , String emailId , String userPassword , String userRole , String techStack , String jobRole )  ;
	public boolean updateUser(String userName , long phoneNo , String emailId , String userPassword , String userRole , String techStack , String jobRole);
	public boolean deleteUser(String emailId );
	public List<String> getUserByMail(String emailId);
	public List<List<String>> getUsersByTechStack(String techStack);
}

