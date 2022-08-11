
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
        
    }

    public static int tulostaTyylikkaasti(int[] taulukko) {
        
        int indeksi = 0;
        int luku=0;
        while (indeksi < taulukko.length) {
            luku = taulukko[indeksi];
            System.out.print(luku);
            if(indeksi<taulukko.length-1){
                System.out.print(", ");
            }
            
            indeksi = indeksi + 1;
        }
        
       
        return luku;    
    }
}
