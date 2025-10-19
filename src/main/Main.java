package main.classes;

import java.lang.reflect.Method;
import main.classes.*;
import annotation.*;

public class Main {
    public static void main(String[] args) {
        
        Class<?> cls = Test.class;
        for(Method m : cls.getDeclaredMethods()) {
            if(m.isAnnotationPresent(HandleURL.class)) {
                HandleURL annotation = m.getAnnotation(HandleURL.class);
                System.out.println(annotation.value());
            }
        }
    }
}
