
public class Summaaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        System.out.println(laskeTaulukonLukujenSumma(taulukko));
        //System.out.print(taulukko);
    }

    public static int laskeTaulukonLukujenSumma(int[] taulukko) {
       
       // System.out.println("taulukon alkiot ovat: ");
        int summa =0;
        int a=0;
        for(int indeksi=0; indeksi < taulukko.length; indeksi++){
            
            summa = summa + taulukko[indeksi];
            a = summa;
        }
        
        System.out.print(a);

        System.out.println("");
        
        
        return a;
    }
}
