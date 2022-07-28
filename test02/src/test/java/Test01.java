import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 13:58
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test01 {
    @Test
    public void testUser1(){
        // 默认情况下，此行已经将applicationContext.xml下所有对象都创建了
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object user1 = applicationContext.getBean("user1");
        System.out.println(user1);
        Object user2 = applicationContext.getBean("user2");
        System.out.println(user2);
        Object user3 = applicationContext.getBean("user3");
        System.out.println(user3);
        Object user4 = applicationContext.getBean("user4");
        System.out.println(user4);
        Object user5 = applicationContext.getBean("user5");
        Object user6 = applicationContext.getBean("user6");
        System.out.println(user5);
        System.out.println(user6);

    }
}
