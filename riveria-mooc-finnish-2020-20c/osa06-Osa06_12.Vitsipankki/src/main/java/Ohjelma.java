
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {

        Vitsipankki pankki = new Vitsipankki();
        pankki.lisaaVitsi("Mikä on punaista ja tuoksuu siniselle maalille? - Punainen maali.");
        pankki.lisaaVitsi("Mikä on sinistä ja tuoksuu punaiselle maalille? - Sininen maali.");

        System.out.println("Arvotaan vitsejä:");
        for (int i = 0; i < 5; i++) {
            System.out.println(pankki.arvoVitsi());
        }

        System.out.println("");
        System.out.println("Tulostetaan vitsit:");
        pankki.tulostaVitsit();


    }
}
