package lab6;

import java.util.Scanner;

public class InheritUser extends MainUser{
    private String name;

    InheritUser(String name, int age){
        super(age);
        this.name = name;
    }

    @Override
    void getUserAge(Scanner scanner){
        System.out.println("Введите имя:\n");
        String name = scanner.nextLine();
        System.out.println("Имя: " + name);
    }
}
