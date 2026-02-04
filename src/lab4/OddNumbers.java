package lab4;

public class OddNumbers {
    public static void count (){
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0){
                System.out.print(i + "\n");
            }
        }
    }

    public static void main(String[] args) {
        count();
    }
}
