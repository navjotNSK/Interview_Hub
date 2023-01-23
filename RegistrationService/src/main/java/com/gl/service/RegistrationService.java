package com.gl.service;
import java.util.ArrayList;
import java.util.List;

import com.gl.grpc.addRequest;
import com.gl.grpc.addResponse;
import com.gl.grpc.deleteRequest;
import com.gl.grpc.deleteResponse;
import com.gl.grpc.getUserByMailRequest;
import com.gl.grpc.getUserByMailResponse;
import com.gl.grpc.getUserByTechRequest;
import com.gl.grpc.getUserByTechResponse;
import com.gl.grpc.updateRequest;
import com.gl.grpc.updateResponse;
import com.gl.grpc.userProfile;
import com.gl.registration.registrationServicesGrpc;

import exception.FieldNotNullException;
import exception.UserAlreadyExistsException;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import repository.RegistrationRepoImpl;
import validations.Validator;


public class RegistrationService extends registrationServicesGrpc.registrationServicesImplBase{
	RegistrationRepoImpl regRepo = new RegistrationRepoImpl();
    

	@Override
	public void addUser(addRequest request, StreamObserver<addResponse> responseObserver) {
		

		String userName =  request.getUserName();
		long phoneNo = request.getPhoneNo();
	    String emailId = request.getEmailId();
	    String userPassword = request.getUserPassword();
	    String userRole = request.getUserRole();
	    String techStack = request.getTechStack();
		String jobRole = request.getJobRole();
		
		try {
		if(userName.isEmpty() || emailId.isEmpty() || userPassword.isEmpty() || phoneNo == 0 || userRole.isEmpty()  || jobRole.isEmpty()  ){
	    throw new FieldNotNullException("Field cannot be empty, Please Enter all details");
			
	}
		if(userRole.equalsIgnoreCase("interviewer") && techStack.isEmpty()) {
			throw new FieldNotNullException("Field cannot be empty, Please Enter all details");
		}
		
		}catch(FieldNotNullException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
			responseObserver.onError(Status.INVALID_ARGUMENT.
		            withDescription("Please Enter all details").
		            asRuntimeException());
		    return;
		}
		
		
		
		List<String > user = regRepo.getUserByMail(emailId);
		try {
		if(!user.isEmpty()) {
			throw new UserAlreadyExistsException("User already exits.");
		}
		}catch(UserAlreadyExistsException e) {
			System.out.println(e.getMessage());
			responseObserver.onError(io.grpc.Status.ALREADY_EXISTS.withDescription("User with " + emailId +" already exists.").asRuntimeException());
		    return;
		}
		
	
		addResponse.Builder addRes = addResponse.newBuilder();
		
		//Phone no should by 10 digits.
		if(!Validator.validatePhoneNo(phoneNo)) {
//			addRes.setResponseMessage("Please check your phone number").setResponseCode(203).build();
			responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Please check your phone no.").asRuntimeException());
	        return;
		}else if(!Validator.validateEmail(emailId)) {
//			addRes.setResponseMessage("Please check your email id").setResponseCode(203).build();
			responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Please check your email id.").asRuntimeException());
	        return;
			
			//Validation user Password - It contains at least 8 characters and at most 20 characters at least one digit , at least one upper case alphabet , at least one lower case alphabet , at least one special character which includes !@#$%&*()-+=^. , doesn’t contain any white space.
		}else if(!Validator.validatePassword(userPassword)) {
//	    	addRes.setResponseMessage("Please check your password").setResponseCode(203).build();
			responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Please check your password.").asRuntimeException());
	        return;
			
		}else {
		
			boolean res = regRepo.addUser(userName, phoneNo, emailId, userPassword, userRole, techStack, jobRole);
			
		if(res == true) {
			String resp = "Username - " + userName + " " + "Phone No - " + phoneNo +" "+ "Emaild Id - " + emailId
					+ " "+ "User Password - " + userPassword + " "+"User Role - " + userRole + " " + "Tech Stack - "
					+ techStack + " "+"Job Role - " + " " + jobRole;
		addRes.setResponseMessage(resp + " added.").setResponseCode(201);
		}else {
			addRes.setResponseMessage("User not added.").setResponseCode(202);
		}
		}
		 responseObserver.onNext(addRes.build());
	        responseObserver.onCompleted();
	}

