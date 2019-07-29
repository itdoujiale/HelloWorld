package doannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: UserFactory
 * @description: 用户工厂
 * @author: doujl
 * @create: 2018-12-18 10:55
 **/
public class UserFactory {

    public static User create() {
        User user = new User();
        // 获取User类中所有的方法（getDeclaredMethods也行）
        Method[] methods = User.class.getMethods();
        try {
            for (Method method : methods) {
                // 如果此方法有注解，就把注解里面的数据赋值到user对象
                if (method.isAnnotationPresent(Init.class)) {
                    Init init = method.getAnnotation(Init.class);
                    method.invoke(user, init.value());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return user;
    }
}
