package lesson2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the line:");
        String input = in.nextLine();
        if (input.equals(""))
            throw new RuntimeException("empty lines cannot be entered");
    }
}
