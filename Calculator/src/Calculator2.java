import java.util.Scanner;

public class Calculator2 {

    String companie;
    int nr_taste;
    int nr1 = 0;
    int nr2 = 0;
    int counter = 0;
    int counter2 = -1;
    int rezultat_Partial;
    int rezultat_Final;
    String symbol;
    Scanner var1;
    String[] array = new String[1000];


    public Calculator2() {
        this.companie = companie;
        this.nr_taste = nr_taste;
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.rezultat_Partial = rezultat_Partial;
        this.rezultat_Final = rezultat_Final;
        this.symbol = symbol;
        this.var1 = var1;
    }

    public void start() {
        System.out.println("Va multumim ca ati accesat " +
                "calculatorul nostru, pentru a incepe, apasati tasta start " +
                "sau enter");
        System.out.println("====================");
        System.out.println();
    }

    public int adunare() {

        rezultat_Partial = nr1 + nr2;
        return rezultat_Partial;
    }

    public int scadere() {
        rezultat_Partial = nr1 - nr2;
        return rezultat_Partial;
    }

    public int inmultire() {
        rezultat_Partial = nr1 * nr2;
        return rezultat_Partial;
    }

    public int impartire() {
        rezultat_Partial = nr1 / nr2;
        return rezultat_Partial;
    }

    public void citire_numere() {
        counter++;
        System.out.println("va rugam sa introduceti date");
        Scanner var1 = new Scanner(System.in);
        int buff = var1.nextInt();
        if (counter % 2 == 0) {
            nr2 = buff;
        } else {
            nr1 = buff;
        }

    }

    public void afisare_rezultat() {

        if (array[counter2 - 1] == "+") {
            System.out.println(array[counter2 - 1]);
            rezultat_Partial = adunare();
        }
        if (array[counter2 - 1] == "-") {
            System.out.println(array[counter2 - 1]);
            rezultat_Partial = scadere();
        }
        if (array[counter2 - 1] == "*") {
            System.out.println(array[counter2 - 1]);
            rezultat_Partial = inmultire();
        }
        if (array[counter2 - 1] == "/") {
            System.out.println(array[counter2 - 1]);
            rezultat_Partial = impartire();
        }
        System.out.println("rezultatul dumneavoastra final este "
                + rezultat_Partial);
    }

    public boolean stop() {
        citire_numere();
        citire_symbol_si_decizie();
        return symbol.equals("=");
    }

    public void citire_symbol_si_decizie() {
        counter2++;
        System.out.println("introduceti operatorul");
        Scanner scanner = new Scanner(System.in);
        symbol = scanner.nextLine();
        array[counter2] = symbol;
        if (symbol.equals("+")) {
            System.out.println(adunare());
        }
        if (symbol.equals("-")) {
            System.out.println(scadere());
        }
        if (symbol.equals("*")) {
            System.out.println(inmultire());
        }
        if (symbol.equals("/")) {
            System.out.println(impartire());
        }
        if (symbol.equals("=")) {
            afisare_rezultat();
        }
    }
}





