
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String lause = lukija.nextLine();
        String[] palat = lause.split(" ");
        String lause2 = lukija.nextLine();
        String[] palat2 = lause2.split(" ");


        for (int i = 0; i < palat.length; i++) {
            System.out.println(palat[i]);
            if(lause.equals("")){
                break;
            }
        }
        for (int i = 0; i < palat2.length; i++) {
            System.out.println(palat2[i]);
            if(lause.equals("")){
                break;
            }
        }
        
    }
}
