
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();  
                                  
        ArrayList<Urheilu> urheilut = lueUrheilut(tiedosto);

        System.out.print("Minkä nimisen joukkueen tiedot tulostetaan?");
        String nimisen = lukija.nextLine();  
        int match =0; 
        int wins = 0; 
        int losses = 0;  

        for (Urheilu urheilu : urheilut) {
            if (urheilu.getkotijoukkeen().equalsIgnoreCase(nimisen) || urheilu.getvierasjoukkueen().equalsIgnoreCase(nimisen)) {
                match++;
                if (urheilu.getkotijoukkeen().equalsIgnoreCase(nimisen)) {
                    if (urheilu.getkotijoukkueenpisteet() >= urheilu.getvierasjoukkueenpisteet()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (urheilu.getvierasjoukkueen().equalsIgnoreCase(nimisen)) {
                    if (urheilu.getkotijoukkueenpisteet() < urheilu.getvierasjoukkueenpisteet()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        }
        System.out.println("Otteluita: " + match);
        System.out.println("Voittoja: " + wins);
        System.out.println("Tappioita: " + losses);
    }
    
    public static ArrayList<Urheilu> lueUrheilut(String tiedosto) {
        ArrayList<Urheilu> urheilut = new ArrayList<>();
        try (Scanner tiedolukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedolukija.hasNextLine()) {
                String nimi = tiedolukija.nextLine();
                String[] palat = nimi.split(",");
                String kotijoukkeen = palat[0];
                String vierasjoukkueen = palat[1];
                int kotijoukkueenpisteet = Integer.valueOf(palat[2]);
                int vierasjoukkueenpisteet = Integer.valueOf(palat[3]);
                urheilut.add(new Urheilu(kotijoukkeen, vierasjoukkueen, kotijoukkueenpisteet, vierasjoukkueenpisteet ));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return urheilut;
    }
}
