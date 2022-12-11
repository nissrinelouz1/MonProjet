package com.example.myproject;
import java.util.LinkedList;
import java.util.List;
public class RessourceHelper {
    private static RessourceHelper instance;
    public static RessourceHelper getInstance(){
        if (instance == null){
            instance = new RessourceHelper();
        }
        return instance;
    }
    private List<Integer>aliasColors;
    private RessourceHelper(){
        aliasColors = new LinkedList<>();
        aliasColors.add(R.color.contact_aliasa);
        aliasColors.add(R.color.contact_aliasb);
        aliasColors.add(R.color.contact_aliasc);
        aliasColors.add(R.color.contact_aliasd);
        aliasColors.add(R.color.contact_aliase);
        aliasColors.add(R.color.contact_aliasf);
        aliasColors.add(R.color.contact_aliasg);
        aliasColors.add(R.color.contact_aliash);
        aliasColors.add(R.color.contact_aliasi);
        aliasColors.add(R.color.contact_aliasj);
    }
    public int getAliasColor (int index){
        return aliasColors.get(Math.max(index, 0) % aliasColors.size());
    }
}

