/*
User Repository extends IRepository interface
Author: Aneeqah Talaaboedien (219099405)
Date 28 March 2025
 */

package fr.efrei.Repository;

import fr.efrei.domain.User;

import java.util.List;

public interface IUserRepository extends IRepository <User, String>{

    List<User> getAll();

    User create(User user);
}
