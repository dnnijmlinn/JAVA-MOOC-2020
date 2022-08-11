
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        System.out.println("");
        int summa=0;
        for(int i=0; i<lista.size(); i++){
            int num=lista.get(i);
            if(num==num){
                summa=summa+num;
                
            }
            
        }    
        int su=lista.size();
                double keski=(1.0 * summa)/su;
                System.out.println("Keskiarvo: " + keski);
    }
}
