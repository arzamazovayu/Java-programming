package lab3;

public class Tree {
    int age;
    boolean alive;
    String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, String name, boolean alive) {
        this.age = age;
        this.name = name;
        this.alive = alive;
    }

    public Tree() {
        System.out.print("Пустой конструктор без параметров сработал.");
    }

    public static void main(String[] args) {
        Tree birch = new Tree(25, "Betula");
        Tree aspen = new Tree(36, "Tremula", true);
        Tree log = new Tree();
    }
}
