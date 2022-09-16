package br.edu.uniritter.mobile.loginapp;

import android.widget.TextView;

public class Login {

    private static String username_admin = "adm";
    private static String password_admin = "adm";

    public static boolean loginValidation(TextView username, TextView password) {
        if(username.getText().toString().equalsIgnoreCase(username_admin) && password.getText().toString().equalsIgnoreCase(password_admin)) {
            //correto
            return true;
        } else {
            return false;
        }
    }
}