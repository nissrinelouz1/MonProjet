package com.example.myproject;
import java.util.List;

public class Contact {
    public String LastName;
    public String FirstName;

    public Contact(String firstName){
        this.FirstName = firstName;
    }

    public Contact(String firstName, String lastName){
        this.FirstName = firstName;
        this.LastName = lastName;
    }
    public String getAlias(){
        StringBuilder builder = new StringBuilder();

        if (LastName != null && !LastName.equals("")) {
            builder.append(FirstName.charAt(0));
            builder.append(LastName.charAt(0));
        }
        else {
            builder.append(FirstName.charAt(0));
            builder.append(FirstName.charAt(1));
        }
        return builder.toString();
    }
    public String getFullName(){
        StringBuilder builder = new StringBuilder();
        builder.append(FirstName);
        if (LastName != null && !LastName.equals("")){
            builder.append(" ");
            builder.append(LastName);
        }
        return builder.toString();
    }

    public String getPhoneNumbers(){
        List<PhoneNumber> phoneNumberList = PhoneNumber.getByOwner(this);
        StringBuilder builder = new StringBuilder();
        if (phoneNumberList !=null)
            for (PhoneNumber phone : phoneNumberList) {
                builder.append(phone.Number);
                builder.append("\n");
            }
        return builder.toString();
    }
}

