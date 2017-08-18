package task_1;

import java.util.Scanner;

/**
 * Created by Kutafin Oleg on 18-08-2017.
 */
public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, average;
        String exit;
        boolean done = false;

            while (!done) {
                System.out.println("Давай считать среднее значение двух чисел.");
                System.out.println("Введите первое число:");
                a = scanner.nextDouble();

                System.out.println("Введите второе число: ");
                b = scanner.nextDouble();

                average = (a + b) / 2;
                System.out.println("Средние этих числе = " + average);
                System.out.println("Выйти из приложения или посчитем ещё? y/n?");
                exit = scanner.next();
                switch(exit) {
                    case"y":
                        done = true;
                        break;
                }

            }
        scanner.close();
    }
}
