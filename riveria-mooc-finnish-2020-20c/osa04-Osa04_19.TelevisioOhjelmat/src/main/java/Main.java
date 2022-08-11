
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = lukija.nextLine();
            if (name.isEmpty()) { 
                break;
            }
            System.out.println("Pituus: ");
            int pituus = Integer.valueOf(lukija.nextLine());

            ohjelmat.add(new TelevisioOhjelma(name, pituus));
        }
        System.out.println("");
        System.out.print(" Mika pituus?");
        int duration = Integer.valueOf(lukija.nextLine());

        for (TelevisioOhjelma ohjelma: ohjelmat) {
            if (ohjelma.getPituus() <= duration) {
                    System.out.println(ohjelma);
            }
        }
    }
}
