package lab4;
import java.util.Arrays;

public class ArrayFirstOrLast {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, -7, 9, 8, -3};
        System.out.print(Arrays.toString(arr1) + "\n");
        System.out.print(cheking(arr1) + "\n");

        int[] arr2 = {3, 257, -62, 0, 9};
        System.out.print(Arrays.toString(arr2) + "\n");
        System.out.print(cheking(arr2) + "\n");

        int[] arr3 = {123};
        System.out.print(Arrays.toString(arr3) + "\n");
        System.out.print(cheking(arr3) + "\n");
    }

    public static boolean cheking(int[] arr){
        if (arr.length < 2){
            System.out.println("Массив должен содержать 2 и более значений!");
            return false;
        }else if (arr[0] == 3 || arr[arr.length-1] == 3){
            return true;
        }else return  false;
    }
}
