package task_4;

import java.util.Scanner;

/**
 * Created by oGGi on 20.08.2017.
 */
public class Draw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберете, что нарсовать в консоле:");
        System.out.println("1 - Прямоугольник");
        System.out.println("2 - Конверт");
        System.out.println("3 - Снежок");
        String choice = scan.next();
        System.out.println("Теперь выбери размер фигурок, что будем рисовать в консоле");
        System.out.println("Введи количество линий, на которых расположеться рисунок");
        int lines = scan.nextInt();
        System.out.println("Введи количество столбцов");
        int rows = scan.nextInt();
            switch (choice) {
                case "1":
                    for(int x = 0; x < rows; x++) {
                        for(int y = 0; y < lines; y++){
                            if((x == 0 || x == rows - 1) || (y == 0 || y == lines -1)) {
                            System.out.print("*");
                            }else {
                            System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                        break;
                case "2":
                    lines = rows;
                    for(int x = 0; x < rows; x++) {
                        for(int y = 0; y < lines; y++) {
                            if((x == 0 || x == rows - 1) || (y == 0 || y == lines -1) || ((x == (rows - 1 - y)) && (y == (lines - 1 - x))) || (x == y)) {
                                System.out.print("*");
                            }else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                        break;
                case "3":
                    for(int x = 0; x < rows; x++){
                        for(int y = 0; y < lines; y++){
                            if((x % 2 == 0 && y % 2 != 0) || (x % 2 != 0 && y % 2 == 0)) {
                                System.out.print("*");
                            }else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                        break;
            }
        }
    }
