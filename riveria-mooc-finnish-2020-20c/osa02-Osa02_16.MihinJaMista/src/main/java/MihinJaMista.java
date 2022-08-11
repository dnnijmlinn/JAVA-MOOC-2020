
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");  
        int numero = Integer.valueOf(lukija.nextLine());
 
        System.out.println("Mistä lähtien?");   
        int i = Integer.valueOf(lukija.nextLine());
        while (i <= numero) {
            System.out.println(i);
            i++;
        }
    }
}
