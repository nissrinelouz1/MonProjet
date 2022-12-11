package com.example.myproject;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class RandomHelper {

    private static Random myRandom = new Random(0611223344);
    public static PhoneNumber generatePhoneNumber(){
        StringBuilder builder = new StringBuilder();
        builder.append(0);
        for (int i = 0; i < 8; i++);
        builder.append(myRandom.nextInt(9));
        return new PhoneNumber(builder.toString());
    }
    public static List<PhoneNumber> generatePhoneNumberList() {
        LinkedList<PhoneNumber> phoneNumberList = new LinkedList<>();
        int count = myRandom.nextInt(4);
        for (int i = 0; i < count; i++) {
            phoneNumberList.add(generatePhoneNumber());
        }
        return phoneNumberList;
    }
}

