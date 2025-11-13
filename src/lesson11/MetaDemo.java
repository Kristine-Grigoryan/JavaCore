package lesson11;


import lesson8.A;

import java.lang.reflect.Method;

public class MetaDemo {

    public static  void main(String[] args) {
      AnnotationDemo   ad = new AnnotationDemo();

        Class<?> aClass = ad.getClass();
        try {
            Method m = aClass.getMethod("meth",int.class);
            MyAnnotation annotation =m.getAnnotation(MyAnnotation.class);;





        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);

        }

    }
}


