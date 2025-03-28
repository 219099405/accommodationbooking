/*
User Factory Class
Author: Aneeqah Talaaboedien (219099405)
Date 28 March 2025
 */

package fr.efrei.factory;

import fr.efrei.domain.User;
import fr.efrei.util.Helper;

public class UserFactory {
    public static User createUser(String userId, String userName, String password) {
        if (Helper.isNullOrEmpty(userId) || Helper.isNullOrEmpty(userName) || Helper.isNullOrEmpty(password))
            return null;


        return new User.Builder().setUserId(userId).setUserName(userName).setPassword(password).build();
    }
}


