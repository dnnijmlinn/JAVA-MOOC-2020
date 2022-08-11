
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(true){
            String loppu = lukija.nextLine();
            if(loppu.equalsIgnoreCase("loppu")) {
                break;
            }

            int num = Integer.valueOf(loppu);
            System.out.println(num*num*num);
        }

    }
}
