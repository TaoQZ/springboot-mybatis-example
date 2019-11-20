import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.taoqz.MyApplication;
import xyz.taoqz.domain.Category;
import xyz.taoqz.service.CategoryService;

/**
 * @author :almostTao
 * @date :Created in 2019/11/20 19:54
 */
@RunWith(SpringRunner.class)
// 指定启动类
@SpringBootTest(classes = MyApplication.class)
public class MyTest {

    @Autowired
    private CategoryService categoryService;


    @Test
    public void demo(){
        Category category = new Category(null,"鞋子");
        categoryService.add(category);
        System.out.println("添加后的id:"+category.getId());
    }

}
