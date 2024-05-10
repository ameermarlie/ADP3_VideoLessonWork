package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;
import java.util.regex.Pattern;

public class Helper {
    public static boolean isNullOrEmpty(String s){
        return s == null || s.isEmpty();
    }
    public static boolean validateEmail(String email){

        if(email.isEmpty()){
            System.out.println("Email is null or empty");
            return false;
        }
        if(EmailValidator.getInstance()
                .isValid(email)){
            System.out.println("Email is valid");
            return true;
        }
        else{
            System.out.println("Email is not valid");
            return false;
        }
    }

    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}
