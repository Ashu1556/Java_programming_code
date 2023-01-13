package Primefactor;

import java.util.Scanner;

public class primefactor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();
        for (int div = 2; div * div <= n; div++) {

            while (n % div == 0) {
                n = n / div;
                System.out.print(div);
            }
        }
    }

}
