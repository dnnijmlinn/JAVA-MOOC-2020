
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) throws IOException {

        try (Scanner data = new Scanner(Paths.get("data.txt"))){

            while (data.hasNextLine()) {
                String rivi = data.nextLine();
                System.out.println(rivi);

            }
        }

    }
}
