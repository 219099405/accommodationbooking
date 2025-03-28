/*
Main
Author: Aneeqah Talaaboedien (219099405)
Date 28 March 2025
 */

package fr.efrei;

import fr.efrei.domain.User;

public class Main {
    /*
    User Object
 Author: Aneeqah Talaaboedien (219099405)
 Date 28 March 2025
  */
    public static void main(String[] args) {
        User u1= new User.Builder().setUserId("123").setUserName("Aneeqah").setEmail("aj")
                .build();

        System.out.println(u1.toString());
    }
    }
