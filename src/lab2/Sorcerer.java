package lab2;

public class Sorcerer {
    String race;
    int hitPoints;
    int mana;
    String element;

    public Sorcerer(){
        race = "Human";
        hitPoints = 40;
        mana = 20;
        element = "fire";
    }

    public Sorcerer(String race, int hp, int mana, String element){
        this.race = race;
        this.hitPoints = hp;
        this.mana = mana;
        this.element = element;
    }

    public void chooseChar() {
        System.out.println("Your " + race + " sorcerer of " + element + " has " +
                hitPoints + " hp and " + mana + " mana.");
    }

    public static void main(String[] args){
        Sorcerer mySorcerer = new Sorcerer("dworf", 50, 15, "earth");
        mySorcerer.chooseChar();
    }
}