	@Override
	public void updateUser(updateRequest request, StreamObserver<updateResponse> responseObserver) {
		// TODO Auto-generated method stub
		String userName =  request.getUserName();
		long phoneNo = request.getPhoneNo();
	    String emailId = request.getEmailId();
	    String userPassword = request.getUserPassword();
	    String userRole = request.getUserRole();
	    String techStack = request.getTechStack();
		String jobRole = request.getJobRole();
		
		
		
		try {
//		if(userName.isEmpty() || emailId.isEmpty() || userPassword.isEmpty() || phoneNo == 0 || userRole.isBlank() || techStack.isEmpty() || jobRole.isEmpty()  ){
//			throw new FieldNotNullException("Email cannot be empty, Please Enter all details"); 
//		}
		if( emailId.isEmpty()  ){
			throw new FieldNotNullException("Email cannot be empty, Please Enter all details"); 
		}
		}catch(FieldNotNullException e) {
			System.out.println(e.getMessage());
			 responseObserver.onError(Status.INVALID_ARGUMENT.
			            withDescription("Please Enter Email").
			            asRuntimeException());
			    return;
		}
		
		
		updateResponse.Builder updateRes = updateResponse.newBuilder();
		
		
//		try{
		
		//Phone no should by 10 digits.
		if(!Validator.validatePhoneNo(phoneNo) &&  !String.valueOf(phoneNo).isEmpty()) {
//			updateRes.setResponseMessage("Please check your phone number").setResponseCode(203).build();
			responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Please check your phone no.").asRuntimeException());
	        return;
		}else if(!Validator.validateEmail(emailId) && !emailId.isEmpty()) {
//			updateRes.setResponseMessage("Please check your email id").setResponseCode(203).build();
			responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Please check your email id.").asRuntimeException());
	        return;
			
			//Validation user Password - It contains at least 8 characters and at most 20 characters at least one digit , at least one upper case alphabet , at least one lower case alphabet , at least one special character which includes !@#$%&*()-+=^. , doesn’t contain any white space.
		}else if(!Validator.validatePassword(userPassword)  && !userPassword.isEmpty()) {
//			updateRes.setResponseMessage("Please check your password").setResponseCode(203).build();
			responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Please check your password.").asRuntimeException());
	        return;
			
		}else {
		
			List<String > user = regRepo.getUserByMail(emailId);
			
		if(user.isEmpty()) {
//			updateRes.setResponseMessage("User not updated.").setResponseCode(203).build();
			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("User with " + emailId +" not present.").asRuntimeException());
		    return;
//			throw new Exception("End user tried to fetch the mail - "+ emailId + " which is not present.");
			
			//If return; is uncommented then exception is not coming on console else its coming.
		
		}else {
			boolean res = regRepo.updateUser(userName, phoneNo, emailId, userPassword, userRole, techStack, jobRole);
			
		
		if(res == true) {
			String resp = "Username - " + userName + " " + "Phone No - " + phoneNo +" "+ "Emaild Id - " + emailId
					+ " "+ "User Password - " + userPassword + " "+"User Role - " + userRole + " " + "Tech Stack - "
					+ techStack + " "+"Job Role - " + " " + jobRole;
			updateRes.setResponseMessage(resp + " updated.").setResponseCode(201);
		}else {
			updateRes.setResponseMessage("User not updated.").setResponseCode(202);
		}
		
		
	       
		}
		}
		 responseObserver.onNext(updateRes.build());
	        responseObserver.onCompleted();
	        
	        
//		}catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}  
		
		
	}

	@Override
	public void deleteUser(deleteRequest request, StreamObserver<deleteResponse> responseObserver) {
		String emailId = request.getEmailId();
		
		try {
		if(emailId.isEmpty()  ){
			throw new FieldNotNullException("Field cannot be empty, Please Enter all details"); 
		
	
		}
		}catch(FieldNotNullException e) {
			System.out.println(e.getMessage());
		    responseObserver.onError(Status.INVALID_ARGUMENT.
		            withDescription("Please Enter all details").
		            asRuntimeException());
		    return;
		}
		
		if(!Validator.validateEmail(emailId)) {
			responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Please check your email id.").asRuntimeException());
	        return;
		}
		deleteResponse.Builder deleteRes = deleteResponse.newBuilder();
		
		List<String > user = regRepo.getUserByMail(emailId);
		if(user.isEmpty()) {
//			deleteRes.setResponseMessage("User not deleted.").setResponseCode(203);
//			responseObserver.onNext(deleteRes.build());
			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("User with " + emailId +" not present.").asRuntimeException());
//		    responseObserver.onError(Status.NOT_FOUND.withDescription("").asException());
			
		    return;
		}
		
		boolean res = regRepo.deleteUser(emailId);
		if(res == true) {
			String resp =  "Record with Emaild Id - " + emailId;
			deleteRes.setResponseMessage(resp + " deleted.").setResponseCode(201);
		}else {
			deleteRes.setResponseMessage("User not deleted.").setResponseCode(202);
		}
		 responseObserver.onNext(deleteRes.build());
	        responseObserver.onCompleted();
		
	}

	@Override
	public void getUserByMail(getUserByMailRequest request, StreamObserver<getUserByMailResponse> responseObserver) {
		String emailId = request.getEmailId();
		
		try {
		if(emailId.isEmpty()  ){
			throw new FieldNotNullException("Field cannot be empty, Please Enter all details"); 
	
		}
		}catch (FieldNotNullException e) {
			System.out.println(e.getMessage());
			  responseObserver.onError(Status.INVALID_ARGUMENT.
			            withDescription("Please Enter all details").
			            asRuntimeException());
			    return;
		}
		
		if(!Validator.validateEmail(emailId)) {
			responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Please check your email id.").asRuntimeException());
	        return;
		}
		
		
		getUserByMailResponse.Builder userRes = getUserByMailResponse.newBuilder();
		List<String> user = regRepo.getUserByMail(emailId);
		if(!user.isEmpty()) {
			
		userRes.setUserName(user.get(0)).setPhoneNo(Long.parseLong(user.get(1))).setEmailId(user.get(2)).
		setUserPassword(user.get(3)).setUserRole(user.get(4)).setTechStack(user.get(5)).setJobRole(user.get(6));
		}else {
//			userRes.build();
			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("User with " + emailId +" not present.").asRuntimeException());
	        return;
		}
		responseObserver.onNext(userRes.build());
        responseObserver.onCompleted();
	}

	@Override
	public void getUsersByTechStack(getUserByTechRequest request,
			StreamObserver<getUserByTechResponse> responseObserver) {
		String techStack = request.getTechStack();
		
		try {
		if(techStack.isEmpty()  ){
			throw new FieldNotNullException("Field cannot be empty, Please Enter all details"); 
			
		}
		}catch(FieldNotNullException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		    responseObserver.onError(Status.INVALID_ARGUMENT.
		            withDescription("Please Enter all details").
		            asRuntimeException());
		    return;
		}
		
		
		
		List<List<String>> users = regRepo.getUsersByTechStack(techStack);
		getUserByTechResponse.Builder usersRes = getUserByTechResponse.newBuilder();
		List<userProfile> l = new ArrayList<userProfile>();
		if(!users.isEmpty()) {
//			userRes.setUserName(user.get(0)).setPhoneNo(Long.parseLong(user.get(1))).setEmailId(user.get(2)).
//			setUserPassword(user.get(3)).setUserRole(user.get(4)).setTechStack(user.get(5)).setJobRole(user.get(6));
		
			for(List<String> user : users) {
				
			userProfile.Builder userP = userProfile.newBuilder();
			
			userP.setUserName(user.get(0)).setPhoneNo(Long.parseLong(user.get(1))).setEmailId(user.get(2)).
			setUserPassword(user.get(3)).setUserRole(user.get(4)).setTechStack(user.get(5)).setJobRole(user.get(6));
            l.add(userP.build());
            
			
		}
		
			usersRes.addAllUserProfileArray(l);
		}else {
//				usersRes.build();
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("User with " + techStack +" not present.").asRuntimeException());
		return;	
		}
			responseObserver.onNext(usersRes.build());
	        responseObserver.onCompleted();
		
	}





}
