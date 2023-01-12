package Fibonacci;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sacn = new Scanner(System.in);

        int n = sacn.nextInt();

        int a = 0, b = 1, c = 1;

        sacn.close();

        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(a);

    }

}
