package lesson2;

import java.io.FileNotFoundException;

public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("cannot be divided by zero");
            }
            printSum(23, 234);
            int[] abc = { 1, 2 };
            Integer index = 3;
            if ((index != null) && (index >= 0 && index < abc.length))
                abc[index] = 9;
        } catch (Throwable ex) {
            System.out.println("oh no");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
