package com.spring.repository;

import com.spring.model.User;

import java.util.List;

/*public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    void deleteById(Long aLong);
    User getUserByName(String name);
}*/


public interface UserRepository{

    User getUserById(Long id);
    User getUserByName(String name);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> findAll();

}
