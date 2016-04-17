
package news;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.leixin.model.User;
import com.leixin.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:conf/spring-mvc.xml", "classpath:conf/spring-mybatis.xml"
})
public class TestUser {
    private static final Logger logger = Logger.getLogger(TestUser.class);

    @Autowired
    private UserService mUserService;

    public UserService getmUserService() {
        return mUserService;
    }

    public void setmUserService(UserService mUserService) {
        this.mUserService = mUserService;
    }

    // @Test
    public void addUser() {
        User user = new User();
        user.setName("life");
        user.setPassword("123");
        int i = mUserService.insertUser(user);
        logger.info(JSON.toJSONStringWithDateFormat("add" + i, "yyyy-MM-dd HH:mm:ss"));
    }

    // @Test
    public void findUser() {
        // User user = mUserService.findUser("life");
        // System.out.println(user);
    }

    @Test
    public void findUserByNameAndPassword() {
        User user = new User();
        user.setName("life");
        user.setPassword("1232");
        mUserService.findUserByNameAndPassword(user);
    }

}
