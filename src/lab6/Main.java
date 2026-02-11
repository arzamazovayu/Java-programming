package lab6;

import java.util.Scanner;

public class Main {
    public int numb;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:\n");
        int numb = scanner.nextInt();
    }

    public Main(int numb){
        this.numb = numb;
    }
}
