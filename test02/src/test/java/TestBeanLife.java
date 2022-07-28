import com.dzq.bean.BeanLifeTest;
import com.dzq.bean.Desk;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 13:58
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestBeanLife {
    @Test
    public void testApplicationContext6(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanLifeTest.xml");

        BeanLifeTest beanLifeTest = applicationContext.getBean("beanLifeTest", BeanLifeTest.class);
        System.out.println("生命周期四：获取bean对象");
        System.out.println(beanLifeTest);
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
