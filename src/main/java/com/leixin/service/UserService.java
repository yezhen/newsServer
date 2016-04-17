
package com.leixin.service;

import com.leixin.model.User;

public interface UserService {

    int insertUser(User user);

    User findUser(String name);
    
    User findUserByNameAndPassword(User user);

}
