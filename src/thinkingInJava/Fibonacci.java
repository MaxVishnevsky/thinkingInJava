package thinkingInJava;

import java.util.ArrayList;

public class Fibonacci {
    private static ArrayList<Integer> arr = new ArrayList<>();

    public static void calcFibonacci (int var) {
        arr.add(1);
        arr.add(1);
        Integer tmp;
        for (int i = 1; i < var; i++) {
            tmp = arr.get(i - 1) + arr.get(i);
            arr.add(tmp);
        }
    }

    public static void printFibonacci (int var) {
        calcFibonacci(var);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
