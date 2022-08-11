
import java.util.Scanner;

public class AlkioidenArvojenVaihtaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[5];
        taulukko[0] = 1;
        taulukko[1] = 3;
        taulukko[2] = 5;
        taulukko[3] = 7;
        taulukko[4] = 9;

        int indeksi = 0;
        while (indeksi < taulukko.length) {
            System.out.println(taulukko[indeksi]);
            indeksi++;
        }

        System.out.println("");
        System.out.println("Mitkä indeksit vaihdetaan?");
        int num1 = Integer.valueOf(lukija.nextLine());
        int num2 = Integer.valueOf(lukija.nextLine());
        System.out.println("");

        indeksi = 0;
        while (indeksi < taulukko.length) {
            if(taulukko[indeksi]!=taulukko[num1] && taulukko[indeksi]!=taulukko[num2]){
                System.out.println(taulukko[indeksi]);
            }
            if(taulukko[indeksi]==taulukko[num1]){
                System.out.println(taulukko[num2]);
            }
            if(taulukko[indeksi]==taulukko[num2]){
                System.out.println(taulukko[num1]);
            }
            
            indeksi++;
        }
    }

}
