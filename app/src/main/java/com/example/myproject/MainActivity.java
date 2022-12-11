package com.example.myproject;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myproject.Contact;

import java.util.LinkedList;

public class MainActivity extends Activity {
    private ListView contactView;
    private LinkedList<Contact> contactList;
    private ContactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactView = findViewById(R.id.contactView);

        contactList = new LinkedList<>();
        contactList.add(new Contact("Nissrine", "LOUZ"));
        contactList.add(new Contact("Adnane", "ERRAZINE"));
        contactList.add(new Contact("Dorssaf", "FRISSA"));
        contactList.add(new Contact("Hiba"));
        contactList.add(new Contact("Amine"));
        adapter = new ContactAdapter(this, contactList);
        contactView.setAdapter(adapter);
    }
}
