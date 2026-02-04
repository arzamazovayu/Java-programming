package lab4;

public class DividedNumbers {
    public static void divide (){
        for (int i = 1; i < 101; i++) {
            if (i%3 == 0 & i%5 == 0){
                System.out.print("Делится на 3 и на 5: " + i + "\n");
            } else if (i%3 == 0){
                System.out.print("Делится на 3: " + i + "\n");
            } else if (i%5 == 0){
                System.out.print("Делится на 5: " + i + "\n");
            }
        }
    }

    public static void main(String[] args) {
        divide();
    }
}
