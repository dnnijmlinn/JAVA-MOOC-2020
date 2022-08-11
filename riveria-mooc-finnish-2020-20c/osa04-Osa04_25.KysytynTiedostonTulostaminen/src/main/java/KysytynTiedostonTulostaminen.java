
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);
        String faile = lukija.nextLine();

        try (Scanner data = new Scanner(Paths.get(faile))){

            while (data.hasNextLine()) {
                String rivi = data.nextLine();
                System.out.println(rivi);

            }
        }
    }
}
