
package news;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leixin.model.NewsComment;
import com.leixin.service.NewsCommentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:conf/spring-mvc.xml", "classpath:conf/spring-mybatis.xml"
})
public class TestCommentNews {
//    private static final Logger logger = Logger.getLogger(TestNews.class);

    @Autowired
    private NewsCommentService mNewsCommentService;


//     @Test
    public void addContent() {
         NewsComment newsComment = new NewsComment(); 
         newsComment.setContent("这个不错匹配");
         newsComment.setCount(100);
         newsComment.setCreatetime("2016-4-17 18:37");
         newsComment.setNewsid(1);
         newsComment.setUserid(1);
         
         getmNewsCommentService().addContent(newsComment);
        // System.out.println(user);
    }


    public NewsCommentService getmNewsCommentService() {
        return mNewsCommentService;
    }


    public void setmNewsCommentService(NewsCommentService mNewsCommentService) {
        this.mNewsCommentService = mNewsCommentService;
    }

    @Test
    public void findNewsContentByNewsId() {
        mNewsCommentService.findNewsContentByNewsId(1);
    }

}
