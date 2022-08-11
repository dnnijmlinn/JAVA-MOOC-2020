
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);


        while (true) {
            System.out.print("> ");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }

        }
    }

}
