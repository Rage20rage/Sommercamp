package lws.training.a13;

import java.util.Scanner;

public class RunA13 {
    public static void start() {
        System.out.println("Bitte geben sie an wie viele Fibonacci-Zahlen ausgegeben werden sollen: ");
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        Fibonacci.calculate(end);
    }
}
