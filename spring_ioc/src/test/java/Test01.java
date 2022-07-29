import com.dzq.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 10:51
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test01 {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        userService.add();
    }
}
