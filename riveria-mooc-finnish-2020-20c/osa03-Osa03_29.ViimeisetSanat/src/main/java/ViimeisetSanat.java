
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int i =0;
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] palat = luettu.split(" ");
            for(i=0; i<palat.length; i++){
            }
            System.out.println(palat[i-1]);
        }
        
    }
}



    

