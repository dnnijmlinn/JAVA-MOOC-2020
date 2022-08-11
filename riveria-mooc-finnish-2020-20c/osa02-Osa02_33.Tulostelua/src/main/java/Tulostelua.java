
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        //tulostaTahtia(5);           
        tulostaTahtia(1);               //1
        //tulostaTahtia(9);          
        //System.out.println("---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(2);                //2
        //System.out.println("\n---");
        tulostaSuorakulmio(6, 3);       //3
        //System.out.println("\n---");
        tulostaKolmio(4);               //4
        //System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {         //1
        int num = 0;
        while (num<maara) {
            System.out.print("*");
            num = num+1;
            if (num==maara) {
                System.out.println("");
            }
        }
    }
    
    public static void tulostaNelio(int sivunpituus) {       //2
        for (int i = 0; i < sivunpituus; i++) {
            for (int j = 0; j < sivunpituus; j++) {
                System.out.print("*");
            }           
            System.out.println("");
        }
    }
        
    public static void tulostaSuorakulmio(int leveys, int korkeus) {       //3
        for (int u = 0; u < korkeus; u++) {
            for (int t = 0; t < leveys; t++) {
                System.out.print("*");
            }           
            System.out.println("");
        }
    }

    public static void tulostaKolmio(int koko) {     //4
        
        for(int c = 0; c<=koko; c++) {
            for( int k = c; k>0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
