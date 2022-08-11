
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        int indeksi = 0;
        int luku=0;
        while (indeksi < taulukko.length) {
            luku = taulukko[indeksi];
            for(int z=0; z<luku; z++){
                System.out.print("*");
            }
            System.out.println("");
           
            
            indeksi = indeksi + 1;
        }
        
       
            
    }

}
