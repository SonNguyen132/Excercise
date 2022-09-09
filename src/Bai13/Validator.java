package Bai13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static void checkBirthDay(String birthday) throws BirthDayException{
        String regex = "^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(birthday);
        if(!matcher.find()){
            throw new BirthDayException("Invalid");
        }
//        else {
//            System.out.println("Valid");
//        }

    }

    public static void checkFullname(String fullname) throws FullNameException{
        String regex = "[a-zA-Z]+\\.?";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(fullname);
        if (!matcher.find()){
            throw new  FullNameException("Invalid");
        }
//        else {
//            System.out.println("valid");
//        }
    }

    public static void checkPhone(String phone) throws PhoneException{
        String regex = "^((090)|(098)|(091)|(031)|(035)|(038)){1}\\\\d{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        if(matcher.find()){
            throw new PhoneException("Invalid");
        }
//        else {
//           System.out.println("Valid");
//        }
    }

    public static void checkEmail(String email) throws EmaiException{
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.find()){
            throw new EmaiException("Invalid");
        }
//        else {
//            System.out.println("Valid");
//        }
    }
}
