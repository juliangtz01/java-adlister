package com.codeup.adlister.controllers;

import org.mindrot.jbcrypt.BCrypt;

public class HashTest
{
    public static void main(String[] args)
    {
        String password = "codeytheduck";
        String has = BCrypt.hashpw(password, BCrypt.gensalt());

        System.out.println(has);
    }
}
