
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna pisteet [0-100]:");
        int eka = Integer.valueOf(lukija.nextLine());
        
        if (eka < 0) {
            System.out.println("Arvosana: " + "mahdotonta!");
        } else if (eka < 50 ) {
            System.out.println("Arvosana: " + "hylätty");
        } else if (eka < 60 ) {
            System.out.println("Arvosana: " + "1");
        } else if (eka < 70 ) {
            System.out.println("Arvosana: " + "2");
        } else if (eka < 80 ) {
            System.out.println("Arvosana: " + "3");
        } else if (eka < 90 ) {
            System.out.println("Arvosana: " + "4");
        } else if (eka < 101 ) {
            System.out.println("Arvosana: " + "5");
        } else {
            System.out.println("Arvosana: " + "uskomatonta!");
        }

    }
}
