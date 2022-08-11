
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku:");
        int f = Integer.valueOf(lukija.nextLine());
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println("Kertoma on" + result);

    }
}
