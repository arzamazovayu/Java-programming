// initial comment for saving a new file
public class labs {

    public static void main(String[] args){

        System.out.println("Первое задание:");
        firstTask();
        System.out.println("Второе задание:");
        secondTask();
        System.out.println("Третьяе задание:");
        thirdTask();
        System.out.println("Четвёртое задание:");
        fourthTask();
        System.out.println("Пятое задание:");
        fifthTask();
        System.out.println("Шестое задание:");
        sixthTask();
    }

    public static void firstTask () {
        String str1 = "Я";
        String str2 = "хорошо";
        String str3 = "знаю";
        String str4 = "Java";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

    public static void secondTask () {

        double y1 = 10;
        double y2 = 3;
        double x1 = (46 + 10) * (y1/y2);
        int x2 = (29) * (4) * (-15);

        System.out.println(x1);
        System.out.println(x2);
    }

    public static void thirdTask () {

        int number = 10500;
        double result = ((double)number/(double)10)/(double)10;

        System.out.println(result);
    }

    public static void fourthTask () {

        double val1 = 3.6;
        double val2 = 4.1;
        double val3 = 5.9;
        double result = val1 * val2 * val3;

        System.out.println(result);
    }

    public static void fifthTask () {

        Scanner scanner = new Scanner(System.in);

        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();
        int in3 = scanner.nextInt();

        System.out.printf("%d \n%d \n%d", in1, in2, in3);
    }

    public static void sixthTask () {

        System.out.print("Введите целое число b:");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (b > 100) {

            System.out.println("Выход за пределы диапазона");

        } else if (b%2 > 0) {

            System.out.println("Нечётное");

        } else {

            System.out.println("Чётное");

        }
    }
}
