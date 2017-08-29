package task_5;

import java.util.Scanner;

/**
 * Created by Kutafin Oleg on 29-08-2017.
 */
public class EvenOddNumber {
    public static void main(String args[]){
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        n = scanner.nextInt();

        if((n%2)==0){
            System.out.println("Число " + n + " четное ");
        } else{
            if((n%1)==0){
                System.out.println("Число " + n + " нечетное ");
            }
        }
    }

}
