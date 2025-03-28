/*
User Factory Test Class
Author: Aneeqah Talaaboedien (219099405)
Date 28 March 2025
 */



package fr.efrei.factory;

import fr.efrei.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserFactoryTest { private static User u1 = UserFactory.createUser("14900","Aneeqah", "2024");



    @Test
    void testCreateUser() {
        assertNotNull(u1);
        System.out.println(u1.toString());
    }
  
}