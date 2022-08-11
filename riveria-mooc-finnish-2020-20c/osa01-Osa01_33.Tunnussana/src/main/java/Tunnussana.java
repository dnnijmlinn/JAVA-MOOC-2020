
import java.util.Scanner;

public class Tunnussana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Tunnussana"); 
        String nimi = lukija.nextLine();
        if ( nimi.equals("Caput Draconis")) {
            System.out.println("Tervetuloa!");
        } else {
            System.out.println("Hus siitä!");
        }
    }
}
