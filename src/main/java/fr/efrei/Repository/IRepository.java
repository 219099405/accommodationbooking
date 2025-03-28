/*
Repository Interface
Author: Aneeqah Talaaboedien (219099405)
Date 28 March 2025
 */

package fr.efrei.Repository;
import fr.efrei.domain.User;

public interface IRepository <T, ID>{
    T create (T t);
    T read (ID id);
    T update (T t);
    boolean delete (ID id);

}
