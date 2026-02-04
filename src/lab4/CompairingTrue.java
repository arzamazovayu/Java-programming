package lab4;

public class CompairingTrue {
    public static boolean compairing(int z, int x, int c){
        if (x > z & c > x){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        SumTrue.ForVar input = SumTrue.asking();
        System.out.print("Результат: " + compairing(input.first, input.second, input.third));
    }
}
