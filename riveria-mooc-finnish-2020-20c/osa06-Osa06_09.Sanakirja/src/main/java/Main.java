
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        Sanakirja kirja = new Sanakirja();

        Tekstikayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(lukija, kirja);
        kayttoliittyma.kaynnista();
        System.out.println(kirja.kaanna("hauki")); // tulostaa merkkijonon "pike"


    }
}
