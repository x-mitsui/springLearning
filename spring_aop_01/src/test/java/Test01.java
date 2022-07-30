import com.dzq.dao.UserDao;
import com.dzq.service.EmpService;
import com.dzq.service.UserService;
import com.dzq.service.impl.EmpServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/30 - 07 - 30 - 19:05
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test01 {
    @Test
    public void testAspect01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = applicationContext.getBean(UserService.class);
        int rows = bean.add(1, "老六");
        System.out.println("受影响：" + rows);
        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao.getClass().getName());
    }

    @Test
    public void testAspect02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService bean = applicationContext.getBean(EmpServiceImpl.class);
        int rows = bean.add(1, "老六", "22");
        System.out.println("Emp受影响：" + rows);
    }
}
