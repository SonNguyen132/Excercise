package Bai14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Invalidator {
    public static void checkPhone(String phone)throws InvalidPhoneNumberException{
        String regex = "^((090)|(098)|(091)|(031)|(035)|(038)){1}\\\\d{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        if (!matcher.find()){
            throw new InvalidPhoneNumberException("Invalid");
        }
        else System.out.println("Valid");
    }

    public static void checkFullname(String name) throws InvalidFullnameException{
        String regex = "^[a-zA-Z]{10,50}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if(!matcher.find()){
            throw new InvalidFullnameException("Invalid");

        }else {
            System.out.println("Valid");
        }
    }

    public static void checkDOB(String dOB) throws InvalidDOBException{
        String regex = "^\\\\d{2}[-|/]\\\\d{2}[-|/]\\\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dOB);
        if(!matcher.find()){
            throw new InvalidDOBException("Invalid");

        }else {
            System.out.println("Valid");
        }
    }
}
