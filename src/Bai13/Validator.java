package Bai13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static void checkBirthDay(String birthday) throws BirthDayException{
        String regex = "^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(birthday);
        if(matcher.find()){
            System.out.println("Valid");
        } else {
            throw new BirthDayException("Invalid");
        }

    }

    public static void checkFullname(String fullname) throws FullNameException{
        String regex = "[a-zA-Z]+\\.?";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(fullname);
        if (!matcher.find()){
            throw new  FullNameException("Invalid");
        }else {
            System.out.println("valid");
        }
    }

    public static void checkPhone(String phone) throws PhoneException{
        String regex = "^(0|\\\\+84)(\\\\s|\\\\.)?((3[2-9])|(5[689])|(7[06-9])" +
                "|(8[1-689])|(9[0-46-9]))(\\\\d)(\\\\s|\\\\.)?(\\\\d{3})(\\\\s|\\\\.)?(\\\\d{3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        if(matcher.find()){
            System.out.println("Valid");
        } else {
            throw new PhoneException("Invalid");
        }
    }

    public static void checkEmail(String email) throws EmaiException{
        String regex = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.find()){
            throw new EmaiException("Invalid");
        }else {
            System.out.println("Valid");
        }
    }
}
