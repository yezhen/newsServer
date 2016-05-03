
package com.leixin.dao;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.leixin.model.User;

@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, isolation = Isolation.DEFAULT)
public interface UserDAO {
    public int insertUser(User user);

    public User findUser(String name);

    public User findUserByNameAndPassword(User user);

    public User findUserByPhone(User user);
    
    public int updateUserByPassword(User user);
}
