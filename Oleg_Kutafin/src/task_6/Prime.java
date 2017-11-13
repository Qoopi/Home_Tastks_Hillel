package task_6;

import java.util.Scanner;

/**
 * Created by Kutafin Oleg on 18-08-2017.
 */
public class Prime {
    public static void main(String args[]) {
        int temp;
        boolean isPrime=true;
        String exit;
        boolean done = true;
        Scanner scan= new Scanner(System.in);
        while(done) {
            System.out.println("Введите число для проверки:");
            int num = scan.nextInt();
            for (int i = 2; i <= num / 2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " - простое число");
            } else {
                System.out.println(num + " - составное число");
            }
            System.out.println("Хотите проверить ещё одно число? y/n?");
            exit = scan.next();
            switch (exit) {
                case"n":
                    done = false;
                    break;
            }
        }
    }
}

