public class Program {

    public static void main(String[] args) {


        System.out.println("start calculator");
        System.out.println("................");


        Calculator calc1 =new Calculator();

        calc1.citire();
        calc1.citireoperator();
        calc1.citire();
        calc1.citireoperator();
        System.out.println(calc1.total);

    }
}
