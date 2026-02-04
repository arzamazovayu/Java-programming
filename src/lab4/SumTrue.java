package lab4;

import java.util.Scanner;

public class SumTrue {
    public static class ForVar {
        public int first;
        public int second;
        public int third;

        public ForVar(int first, int second, int third){
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

    public static ForVar asking(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите второе  число: ");
        int second = scanner.nextInt();
        System.out.print("Введите третье  число: ");
        int third = scanner.nextInt();

        return new ForVar (first, second, third);
    }

    public static boolean calculating(int first, int second, int third){
        if (first + second == third){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        ForVar v = asking();
        System.out.print("Результат: " + calculating(v.first, v.second, v.third));
    }
}
