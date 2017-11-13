package task_11;
import java.util.Scanner;
/**
 * Created by oGGi on 13.11.2017.
 */
class Converter {
    private static Scanner in = new Scanner(System.in);
    private static String s;
    private static double weight;

    static void grams() {
        System.out.println("Введите число в граммах");
        s = in.nextLine();
        weight = Double.parseDouble(s);

            if (getMega(weight) != 0) {
                System.out.print(getMega(weight) + " тонн ");
            }
            if (getKilo(weight) != 0) {
                System.out.print(getKilo(weight) + " килограмм ");
            }
            if (getDeca(weight) != 0) {
                System.out.print(getDeca(weight) + " грамм ");
            }
            if (getMilli(s) != 0) {
                System.out.print(getMilli(s) + " миллиграмм ");
            }
        System.out.println();
    }

    static void kilograms() {
        System.out.println("Введите число в килограммах");
        s = in.nextLine();
        weight = Double.parseDouble(s);

            if (getMega(weight) != 0) {
                System.out.print(getMega(weight) + " килотонн ");
            }
            if (getKilo(weight) != 0) {
                System.out.print(getKilo(weight) + " тон ");
            }
            if (getDeca(weight) != 0) {
                System.out.print(getDeca(weight) + " килограмм ");
            }
            if (getMilli(s) != 0) {
                System.out.print(getMilli(s) + " грамм ");
            }
        System.out.println();
    }

    static void tons() {
        System.out.println("Введите число в тоннах ");
        s = in.nextLine();
        weight = Double.parseDouble(s);

            if (getMega(weight) != 0) {
                System.out.print(getMega(weight) + " мегатонн ");
            }

            if (getKilo(weight) != 0) {
                System.out.print(getKilo(weight) + " килотонн ");
            }
            if (getDeca(weight) != 0) {
                System.out.print(getDeca(weight) + " тон ");
            }

            if (getMilli(s) != 0) {
                System.out.print(getMilli(s) + " килограмм ");
            }
        System.out.println();
        }

    private static int getMega(double weight) {
        return (int) (weight / 1000000);

    }

    private static int getKilo(double weight) {
        return (int) ((weight / 1000) - getMega(weight) * 1000);
    }

    private static int getDeca(double weight) {
        return (int) weight % 1000;
    }

    private static long getMilli(String weight) {
        String[] parts = String.valueOf(weight).split("[.]");
        long milli = 0;
        if (parts.length > 1) {
            milli = Long.valueOf(parts[1]);
        }
        return milli;
    }
    }

