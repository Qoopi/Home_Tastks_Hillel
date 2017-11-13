package task_12;

import task_10.RevertString;

import java.util.Scanner;

/**
 * Created by oGGi on 13.11.2017.
 */
public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше число или слово");
        String s = in.next();
        String s2 = RevertString.recursiveReverse(s);
        if(s.equals(s2)){
            System.out.println("Введённое вами слово или число являеться палиндромом.");
        } else {
            System.out.println("Введённое вами слово или число палиндромом не являеться.");
        }
    }
}
