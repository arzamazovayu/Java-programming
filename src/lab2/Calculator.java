package lab2;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s",
        sum(1, 3),
        sum(1.5, 3.5),
        sum(3000000000L, 5000000000L),

        subst(10, 3),
        subst(1.5, 2.5),
        subst(30000000000L, 5000000000L),

        mult(6, 2),
        mult(1.5, 3.5),
        mult(3000000000L, 7000000000L),

        divide(9, 3),
        divide(1.5, 0.5),
        divide(3000000000L, 6000000000L)
        );
    }

    public static double sum(int x, int y){
        double a = x + y;
        return a;
    }

    public static double sum(double x, double y){
        double a = x + y;
        return a;
    }

    public static double sum(long x, long y){
        double a = x + y;
        return a;
    }

    public static double subst(int x, int y){
        double a = x - y;
        return a;
    }

    public static double subst(double x, double y){
        double a = x - y;
        return a;
    }

    public static double subst(long x, long y){
        double a = x - y;
        return a;
    }

    public static double mult(int x, int y){
        double a = x * y;
        return a;
    }

    public static double mult(double x, double y){
        double a = x * y;
        return a;
    }

    public static double mult(long x, long y){
        double a = x * y;
        return a;
    }

    public static double divide(int x, int y){
        double a = x * y;
        return a;
    }

    public static double divide(double x, double y){
        double a = x * y;
        return a;
    }

    public static double divide(long x, long y){
        double a = x * y;
        return a;
    }
}
