package task_7;

import java.util.Scanner;

/**
 * Created by Kutafin Oleg on 29-08-2017.
 */
public class MultipleNumbers {
    public static void main(String[] args) {
        int number;
        int number2;
        int ostatok;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите делимое число");
        number = sc.nextInt();
        System.out.println("Ведите делитель");
        number2 = sc.nextInt();
        if (number % number2 != 0) {
            ostatok = number % number2;
            System.out.println("Число " + number + " не кратно " + number2 + ",остаток при делении составит " + ostatok + ".");
        } else {
            System.out.println("Число " + number + " кратно " + number2 + ".");
        }
    }
}
