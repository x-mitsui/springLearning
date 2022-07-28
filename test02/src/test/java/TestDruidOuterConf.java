import com.alibaba.druid.pool.DruidDataSource;
import com.dzq.bean.BeanLifeTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 13:58
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestDruidOuterConf {
    @Test
    public void testBeanLifeProcessor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DruidAndOuterConfTest.xml");

        DruidDataSource druidDataSource = applicationContext.getBean("druidSource", DruidDataSource.class);
        System.out.println(druidDataSource);
    }
}
