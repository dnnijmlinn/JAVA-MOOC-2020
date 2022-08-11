
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Ensimmäinen:");   
        int doo = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");   
        int posle = Integer.valueOf(lukija.nextLine());
        int summa = ((doo + posle)*(posle - doo +1)/2);
        System.out.println( "Summa on " + summa);

    }
}
