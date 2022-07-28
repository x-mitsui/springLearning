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
public class Test04 {
    @Test
    public void testApplicationContext4(){
        // 默认情况下，此行已经将applicationContext.xml下所有对象都创建了
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");

        Student student1 = applicationContext.getBean("student1",Student.class);
        System.out.println(student1.getBallList());
        System.out.println(student1.getBookMap());
        System.out.println(Arrays.toString(student1.getBooks()));
        System.out.println(student1.getBookSet());
        System.out.println(student1.getBookList());

    }
}
