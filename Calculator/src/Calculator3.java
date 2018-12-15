import java.util.Scanner;

public class Calculator3 {

    int rezultat_partial;
    int rezultat_final;
    String symbol;
    int i;
    int nr1, nr2;
    int[] array_numere = new int[i];
    int counter;

    public Calculator3() {
        this.rezultat_partial = rezultat_partial;
        this.rezultat_final = rezultat_final;
        this.symbol = symbol;
        this.i = i;
        this.array_numere = array_numere;
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.counter = counter;
    }

    // metoda de atribuire a variabile
    public void citire_numere()

    {
        Scanner buffer = new Scanner(System.in);
        int var1 = buffer.nextInt();
        array_numere[i]=var1;
        i++;

    }


    public int adunare() {
        rezultat_partial = nr1 + nr2;
        return rezultat_partial;
    }

    public int scadere() {
        rezultat_partial = nr1 - nr2;
        return rezultat_partial;
    }

    public int inmultire() {
        rezultat_partial = nr1 * nr2;
        return rezultat_partial;
    }

    public int impartire() {
        rezultat_partial = nr1 / nr2;
        return rezultat_partial;
    }

    public int afisare_rezultat() {

        System.out.println("rezultatul dumneavoastra final este "
                + rezultat_partial);
        return rezultat_partial;


    }

    public void citire_symbol_si_decizie() {
        System.out.println("introduceti operatorul");
        Scanner scanner = new Scanner(System.in);
        symbol = scanner.next();
        if (symbol.equals("+")) {
            adunare();
        }
        if (symbol.equals("-")) {
             scadere();
        }
        if (symbol.equals("*")) {
             inmultire();
        }
        if (symbol.equals("/")) {
            impartire();
        }
        if (symbol.equals("=")) {
            afisare_rezultat();

        }
    }
    // aici trebuie sa intre un mare for in
    // care sa creasca numarul de variabile
    // si sa aplici metode pe ele
    //sa vedem ce o sa iasa.


}
