
package news;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leixin.service.NewsImageService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:conf/spring-mvc.xml", "classpath:conf/spring-mybatis.xml"
})
public class TestNewsImage {

    @Autowired
    private NewsImageService mNewsImageService;

    @Test
    public void findNewsById() {
        mNewsImageService.findNewsImageByNewsId(1);
    }

    public NewsImageService getmNewsImageService() {
        return mNewsImageService;
    }

    public void setmNewsImageService(NewsImageService mNewsImageService) {
        this.mNewsImageService = mNewsImageService;
    }

}
