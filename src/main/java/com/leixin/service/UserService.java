
package com.leixin.service;

import com.leixin.model.User;

public interface UserService {

    int insertUser(User user);

    int updateUserByPassword(User user);

    User findUser(String name);

    User findUserByPhone(User user);

    User findUserByNameAndPassword(User user);

}
