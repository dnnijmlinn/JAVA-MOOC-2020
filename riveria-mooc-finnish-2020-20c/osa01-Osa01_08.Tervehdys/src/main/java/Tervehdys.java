
import java.util.Scanner;

public class Tervehdys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Mikä on nimesi?");
        String kysymys = lukija.nextLine();
        System.out.println("Hei " + kysymys);

    }
}
