package task_8;

import java.util.Scanner;

/**
 * Created by Kutafin Oleg on 29-08-2017.
 */
public class SumOfNumbersInNumber {
    public static void main(String [] args){
        int n;
        int sum = 0;
        System.out.print("Bведите натуральное число - ");
        Scanner sr = new Scanner(System.in);
        for(n = sr.nextInt(); n != 0; n /= 10){
            sum = sum + (n % 10);
        }
        System.out.println("Сумма числе ровна " + sum  );
    }
}
