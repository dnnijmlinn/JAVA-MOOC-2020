
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<kirja> kirjat = new ArrayList<>();

        while(true){
            System.out.print("Nimi: ");
            String name = lukija.nextLine();

            if (name.isEmpty()) { 
                break;
            }

            System.out.print("Sivuja:  ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.print("Julkaisuvuosi:  ");
            int vuosi = Integer.valueOf(lukija.nextLine());

            kirjat.add(new kirja(name, sivuja, vuosi));
        }
        System.out.println("");

        System.out.print("Mitä tulostetaan? ");
        String tulos = lukija.nextLine();

        for (kirja kirja : kirjat) {
            if (tulos.equalsIgnoreCase("kaikki")) {
                System.out.println(kirja);
            }
            if (tulos.equalsIgnoreCase("nimi")) {
                System.out.println(kirja.getNimi());
            }
        }


    }
}
