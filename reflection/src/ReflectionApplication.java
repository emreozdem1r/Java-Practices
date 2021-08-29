import reflection.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApplication {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {

        Reflection reflection = new Reflection();

        Class cls = reflection.getClass();
        System.out.println("the name of class is " + cls.getName());

        Constructor constructor = cls.getConstructor();
        System.out.println("the name of contructor is " + constructor.getName());

        System.out.println("The public methods of class are : ");

        Method[] methodList = cls.getMethods();
        for(Method method : methodList)
            System.out.println("method name: " + method.getName());

        Method methodWithAnArgumentCall = cls.getDeclaredMethod("methodWithAnArgument", int.class);
        methodWithAnArgumentCall.invoke(reflection, 20);

        // field is Reflection class variable
        Field field = cls.getDeclaredField("field");
        field.setAccessible(true);
        field.set(reflection, "Java");

        Method methodWithNoArgumentCall = cls.getDeclaredMethod("methodWithNoArgument");
        methodWithNoArgumentCall.invoke(reflection);

        Method privateMethodCall = cls.getDeclaredMethod("privateMethod");
        privateMethodCall.setAccessible(true);
        privateMethodCall.invoke(reflection);

    }
}
