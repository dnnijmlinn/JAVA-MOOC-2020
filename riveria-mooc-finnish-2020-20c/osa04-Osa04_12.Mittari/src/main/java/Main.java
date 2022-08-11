
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Mittari m = new Mittari();
        

        while(!m.taynna()) {
            System.out.println("Ei täynnä! Mitta: " + m.mitta());
            m.lisaa();
        }

        System.out.println("Täynnä! Mitta: " + m.mitta());
        m.vahenna();
        System.out.println("Ei täynnä! Mitta: " + m.mitta());
    }
}
