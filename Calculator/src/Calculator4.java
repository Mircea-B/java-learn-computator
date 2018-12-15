import java.util.Scanner;

public class Calculator4 {

    int[] numere;
    String[] simboluri;
    int rezultat, rezultat_final;
    int nr_taste;
    int nr1 = 0;
    int nr2 = 0;
    int counter = 0;
    int counter2 = 0;
    int rezultat_Partial;
    int rezultat_Final;
    String symbol;
    Scanner var1;

    public Calculator4() {
        this.numere = numere;
        this.simboluri = simboluri;
        this.rezultat = rezultat;
        this.rezultat_final = rezultat_final;
        this.nr_taste = nr_taste;
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.counter = counter;
        this.counter2 = counter2;
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
        try (Scanner var1 = new Scanner(System.in)) {
            numere[counter] = var1.nextInt();
        }
        numere[counter]=nr1;

        nr2=numere[counter+1];


//        int buff = var1.nextInt();
//        if (counter % 2 == 0) {
//            nr2 = buff;
//        } else {
//            nr1 = buff;
//        }
//        if (counter == 2) {
//            nr1 = buff;
//            buff = nr2;
//            nr2 = nr1;
//        }

    }

    public int afisare_rezultat() {
        System.out.println("rezultatul dumneavoastra final este "
                + rezultat_Partial);
        return rezultat_Partial;
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
        symbol = scanner.next();
        if (counter2 == 1) {
            citire_numere();
            if (symbol.equals("+")) {
                rezultat_Partial = adunare() + nr2;
            }
            if (symbol.equals("-")) {
                rezultat_Partial = scadere() - nr2;
            }
            if (symbol.equals("*")) {
                rezultat_Partial = inmultire() * nr2;
            }
            if (symbol.equals("/")) {
                rezultat_Partial = impartire() / nr2;
            }
            if (symbol.equals("=")) {
                afisare_rezultat();
            }
        } else {
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
}



