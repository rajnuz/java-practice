package springpractice.reflect;

import springpractice.reflect.service.ReflectInterface;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @date 5/6/2022 10:48 PM
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("springpractice.reflect.service.ReflectDemo");
        Constructor reflectDemoConstructor = clazz.getDeclaredConstructor(String.class);
        reflectDemoConstructor.setAccessible(true);
        String name = "Tom";
        ReflectInterface obj = (ReflectInterface)reflectDemoConstructor.newInstance(name);
        obj.printSomthing();
    }
}
