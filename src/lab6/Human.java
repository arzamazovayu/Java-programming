package lab6;

import java.util.Scanner;

abstract class Human{
    String name;
    String secondName;

    public Human (String name, String secondName){
        this.name = name;
        this.secondName = secondName;
    }

    String getName (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        return name;
    }

    String getSecondName (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String secondName = scanner.nextLine();

        return secondName;
    }

    abstract void outHuman ();

}


