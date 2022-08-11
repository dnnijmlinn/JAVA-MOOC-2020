
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        try (Scanner data = new Scanner(Paths.get(tiedosto))){
            while (data.hasNextLine()) {
                String nimi = data.nextLine();
                if (nimi.contains(etsittava)) {
                    System.out.println("Löytyi!");
                    return;
                }
                
            }
            System.out.println("Ei löytynyt.");

        } catch (Exception e) {
            System.out.println("Tiedoston " + etsittava + "lukeminen epäonnistui.");
        }

        
    }
}
