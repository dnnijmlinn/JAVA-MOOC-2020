
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu >=9999) {
                break;
            }
            lista.add(luettu);
        }
        System.out.println("");

        int min = lista.get(0);
        for( int i =0; i<lista.size(); i++) {
            int luku=lista.get(i);
            if (min>luku){
                min=luku;
            }
        }
       // System.out.println(min);
        
         //// min !!!!

         for(int i=0; i<lista.size(); i++){
            if(min==lista.get(i)) {
            System.out.println("Pienin luku on " + lista.get(i));
            System.out.println("Pienin luku löytyy indeksistä " + i);
            }
        }
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
    }
}
