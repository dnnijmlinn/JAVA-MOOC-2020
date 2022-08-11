
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int i = 100;
        int numero = Integer.valueOf(lukija.nextLine());
        while (numero <= i) {
            System.out.println(numero);
            numero++;
        
        }

    }
}
