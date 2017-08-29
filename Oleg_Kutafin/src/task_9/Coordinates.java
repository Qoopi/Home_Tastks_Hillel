package task_9;

import java.util.Scanner;

/**
 * Created by Kutafin Oleg on 29-08-2017.
 */
public class Coordinates {

    public static void main(String[] args) {
        int x1,x2,x3,y1,y2,y3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Координаты верхнего левого угла");
        System.out.println("По оси Х : ");
        x1 = sc.nextInt();
        System.out.println("По оси У : ");
        y1 = sc.nextInt();
        System.out.println("Координаты нижнего правого угла");
        System.out.println("По оси Х : ");
        x2 = sc.nextInt();
        System.out.println("По оси У : ");
        y2 = sc.nextInt();
        System.out.println("Задайте координаты точки А");
        System.out.println("По оси Х : ");
        x3 = sc.nextInt();
        System.out.println("По оси У : ");
        y3 =sc.nextInt();

        if (x3 > Math.min(x1,x2) && x3 < Math.max(x1,x2) && y3 > Math.min(y1,y2) && y3 < Math.max(y1,y2)){
            System.out.println("Точка А("+ x3 + ";"+ y3 + ") входит в заданный вами прямоугольник." );
        }else {
            System.out.println("Точка А("+ x3 + ";"+ y3 + ") не входит в заданный вами прямоугольник.");
        }
    }
}
