
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int i=0;
        while(true){
            String jono = lukija.nextLine();
            if(jono.equals("loppu")){
                break;
            }
            i++;
        }
        System.out.println(i);

    }
}
