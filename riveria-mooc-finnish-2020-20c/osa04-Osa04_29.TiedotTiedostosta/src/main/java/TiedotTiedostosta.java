
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mikä tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();                            //data.txt

        try (Scanner data = new Scanner(Paths.get(tiedosto))) {
            while (data.hasNextLine()) {
                String nimi = data.nextLine();

                String[] palat = nimi.split(",");
                String nimistr = palat[0];
                int ika = Integer.valueOf(palat[1]);
                if(ika == 1){
                    System.out.println(nimistr + ", ikä: " + ika + " vuosi");

                } else {
                    System.out.println(nimistr + ", ikä: " + ika + " vuotta");

                }
            }
        }

    }
}
