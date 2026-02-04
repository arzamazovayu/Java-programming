package lab3;

public class Car {
    private String color;
    private String name;
    private int weight;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
        color = "red";
        name = "KIA Ceed";
        weight = 1350;
    }

    public void showCars() {
        if (weight == 0) {
            System.out.println("Автомобиль цвета " + color + " весит н/д");
        } else{
        System.out.println("Автомобиль цвета " + color + " весит " + weight);
        }
    }

    public static void main(String[] args) {
        Car colorCar = new Car("Blue");
        Car heavyCar = new Car("Brown", 2630);

        colorCar.showCars();
        heavyCar.showCars();
    }
}

