
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Etunimi: ");
            String etunimi = lukija.nextLine();
            if (etunimi.isEmpty()) {
                break;
            }        
            System.out.print("Sukunimi: ");
            String sukunimi = lukija.nextLine();

            System.out.print("Henkilötunnus: ");
            String hetu = lukija.nextLine();
        
            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi, hetu));
        }
        System.out.println("");
        for (Henkilotieto henkilotieto: henkilotiedot) {
            System.out.println( henkilotieto.getEtunimi() + " " + henkilotieto.getSukunimi());
        }
    }
}
