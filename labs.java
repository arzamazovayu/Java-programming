// initial comment for saving a new file
public class labs {

    public static void main(String[] args){

        System.out.println("Первое задание:");
        FirstTask();
        System.out.println("Второе задание:");
        SecondTask();
        System.out.println("Третьяе задание:");
        ThirdTask();
        System.out.println("Четвёртое задание:");
        FourthTask();
        System.out.println("Пятое задание:");
        FifthTask();
        System.out.println("Шестое задание:");
        SixthTask();
    }

    public static void FirstTask () {
        String str1 = "Я";
        String str2 = "хорошо";
        String str3 = "знаю";
        String str4 = "Java";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

    public static void SecondTask () {

        double y1 = 10;
        double y2 = 3;
        double x1 = (46 + 10) * (y1/y2);
        int x2 = (29) * (4) * (-15);

        System.out.println(x1);
        System.out.println(x2);
    }

    public static void ThirdTask () {

        int number = 10500;
        int result = (number/10)/10;

        System.out.println(result);
    }

    public static void FourthTask () {

        double val1 = 3.6;
        double val2 = 4.1;
        double val3 = 5.9;
        double result = val1 * val2 * val3;

        System.out.println(result);
    }

    public static void FifthTask () {

        Scanner scanner = new Scanner(System.in);

        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();
        int in3 = scanner.nextInt();

        System.out.printf("%d \n%d \n%d", in1, in2, in3);
    }

    public static void SixthTask () {

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