package lab4;

public class ArrayCheck {
    public static void main(String[] args) {
        int[] arr1 = {0, 5, -7, 9, 8, 3};
        System.out.print(check(search(arr1)) + "\n");

        int[] arr2 = {111, 0, -1, -3, 33};
        System.out.print(check(search(arr2)) + "\n");
    }

    public static int search(int[] arr){
        int b = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1 || arr[i] == 3){
                b++;
            }
        }
        return b;
    }

    public static boolean check(int b){
        if (b > 0){
            return true;
        } else return false;
    }
}
