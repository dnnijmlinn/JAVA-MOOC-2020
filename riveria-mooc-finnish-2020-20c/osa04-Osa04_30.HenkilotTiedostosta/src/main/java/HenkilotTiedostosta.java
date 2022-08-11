
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotTiedostosta {

    public static void main(String[] args)  {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<Henkilo> henkilot = lueHenkilot(tiedosto);
        System.out.println("Henkilöitä: " + henkilot.size());
        System.out.println("Henkilöt:");
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);

        }
    }

    public static ArrayList<Henkilo> lueHenkilot(String tiedosto)  {
        ArrayList<Henkilo> henkilot = new ArrayList<>();

        try (Scanner lukija = new Scanner(Paths.get(tiedosto))) {

            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
        
                String[] palat = rivi.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);
                henkilot.add(new Henkilo(nimi, ika));
            }
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return henkilot;

    }
}
