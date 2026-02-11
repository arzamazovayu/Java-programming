package lab6;

public class Truck extends Car {
    public int wheelsNumber;
    public int maxWeight;

    public Truck(int w, String m, char c, float s, int wN, int mW){
        weight = w;
        model = m;
        color = c;
        speed = s;
        wheelsNumber = wN;
        maxWeight = mW;
    }

    public void newWheels (int wN) {
        wheelsNumber = wN;
        System.out.println("Количество колёс: " + wheelsNumber + weight);
    }
}
