import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 13:58
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test03 {
    @Test
    public void testApplicationContext2(){
        // 默认情况下，此行已经将applicationContext.xml下所有对象都创建了
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");

        System.out.println(applicationContext.getBean("cat1"));

        System.out.println(applicationContext.getBean("cat2"));

        System.out.println(applicationContext.getBean("cat3"));

    }
}
