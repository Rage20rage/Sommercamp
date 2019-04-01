package lws.training.a13;

import java.math.BigInteger;

public class Fibonacci {

    private static BigInteger a = BigInteger.valueOf(1);
    private static BigInteger b  = BigInteger.valueOf(1);
    private static BigInteger c = BigInteger.valueOf(0);
    private static FibonacciPosition position = FibonacciPosition.c;


    public static void calculate(int end) {
        if(end >= 1) {
            System.out.println("1");
        }
        for(long i = 2; i <= end; i++) {
            if(position == FibonacciPosition.a) {
                position = FibonacciPosition.b;
                a = b.add(c);
                System.out.println(a);
            } else if(position == FibonacciPosition.b) {
                position = FibonacciPosition.c;
                b = a.add(c);
                System.out.println(b);
            } else if(position == FibonacciPosition.c) {
                position = FibonacciPosition.a;
                c = a.add(b);
                System.out.println(c);
            }
        }
    }

}
