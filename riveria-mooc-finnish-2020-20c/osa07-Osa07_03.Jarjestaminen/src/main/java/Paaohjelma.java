
public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        // indeksit:   0  1  2  3  4
        int[] luvut = {6, 5, 8, 7, 11};
        System.out.println("Pienimmän indeksi: " + Paaohjelma.pienimmanIndeksi(luvut));
    }

    public static int pienin(int[] taulukko) {
        int lukko = taulukko[0];
        for (int i  : taulukko){
            if(lukko > i){
                lukko=i;
            }
        }
        return lukko;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int lukko = pienin(taulukko);
        for (int i=0; i<taulukko.length; i++){
            if(lukko ==taulukko[i]){
                return i;

            }
        }
        return 99;
    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        

        return aloitusIndeksi;
    }
    
}
