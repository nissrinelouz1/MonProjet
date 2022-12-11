package com.example.myproject;
import java.util.List;
public class PhoneNumber {
    public String Number;
    public PhoneNumber(String number){
        Number = number;
    }
    public static List <PhoneNumber> getByOwner(Contact contact){
        return RandomHelper.generatePhoneNumberList();
    }
}

