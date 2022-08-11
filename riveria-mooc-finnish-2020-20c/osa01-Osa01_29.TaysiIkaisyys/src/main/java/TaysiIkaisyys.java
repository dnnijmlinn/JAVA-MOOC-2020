
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet?");
        int numero = Integer.valueOf(lukija.nextLine());
        if (numero < 18) {
            System.out.println("Et ole täysi-ikäinen!");
        } else {
            System.out.println("Olet täysi-ikäinen!");
        }

        // Toteuta ohjelmasi tähän. 
    }
}
