package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.util.Helper;

public class ContactFactory{
    public static Contact buildContact(String email,String mobile,String linkedInProfile){

        //check if valid email regex or apache commons
        if(!Helper.validateEmail(email)){
            return null;
        }
        if (Helper.isNullOrEmpty(mobile)){
            System.out.println("mobile is null or empty");
            return null;
        }
        if (Helper.isNullOrEmpty(linkedInProfile)){
            return null;
        }

        return new Contact.Builder().setEmail(email)
                .setMobile(mobile)
                .setLinkedInProfile(linkedInProfile)
                .build();
    }
}
