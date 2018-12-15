public class Program4 {

    public static void main(String[] args) {

        int counter;
        Calculator4 casio = new Calculator4();

        casio.start();
//        while (!casio.stop()){
//            casio.citire_numere();
//            casio.citire_symbol_si_decizie();
//            System.out.println(casio.nr1 +" "+ casio.nr2);
//        }
//        System.exit(0);

        casio.citire_numere();
        casio.citire_symbol_si_decizie();
        casio.citire_numere();
        casio.citire_symbol_si_decizie();

    }


}



