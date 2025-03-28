/*
Test User Repository
Author: Aneeqah Talaaboedien (219099405)
Date 28 March 2025
 */

package fr.efrei.Repository;

import fr.efrei.domain.User;
import fr.efrei.factory.UserFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
private static IUserRepository repository= UserRepository.getRepository();

private User user1 = UserFactory.createUser("2290","Asmaa","2024");

    @Test
    void a_createUser() {
        User created = repository.create(user1);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        User read = repository.read(user1.getUserId());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        //User newUser = new User.Builder().copy(user1).setFirstName("").build();
        //User updated = repository.update(newUser);
        //assertNotNull(updated);
        //System.out.printLn(updated.toString());
    }

    @Test
    void delete() {
        assertTrue(repository.delete(user1.getUserId()));
        System.out.println("User successfully deleted");
    }

    @Test
    void getAll() {
        System.out.println(repository.getAll());
    }

}