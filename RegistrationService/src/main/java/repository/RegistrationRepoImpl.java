package repository;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegistrationRepoImpl implements RegistrationRepo{
	Connection connection = null;
	public RegistrationRepoImpl(){
		
		try {
			String url = "jdbc:mysql://localhost:3306/InterviewHub";
			Class.forName("com.mysql.cj.jdbc.Driver");  
			connection = DriverManager.getConnection(url,"root","Root@123");
			System.out.println(connection != null ? "connection established" : "connection failed");
		} catch (ClassNotFoundException cnfe) {
			System.err.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {
			System.err.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}

	@Override
	public boolean addUser(String userName, long phoneNo, String emailId, String userPassword, String userRole,
			String techStack, String jobRole) {
		// TODO Auto-generated method stub
//		List<String> User = getUserByMail(emailId);
//		if(!User.isEmpty()) {
//			return false;
//		}
		
		
		String Query = "INSERT INTO logindetails VALUES(?,?,?,?,?,?,?)";

		
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(Query);
			
			prepareStatement.setString(1, userName);
			prepareStatement.setLong(2, phoneNo);
			prepareStatement.setString(3, emailId);
			prepareStatement.setString(4, userPassword);
			prepareStatement.setString(5, userRole);
//			prepareStatement.setArray(6, connection.createArrayOf("String", techStackArray));
			prepareStatement.setString(6, techStack);
			prepareStatement.setString(7, jobRole);
			
			
			
			int rowsAffected = prepareStatement.executeUpdate();
			
			if (rowsAffected > 0 ) {
				System.out.println(rowsAffected + " record inserted");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return false;
		
		
	}

	@Override
	public boolean updateUser(String userName, long phoneNo, String emailId, String userPassword, String userRole,
			String techStack, String jobRole) {
		List<String > user = getUserByMail(emailId);
		if(userName.isEmpty()) {
			userName = user.get(0);
		}
		if(String.valueOf(phoneNo).isEmpty() ) {
			phoneNo = Long.parseLong(user.get(1));
		}
		
		if(userPassword.isEmpty()) {
			userPassword = user.get(3);
		}
	    if(userRole.isEmpty()) {
		userRole = user.get(4);
	    }
	    if(techStack.isEmpty()) {
	    	techStack = user.get(5);
	    }
	    if(jobRole.isEmpty()) {
	    	jobRole = user.get(6);
	    }
		String Query = "UPDATE logindetails SET userName = ?, phoneNo = ?, userPassword = ?,userRole = ? , techStack = ? ,jobRole = ? WHERE emailId = ?";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(Query);
			prepareStatement.setString(1, userName);
			prepareStatement.setLong(2, phoneNo);
			
			prepareStatement.setString(3, userPassword);
			prepareStatement.setString(4, userRole);
			prepareStatement.setString(5, techStack);
			prepareStatement.setString(6, jobRole);
			prepareStatement.setString(7, emailId);
			
	int rowsAffected = prepareStatement.executeUpdate();
			
			if (rowsAffected > 0 ) {
				System.out.println(rowsAffected + " record updated");
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean deleteUser(String emailId) {
		// TODO Auto-generated method stub
		String Query = "DELETE FROM logindetails WHERE emailId = ?";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(Query);
			prepareStatement.setString(1, emailId);
            int rowsAffected = prepareStatement.executeUpdate();
			
			if (rowsAffected > 0 ) {
				System.out.println(rowsAffected + " record deleted");
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<String> getUserByMail(String emailId) {
		// TODO Auto-generated method stub
		List<String> User = new ArrayList<>();
		String Query = "SELECT * FROM logindetails WHERE emailId = ?";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(Query);
			prepareStatement.setString(1, emailId);
            
			
            ResultSet rs = prepareStatement.executeQuery();
    		if(rs.next()) {
    			User.add(rs.getString(1));
    			User.add(rs.getString(2));
    			User.add(rs.getString(3));
    			User.add(rs.getString(4));
    			User.add(rs.getString(5));
    			User.add(rs.getString(6));
    			User.add(rs.getString(7));
    		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return User;
	}

	@Override
	public List<List<String>> getUsersByTechStack(String techStack) {
//		String[] arr = techStack.split(",");
//		String techStack1 = "";
//		for(String str : arr) {
//			 techStack1 += "%" + str +  "%";
//		}
//		System.out.println(techStack1);
		String Query = "SELECT * FROM logindetails WHERE techStack like ?";
		List<List<String>> Users = new ArrayList<>(); 
		String techStack1 = "%" + techStack + "%";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(Query);
			prepareStatement.setString(1, techStack1);
			
			
            ResultSet rs = prepareStatement.executeQuery();
    		while(rs.next()) {
    			List<String> User = new ArrayList<>();
    			User.add(rs.getString(1));
    			User.add(rs.getString(2));
    			User.add(rs.getString(3));
    			User.add(rs.getString(4));
    			User.add(rs.getString(5));
    			User.add(rs.getString(6));
    			User.add(rs.getString(7));
    			Users.add(User);
    		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Users;
	}
	
	
	
}
