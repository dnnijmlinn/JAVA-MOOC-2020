
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku = Integer.valueOf(lukija.nextLine());
        int numero = Integer.valueOf(lukija.nextLine());
        int sum = ( luku + numero );
        double neliojuuri = Math.sqrt(sum);
        System.out.println(neliojuuri);


    }
}
