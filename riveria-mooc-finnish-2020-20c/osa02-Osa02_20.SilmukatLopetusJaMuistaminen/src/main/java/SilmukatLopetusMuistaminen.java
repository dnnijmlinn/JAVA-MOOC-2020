
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luvut: ");
        int summa = 0;
        int lukuja = 0;
        int parillisia = 0;
        int parittomia = 0;
        
        // 1.  Kiitos ja näkemiin!
        while (true) {
            int numero = Integer.valueOf(lukija.nextLine());
            if (numero == -1) {
                System.out.println("Kiitos ja näkemiin!");
                break;
            }
            //2. Summa: 
            summa = summa + numero;
            // 3. Lukuja:
            lukuja = lukuja +1;
            // 5. Parillisia ja Parittomia
            if (numero % 2 ==0) {
                parillisia = parillisia +1;
            } 
            if (numero % 2 ==1) {   
                parittomia = parittomia +1;
            }
        }
        // 4. Keskiarvo: 
        double keski = 1.0 * summa / (lukuja);
        //2.
        System.out.println("Summa: " + summa);
        //3.
        System.out.println("Lukuja: " + lukuja);
        //4.
        System.out.println("Keskiarvo: " + keski);
        //5.
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia: " + parittomia);
    }
}
