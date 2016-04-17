
package news;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leixin.service.NewsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:conf/spring-mvc.xml", "classpath:conf/spring-mybatis.xml"
})
public class TestNews {
//    private static final Logger logger = Logger.getLogger(TestNews.class);

    @Autowired
    private NewsService mNewsService;


    public NewsService getmNewsService() {
        return mNewsService;
    }

    public void setmNewsService(NewsService mNewsService) {
        this.mNewsService = mNewsService;
    }


     @Test
    public void findNewsById() {
        mNewsService.findNewsById(1);
        // System.out.println(user);
    }

//    @Test
    public void findNewsByNewscategoryid() {
        mNewsService.findNewsByNewscategoryid(1);
    }

}
