package lab6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InheritUser user = new InheritUser("Bob", 30);
        user.getUserAge(scanner);
    }
}
