import generic.TestGeneric;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsApplication {

    public static void main (String[] args)
    {

        // generics
        System.out.println("generics begins");
        TestGeneric<Integer> genericInteger = new TestGeneric<Integer>(10);
        System.out.println(genericInteger.getObj());

        TestGeneric<String> genericString = new TestGeneric<String>("Java Generics");
        System.out.println(genericString.getObj());

        // wildcard
        // upper bounded wildcard
        System.out.println("upper bounded wildcard begins");
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("sum of integer list: " + sum(integerList));

        List<Double> doubleList = Arrays.asList(6.0, 7.5, 5.1, 3.2);
        System.out.println("sum of double list: " + sum(doubleList));

        // lower bounded wildcard
        System.out.println("lower bounded wildcard begins");
        List<Number> numberList = Arrays.asList(11, 12, 13, 14);

        System.out.println("sum of integer list: ");
        printOnlyIntegerClassOrSuperClass(integerList);

        System.out.println("sum of number list: ");
        printOnlyIntegerClassOrSuperClass(numberList);

        // onbounded wildcard
        System.out.println("Onbounded wildcard begins");
        printList(integerList);
        printList(doubleList);
        printList(numberList);
    }

    private static double sum(List<? extends Number> list) {

        double total = 0.0;
        for(Number element : list) {
            total += element.doubleValue();
        }

        return total;
    }

    public static void printOnlyIntegerClassOrSuperClass(List<? super Integer> list)
    {
        System.out.println(list);
    }

    private static void printList(List<?> list) {
        System.out.println(list);
    }
}
