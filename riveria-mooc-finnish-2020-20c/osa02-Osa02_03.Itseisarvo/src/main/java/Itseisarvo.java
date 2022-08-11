
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int numero = Integer.valueOf(lukija.nextLine());
        if (numero < 0) {
            System.out.println( numero * (-1));
        } else {
            System.out.println(numero);
        }

    }
}
