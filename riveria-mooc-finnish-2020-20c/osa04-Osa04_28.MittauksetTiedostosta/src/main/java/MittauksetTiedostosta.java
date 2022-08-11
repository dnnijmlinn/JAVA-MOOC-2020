
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class MittauksetTiedostosta {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();              //1txt

        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());

        int i =0;

        try (Scanner data = new Scanner(Paths.get(tiedosto))) {

            while (data.hasNextLine()) {
                String nimi = data.nextLine();
                int num = Integer.valueOf(nimi);

                if (num>=alaraja && num<=ylaraja) {
                    i++;
                }
            }
            System.out.println("Lukuja: " + i);

        }
    }

}
