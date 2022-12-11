package com.example.myproject;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myproject.Contact;
import com.example.myproject.RessourceHelper;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    public ContactAdapter(Context context, List<Contact> objects) {
        super(context, 0, objects);
    }


    public View getView(int position, View convertView,  ViewGroup parent) {

        //création de la vue
        if(convertView == null){
            convertView = View.inflate(getContext(), R.layout.item_contact, null);
        }
        //récupération des vues à l'intérieur
        TextView contactAlias = convertView.findViewById(R.id.contactAlias);
        TextView contactName = convertView.findViewById(R.id.contactName);
        TextView contactPhones = convertView.findViewById(R.id.contactPhones);

        //récupération de l'objet à afficher
        Contact contact = getItem(position);

        contactAlias.setText(contact.getAlias());
        contactName.setText(contact.getFullName());
        contactPhones.setText(contact.getPhoneNumbers());

        RessourceHelper helper = RessourceHelper.getInstance();
        int color = helper.getAliasColor(position);
        contactAlias.getBackground().setColorFilter(
                getContext().getResources().getColor(color),
                PorterDuff.Mode.MULTIPLY
        );

        return convertView;

    }
}
