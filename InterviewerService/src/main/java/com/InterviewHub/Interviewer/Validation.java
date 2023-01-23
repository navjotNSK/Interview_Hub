package com.InterviewHub.Interviewer;

import com.GLProduct.interviewer.Slot;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean validateSlotTimes(String start_time, String end_time) {

        if (validateTime(start_time) && validateTime(end_time)) {

            int start_time_hours = Integer.parseInt(start_time.substring(0, start_time.indexOf(":")));
            int end_time_hours = Integer.parseInt(end_time.substring(0, end_time.indexOf(":")));
            int start_time_minutes = Integer.parseInt(start_time.substring((start_time.indexOf(":")) + 1, start_time.indexOf(":") + 3));
            int end_time_minutes = Integer.parseInt(end_time.substring((end_time.indexOf(":")) + 1, end_time.indexOf(":") + 3));
            if (start_time.endsWith("am") || start_time.endsWith("AM")) {
                if (end_time.endsWith("am") || end_time.endsWith("AM")) {
                    if (start_time_hours > end_time_hours) {
                        return false;
                    }
                    if (start_time_hours == end_time_hours) {
                        if (start_time_minutes < end_time_minutes) {
                            return false;
                        }
                    }
                }

            }
            if (start_time.endsWith("pm") || start_time.endsWith("PM")) {
                if (end_time.endsWith("am") || end_time.endsWith("AM")) {
                    return false;
                }
                if (start_time_hours == end_time_hours) {
                    if (start_time_minutes < end_time_minutes) {
                        return false;
                    }
                }
                if (start_time_hours > end_time_hours) {
                    return false;
                }

            }
            if (start_time.endsWith("pm") || start_time.endsWith("PM")) {
                if (end_time.endsWith("pm") || end_time.endsWith("PM")) {
                    if (start_time_hours > end_time_hours) {
                        return false;
                    }
                    if (start_time_hours == end_time_hours) {
                        if (start_time_minutes < end_time_minutes) {
                            return false;
                        }
                    }
                }}
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

    public static void validateEmail(String email) throws InvalidEmailException {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            throw new InvalidEmailException("email can't be void!!");
        if (!pat.matcher(email).matches()) {
            throw new InvalidEmailException("invaild email Format!!!");
        }
    }
    public static boolean validateDate(String date) {
        String regex = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        if(matcher.matches()) {
            return true;
        }
        return false;
    }

    public static void slotsValidation(List<Slot> ls) throws ParseException {
        List<Slot> ls1=new ArrayList<>();


     /*   ls.add(new Slot("11/11/2022","04:20:00","06:00:00"));
        ls.add(new Slot("11/11/2022","04:20:00","08:00:00"));
        ls.add(new Slot("11/11/2022","04:00:00","06:00:00"));
        ls.add(new Slot("12/11/2022","04:20:00","06:00:00"));
        ls.add(new Slot("12/11/2022","04:20:00","06:00:00"));

        ls.add(new Slot("12/11/2022","04:20:00","06:00:00"));
        ls.add(new Slot("11/11/2022","03:20:00","03:59:00"));
          */
        for (Slot s: ls){
            System.out.println(s.getDate()+"----"+s.getStartTime()+"---"+s.getEndTime());
        }
        System.out.println("=====================================");

        int i=0;
        ls=sort(ls);
        for (Slot s: ls){
            System.out.println(s.getDate()+"----"+s.getStartTime()+"---"+s.getEndTime());
        }
        System.out.println("=====================================");
        while(i+1< ls.size()){

            if (ls.get(i).getDate()==ls.get(i+1).getDate()){
                if (tf.parse(ls.get(i).getStartTime()).compareTo(tf.parse(ls.get(i+1).getStartTime()))==0) {
                  if( ls.get(i).getEndTime().equals( tf.format(Math.max(tf.parse(ls.get(i).getEndTime()).getTime(), tf.parse(ls.get(i + 1).getEndTime()).getTime())))) {
                      ls.remove(i+1);
                  } else {
                    ls.remove(i );}
                }else if (tf.parse(ls.get(i).getStartTime()).compareTo(tf.parse(ls.get(i+1).getStartTime()))==-1) {
                    if (tf.parse(ls.get(i).getEndTime()).compareTo(tf.parse(ls.get(i + 1).getStartTime())) == 1) {
                        String t= tf.format(Math.max(tf.parse(ls.get(i).getEndTime()).getTime(), tf.parse(ls.get(i + 1).getEndTime()).getTime()));
                       ls.add(i, Slot.newBuilder().setDate(ls.get(i).getDate()).setStartTime(ls.get(i).getStartTime()).setEndTime(t).setSlotStatus(ls.get(i).getSlotStatus()).build());
                        ls.remove(i + 1);
                    }else{
                        i++;
                    }
                }else{
                    i++;
                }



            }else {
                i++;
            }
        }


        for (Slot s: ls){
            System.out.println(s.getDate()+"----"+s.getStartTime()+"---"+s.getEndTime());
        }

    }

    private static List<Slot> sort(List<Slot> list)
    {
        Collections.sort(list,(a,b)->{
            try {
                Date d1 = df.parse(a.getDate());
                Date a1=tf.parse(a.getStartTime());
                Date d2 = df.parse(a.getDate());
                Date a2=tf.parse(a.getEndTime());
                Date bd1 = df.parse(b.getDate());
                Date b1=tf.parse(b.getStartTime());


                Date bd2 = df.parse(b.getDate());

                Date b2=tf.parse(b.getEndTime());

                if(d1.compareTo(bd1)==0) {
                    if (a1.compareTo(b1) == 0)
                        return a2.compareTo(b2);
                    return a1.compareTo(b1);
                }else{
                    return d1.compareTo(bd1);
                }
            }  catch (ParseException e) {
                throw new RuntimeException(e);
            }



        });
        return list;

    }

    static DateFormat df=new SimpleDateFormat("yyyy/mm/dd");
    static DateFormat tf = new SimpleDateFormat("hh:mm a");



}
