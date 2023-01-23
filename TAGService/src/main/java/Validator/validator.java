package Validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validator {
	
	public static boolean validateEmail(String email) {
//		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		

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
	
	public static boolean validatingStartEndTime(String start_time,String end_time){
		
        if(validateTime(start_time) && validateTime(end_time))

        {

            int start_time_hours=Integer.parseInt(start_time.substring(0,start_time.indexOf(":")));

            int end_time_hours=Integer.parseInt(end_time.substring(0,end_time.indexOf(":")));

            int start_time_minutes=Integer.parseInt(start_time.substring((start_time.indexOf(":"))+1,start_time.indexOf(":")+3));

            int end_time_minutes=Integer.parseInt(end_time.substring((end_time.indexOf(":"))+1,end_time.indexOf(":")+3));

            if(start_time.endsWith("am")||start_time.endsWith("AM"))

            {

                if(end_time.endsWith("am")|| end_time.endsWith("AM"))

                {

                    if(start_time_hours>end_time_hours)

                    {

                        return false;

                    }

                    if(start_time_hours==end_time_hours)

                    {

                        if(start_time_minutes<end_time_minutes)

                        {

                            return false;

                        }

                    }

                }


            }

            if(start_time.endsWith("pm")||start_time.endsWith("PM"))

            {

                if(end_time.endsWith("am")||end_time.endsWith("AM"))

                {

                    return false;

                }

                if(start_time_hours==end_time_hours)

                {

                   if(start_time_minutes<end_time_minutes)

                   {

                       return false;

                   }

                }

                if(start_time_hours>end_time_hours)

                {

                    return false;

                }


	        }
	
		
        }
		return true;
	
	}
	
}
