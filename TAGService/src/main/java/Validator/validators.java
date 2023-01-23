package validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validators {
	
	public static boolean validateEmail(String email) {

//	    There should be at least one dot in the domain name.
//	    In the domain name, after the dot, only the letters would continue.
//	    Length of domain name should be between 2- 6 letters.

		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[\\a-zA-Z]{2,6}";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	
//	match “mm/dd/yyyy” with required leading zeros
	
	public static boolean validateDate(String date) {
		String regex = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(date);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	
	public static boolean validateTime(String time) {
		
		String regex = "\\b(1[012]|0?[1-9]):([0-5]?[0-9])(\\s)?([Aa]|[pP])[mM]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(time);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	
	
	public static boolean validateStartAndEndTime(String start_time,String end_time) throws ParseException
	{
		
		SimpleDateFormat sdf= new SimpleDateFormat("hh:mm a");
		
		Date startTime= sdf.parse(start_time);
		Date endTime = sdf.parse(end_time);
		
		//find Duration
		long interviewDuration = (endTime.getTime()-startTime.getTime())/(3600000); // calculate duartion in hours;
		
		if(interviewDuration >0)return true;
		return false;
	}
	
}
