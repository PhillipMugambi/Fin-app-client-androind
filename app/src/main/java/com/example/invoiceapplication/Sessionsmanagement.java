package com.example.invoiceapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class Sessionsmanagement {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String SHARED_PREF_NAME = "sessions";
    public Sessionsmanagement(Context context) {
        sharedPreferences = context.getSharedPreferences("SHARED_PREF_NAME", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveSession(User user){
//save session of user whenever user is loggedin
 String pin=user.getPin();
 String phonenumber=user.getPhonenumber();
 editor.putString("PHONE",phonenumber);
 editor.putString("PIN",pin);
 editor.commit();
    }
    public String getSession(){
//this will return user whose session is saved
return sharedPreferences.getString("PHONE","");
    }
    public void RemoveSession(){
        editor.putString("PHONE","");
        editor.commit();
    }
}
