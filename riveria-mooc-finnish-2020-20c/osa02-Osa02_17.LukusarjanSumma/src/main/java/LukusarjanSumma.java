
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");   
        int doo = Integer.valueOf(lukija.nextLine());

        int sum = (doo * (doo + 1)) /2;
        System.out.println(sum);
        
    

    
        
    }
}
