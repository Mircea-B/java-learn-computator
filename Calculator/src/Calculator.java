import java.util.Scanner;

public class Calculator {

    int nr1 = 0;
    int nr2 = 0;
    double total = 0;
    String symbol;
    Scanner buf1;

    public void adunare() {

        total = nr1 + nr2;

    }

    public void scadere() {

        total = nr1 - nr2;

    }

    public void inmultire() {

        total = nr1 * nr2;

    }

    public void impartire() {

        total = nr1 / nr2;

    }


    public void citire() {
        System.out.println("introduceti un numar ");
        Scanner buf1 = new Scanner(System.in);
        int var1 = buf1.nextInt();
        if (var1 == 0) {
            nr1 = var1;
        } else {
            nr2 = var1;
        }
    }

    public Calculator() {
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.total = total;
        this.symbol = symbol;
        this.buf1 = buf1;
    }

    public void afisare_rezultat() {

        System.out.println("Rezultatul dumenavoastra este"
                + total);
    }

    public void citireoperator() {

        System.out.println("introduceti operatorul");
        Scanner buf1 = new Scanner(System.in);
        symbol = buf1.next();
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
}
