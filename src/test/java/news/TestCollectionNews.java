
package news;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leixin.model.NewsCollection;
import com.leixin.model.NewsComment;
import com.leixin.service.NewsCollectionService;
import com.leixin.service.NewsCommentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:conf/spring-mvc.xml", "classpath:conf/spring-mybatis.xml"
})
public class TestCollectionNews {
    // private static final Logger logger = Logger.getLogger(TestNews.class);

    @Autowired
    private NewsCollectionService mNewsCollectionService;

    // @Test
    public void findNewsCollectionByUserId() {
        mNewsCollectionService.findNewsCollectionByUserId(1);
    }

    @Test
    public void findNewsCollectionByNewsId() {
        mNewsCollectionService.findNewsCollectionByNewsId(1);
    }

    // @Test
    public void addNewsCollection() {
        NewsCollection newScollection = new NewsCollection();
        newScollection.setNewsid(1);
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String time = dateFormat.format(now);
        newScollection.setCreatetime(time);
        newScollection.setUserid(1);
        newScollection.setTitle("life");
        mNewsCollectionService.addNewsCollection(newScollection);
    }
}
