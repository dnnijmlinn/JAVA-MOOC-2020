import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mistä luetaan? ");
        String tiedosto = lukija.nextLine();
        ArrayList<Resepti> reseptit = lueReseptitTiedostosta(tiedosto);
        System.out.println(
                "Komennot:\n"
                + "listaa - listaa reseptit\n"
                + "lopeta - lopettaa ohjelman\n"
                + "hae nimi - hakee reseptiä nimen perusteella\n"
                + "hae keittoaika - hakee reseptiä keittoajan perusteella\n"
                + "hae aine - hakee reseptiä raaka-aineen perusteella");

        while (true) {
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            System.out.println("");
            if (komento.equalsIgnoreCase("lopeta")) {
                break;
            }
            lueKomento(komento, reseptit, lukija);
        }
    }

    public static void lueKomento(String komento, ArrayList<Resepti> reseptit, Scanner syotto) {
        if (komento.equalsIgnoreCase("listaa")) {
            tulostaReseptit(reseptit);
            System.out.println("");
        }
        if (komento.equalsIgnoreCase("hae nimi")) {
            tulostaReseptiNimella(reseptit, syotto);
            System.out.println("");
        }
        if (komento.equalsIgnoreCase("hae keittoaika")) {
            tulostaReseptiKeittoajalla(reseptit, syotto);
            System.out.println("");
        }
        if (komento.equalsIgnoreCase("hae aine")) {
            tulostaReseptiAineella(reseptit, syotto);
            System.out.println("");
        }
    }

    public static void tulostaReseptiAineella(ArrayList<Resepti> reseptit, Scanner lukija) {
        System.out.println("Mitä raaka-ainetta haetaan: ");
        String sana = lukija.nextLine();
        System.out.println("Reseptit:");
        for (Resepti resepti : reseptit) {
            if (resepti.getAineosat().contains(sana)) {
                System.out.println(resepti.toString());
            }
        }
    }

    public static void tulostaReseptiNimella(ArrayList<Resepti> reseptit, Scanner lukija) {
        System.out.print("Mitä haetaan: ");
        String sana = lukija.nextLine();
        System.out.print("Reseptit:");
        for (Resepti resepti : reseptit) {
            if (resepti.getNimi().contains(sana)) {
                System.out.println(resepti.toString());
            }
        }
    }

    public static void tulostaReseptiKeittoajalla(ArrayList<Resepti> reseptit, Scanner lukija) {
        System.out.println("Keittoaika korkeintaan:");
        int aika = Integer.valueOf(lukija.nextLine());
        System.out.println("Reseptit:");
        for (Resepti resepti : reseptit) {
            if (resepti.getAika() <= aika) {
                System.out.println(resepti.toString());
            }
        }
    }

    public static void tulostaReseptit(ArrayList<Resepti> reseptit) {
        System.out.println("Reseptit: ");
        for (Resepti resepti : reseptit) {
            System.out.println(resepti.toString());
        }
    }

    public static ArrayList<Resepti> lueReseptitTiedostosta(String tiedostonNimi) {
        ArrayList<Resepti> reseptit = new ArrayList<>();
        ArrayList<String> reseptinOsat = new ArrayList<>();
        String reseptinNimi;
        int reseptinAika;
        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedostonNimi))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                if (!rivi.isEmpty()) {
                    reseptinOsat.add(rivi);
                } else {
                    reseptinNimi = reseptinOsat.get(0);
                    reseptinAika = Integer.valueOf(reseptinOsat.get(1));
                    reseptinOsat.remove(0);
                    reseptinOsat.remove(0);
                    reseptit.add(new Resepti(reseptinNimi, reseptinAika, reseptinOsat));
                    reseptinOsat.clear();
                }
            }
            if (!reseptinOsat.isEmpty()) {
                reseptinNimi = reseptinOsat.get(0);
                reseptinAika = Integer.valueOf(reseptinOsat.get(1));
                reseptinOsat.remove(0);
                reseptinOsat.remove(0);
                reseptit.add(new Resepti(reseptinNimi, reseptinAika, reseptinOsat));
                reseptinOsat.clear();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return reseptit;

    }
}