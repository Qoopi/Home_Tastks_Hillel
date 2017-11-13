package task_11;

import java.util.Scanner;

/**
 * Created by oGGi on 13.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        String helloGoodbay;
        boolean done = false;

        while(!done){
            System.out.println("Введите единицы измерения:");
            System.out.println("- г для того, чтобы перевести в граммы.");
            System.out.println("- кг для того, чтобы перевести в килограммы.");
            System.out.println("- т для того, чтобы перевести в тонны.");
            s = in.nextLine();

            switch (s.toLowerCase()) {
                case "г": {
                    Converter.grams();
                    break;
                }
                case "кг": {
                    Converter.kilograms();
                    break;
                }
                case "т": {
                    Converter.tons();
                    break;
                }
            }
            System.out.println("Хотите воспользоваться программой ещё раз?");
            System.out.println("Чтобы продолжить введите Да, чтобы остановить программу введите Ну нафиг.");
            switch (helloGoodbay = in.nextLine()) {
                case"Ну нафиг":
                    done = true;
            }

        }

    }

}

