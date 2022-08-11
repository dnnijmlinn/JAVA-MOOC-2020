
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        
        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.");
        System.out.println("Minkä niminen tarinassa esiintyvä hahmo on?");
        String nimi  = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String ammatti  = lukija.nextLine();
        System.out.println("Tässä tarina:");
        System.out.println("Olipa kerran " + nimi + ", joka oli ammatiltaan " + ammatti + ".");
        System.out.println("Matkatessaan töihin, " + nimi + " mietti arkeaan.");
        System.out.println("Ehkäpä " + nimi + " ei olekaan koko elämäänsä " + ammatti + ".");    
    }
}
