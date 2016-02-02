package thinkingInJava;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
/*        Coin coin = new Coin();
        coin.flingUp();
        System.out.println(coin); */

//        Fibonacci.printFibonacci(10);

        Book novel = new Book(true);
//        right cleaning
        novel.checkIn();
//        get lost link, forget about cleaning
        new Book(true);
//        forced cleaning and finalization
        System.gc();
    }
}
