import com.dzq.bean.Desk;
import com.dzq.bean.DeskFactory;
import com.dzq.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 13:58
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test06 {
    @Test
    public void testApplicationContext6(){
        // 默认情况下，此行已经将applicationContext.xml下所有对象都创建了
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext6.xml");

        Desk desk = applicationContext.getBean("desk", Desk.class);
        System.out.println(desk);
    }
}
