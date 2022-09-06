package Bai14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidPhoneNumberException extends Exception{
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
