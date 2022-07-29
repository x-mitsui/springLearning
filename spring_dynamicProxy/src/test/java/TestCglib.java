import com.dzq.testCglib.Person;
import com.dzq.testProxy.Dinner;
import com.dzq.testProxy.User;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 16:20
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestCglib {
    @Test
    public void test(){
        final Person person = new Person();

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(person.getClass());

        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            // Object o-代理对象

            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object res=null;
                if("eat".equals(method.getName())){
                    System.out.println("吃饭前");
                    res=method.invoke(person,objects);
                    System.out.println("吃饭后");
                }else {
                    res=method.invoke(person,objects);
                }
                return res;
            }
        };
        enhancer.setCallback(methodInterceptor);
        Person personProxy = (Person)enhancer.create();
        personProxy.eat();
        System.out.println("----------------------");
        personProxy.sleep();



    }
}
