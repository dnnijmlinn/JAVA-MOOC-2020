
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int sur = 0;
        int lukumaara = 0;
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
        
            String[] palat = luettu.split(",");
            if(Integer.valueOf(palat[1])>sur){
                sur=Integer.valueOf(palat[1]);
            }
        }
        System.out.println("Vanhimman ikä: " + sur);
        

    }
}
