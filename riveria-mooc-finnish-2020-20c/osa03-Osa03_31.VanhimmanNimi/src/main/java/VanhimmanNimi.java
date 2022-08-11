
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String nimi ="z";
        int sur =0;
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
        
            String[] palat = luettu.split(",");
            if(Integer.valueOf(palat[1])>sur){
                sur=Integer.valueOf(palat[1]);
                nimi=String.valueOf(palat[0]);
            }
        }
        System.out.println("Vanhimman nimi: " + nimi);

    }
}
