package lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class House {
    private int numOfFloors;
    private Calendar builded;
    private String name;

    public House(int numOfFloors, Calendar builded, String name) {
        this.numOfFloors = numOfFloors;
        this.builded = builded;
        this.name = name;
    }

    public static House getHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дома: ");
        String name = scanner.nextLine();
        System.out.print("Введите год постройки: ");
        Calendar builded;
        String date = scanner.nextLine();
        try {
            Date date1 = new SimpleDateFormat("yyyy").parse(date);
            builded = Calendar.getInstance();
            builded.setTime(date1);
        } catch (ParseException e) {
            throw new RuntimeException("Неверный формат даты! Надо ГГГГ");
        }
        System.out.print("Введите количество этажей: ");
        int numOfFloors = scanner.nextInt();

        return new House(numOfFloors, builded, name);
    }

    public void outHouse () {
        System.out.println("Название дома " + name);
        System.out.println("Количество этажей " + numOfFloors);
        System.out.println("Год постройки " + builded.get(Calendar.YEAR));
    }

    public void howOld () {
        Calendar today = Calendar.getInstance();
        int old = today.get(Calendar.YEAR) - builded.get(Calendar.YEAR);
        System.out.println("Возраст дома составляет " + old + " лет.");
    }

    public static void main(String[] args) {

        House house1 = House.getHouse();
        House house2 = House.getHouse();

        house1.outHouse();
        house2.outHouse();

        house1.howOld();
        house2.howOld();
    }
}
