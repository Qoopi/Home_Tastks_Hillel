package task_3;

import java.util.Scanner;

/**
 * Created by Kutafin Oleg on 18-08-2017.
 */
public class BankCredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vklad,  prozenti;
        int srok;
        double answer;
        double answer2;
        boolean done = false;
        String exit;
        while (!done) {
            System.out.println("Введите сумму денег, которую вы хотите положить на депозит: ");
            vklad = scanner.nextDouble();
            System.out.println(vklad + " .грн");

            System.out.println("Введите годовой процент, что даёт банк:");
            prozenti = scanner.nextDouble();
            System.out.println(prozenti + "%");

            System.out.println("Введите срок накоторый вы хоитте положить деньги в годах:");
            srok = scanner.nextInt();
            if (srok > 50){
                System.out.println("Нестоит ложить деньги в банк на столь большой срок, банки имеют своиство закрываться, становиться банкротами и так далее...ну выпоняли;)");
                System.out.println("Введи колличество лет не больше чем 50.");
                srok = scanner.nextInt();
            }
            System.out.println(srok + " г.");

            answer = vklad + (vklad * (prozenti / 100)) * srok;
            System.out.println("Сумма деннег которую вы получите спустя " + srok + "лет/годов " + ", составит: " + answer + " грн.");

            for (int i = 1; i <= srok; i++) {
                answer2 = vklad * (prozenti / 100) * i;
                System.out.println("Доход за  " + i + " год составит: " + answer2 + " грн.");
            }
            System.out.println("Хотите выйт из приложения? y/n?");
            exit = scanner.next();
                switch (exit) {
                    case"y":
                    done = true;
                    break;
                }
            }
        }

    }


