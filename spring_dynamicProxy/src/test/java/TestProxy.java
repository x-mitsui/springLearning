import com.dzq.testProxy.Dinner;
import com.dzq.testProxy.User;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 16:20
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestProxy {
    @Test
    public void test01(){
        final Dinner dinner = new User("张三");

        ClassLoader classLoader = dinner.getClass().getClassLoader();
        System.out.println("类加载器是什么？---" + classLoader);
        Class<?>[] interfaces = dinner.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object res = null;
                if("eat".equals(method.getName())){
                    System.out.println("饭前洗手");
                    res = method.invoke(dinner,args);
                    System.out.println("饭后洗手");
                }else{
                    res = method.invoke(dinner,args);
                }
                return res;
            }
        };
        Dinner Proxy_dinner = (Dinner)Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

        Proxy_dinner.eat();
    }
}
