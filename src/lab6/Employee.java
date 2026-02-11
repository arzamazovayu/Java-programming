package lab6;

public class Employee extends Human implements HumanInterface
{
    String bankName;

    public Employee (String name, String secondName, String bankName){
        super(name, secondName);
        this.bankName = bankName;
    }

    public void out(){
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + secondName);
        System.out.println("Название банка: " + bankName);
    }

    @Override
    void outHuman() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + secondName);
    }
}
