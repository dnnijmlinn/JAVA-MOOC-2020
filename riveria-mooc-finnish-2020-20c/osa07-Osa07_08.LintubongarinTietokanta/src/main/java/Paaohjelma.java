import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        LintuKorppi lintuBongari = new LintuKorppi();

        while (true) {
            System.out.print("? ");
            String kommento = lukija.nextLine();
            if (kommento.equalsIgnoreCase("lopeta")) {
                break;
            } else if (kommento.equalsIgnoreCase("lisaa")) {
                uusLintu(lukija, lintuBongari);
            } else if (kommento.equalsIgnoreCase("nayta")) {
                System.out.println("Lintu?");
                String lintu = lukija.nextLine();
                naytaLintu(lintu, lintuBongari);
            } else if (kommento.equalsIgnoreCase("tilasto")) {
                lintuBongari.naytaKaikki();
            } else if (kommento.equalsIgnoreCase("havainto")) {
                System.out.print("Mikä havaittu? ");
                String lintu = lukija.nextLine();
                lisaaTilastoon(lintu, lintuBongari);
            }
        }
    }

    private static void naytaLintu(String lintuEsim, LintuKorppi lintuBongari) {
        for (Lintu lintu : lintuBongari.getLinnut()) {
            if (lintu.getNimi().equalsIgnoreCase(lintuEsim) || lintu.getLatinaNimi().equals(lintu)) {
                System.out.println(lintu);
                return;
            }
        }
        System.out.println("Ei ole lintu!");
    }

    private static void lisaaTilastoon(String lintuEsim, LintuKorppi lintuBongari) {
        for (Lintu lintu : lintuBongari.getLinnut()) {
            if (lintu.getNimi().equalsIgnoreCase(lintuEsim) || lintu.getLatinaNimi().equals(lintu)) {
                lintu.increaseKerrat();
                return;
            }
        }
        System.out.println("Ei ole lintu!");
    }

    private static void uusLintu(Scanner lukija, LintuKorppi lintuBongari) {
        System.out.print("Nimi: ");
        String nimi = lukija.nextLine();
        System.out.print("Latinakielinen nimi: ");
        String latinaNimi = lukija.nextLine();
        lintuBongari.uusLintu(nimi, latinaNimi);
    }

}