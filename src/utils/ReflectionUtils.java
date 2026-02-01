package utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public static void inspect(Object obj) {
        Class<?> clazz = obj.getClass();

        System.out.println("Class: " + clazz.getName());

        for (Field f : clazz.getDeclaredFields()) {
            System.out.println("Field: " + f.getName());
        }

        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println("Method: " + m.getName());
        }
    }
}