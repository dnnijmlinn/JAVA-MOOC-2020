
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int max = 0;

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                System.out.println("");

                break;
            }
            for(int i=0; i<luettu; i++){
                if (max<i){
                    max=i;
                }
            }
            lista.add(luettu);
        }
        int res=max+1;
        System.out.println(res);

        // toteuta listan suurimman luvun selvittäminen tänne
    }
}
