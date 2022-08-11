
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Lahjan suuruus?");
        int numero = Integer.valueOf(lukija.nextLine());

        if (numero < 5000 ) {
            System.out.println("Ei veroa!");
        } else if (numero > 4999 && numero < 25001) {
            System.out.println(1 * (100 + ((numero-5000) * 0.08)));
        } else if (numero > 24999 && numero < 55001) {
            System.out.println(1 * (1700 + ((numero-25000) * 0.10)));
        } else if (numero > 54999 && numero < 200001) {
            System.out.println(1 * (4700 + ((numero-55000) * 0.12)));
        } else if (numero > 194999 && numero < 1000001) {
            System.out.println(1 * (22100 + ((numero-200000) * 0.15)));
        } else { 
            System.out.println(1 * (142100 + ((numero-1000000) * 0.17)));
        }
    }
}
