package classes;

import java.io.File;
import java.lang.reflect.Method;
import classes.*;
import annotation.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Class<?> cls = Test.class;
        for(Method m : cls.getDeclaredMethods()) {
            if(m.isAnnotationPresent(HandleURL.class)) {
                HandleURL annotation = m.getAnnotation(HandleURL.class);
                System.out.println(annotation.value());
            }
        }

        File classesDir = new File("classes");
        for(File file : classesDir.listFiles()) {
            String path = file.getAbsolutePath().substring(classesDir.getAbsolutePath().length() + 1);
             String className = "classes." + path
                        .replace(File.separatorChar, '.')
                        .replaceAll(".class$", "");

            Class<?> clazz = Class.forName(className);
            if(clazz.isAnnotationPresent(Controller.class)) {
                Controller controller = clazz.getAnnotation(Controller.class);
                System.out.println("Found controller: " + controller.value());
            }

        }

    }
}
