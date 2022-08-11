
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                System.out.println("");
                break;           
            }            
            luvut.add(luku);
        }
        System.out.print("Mistä? ");
            int mista = Integer.valueOf(lukija.nextLine());
        System.out.print("Mihin? ");
            int mihin = Integer.valueOf(lukija.nextLine());
            for(int num=mista; num<=mihin; num++) {
                System.out.println((luvut.get(num)));

            }

    }
}
        //                      System.out.println("");
     //   
     

        //        System.out.println("");

        //        
        ////        
        //        }