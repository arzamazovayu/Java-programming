package lab6;

import java.util.Scanner;

public class MainUser {
    private int age;

    MainUser(int age){
        this.age = age;
    }

    Scanner scanner = new Scanner(System.in);

    void getUserAge(Scanner scanner){
        System.out.println("Введите возраст:\n");
        int age = scanner.nextInt();
        System.out.println("Возраст: " + age);
    }
}
