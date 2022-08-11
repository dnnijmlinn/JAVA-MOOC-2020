
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {       //*
        for(int numero=0; numero<maara; numero++) {
            System.out.print("*");
        }
        System.out.println("");

    }

    public static void tulostaTyhjaa(int maara) {      //_
        for(int var =0; var<maara; var++) {
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {
        for (int i = 1; i <= koko; i++) {
            for (int j = 0; j < koko-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void jouluKuusi(int korkeus) {
        for(int r=1; r<=korkeus; r++){
            for(int sp=1; sp<=korkeus-r; sp++){
                System.out.print(" ");
            }
            for(int c=1;c<=(r*2)-1; c++ ){
                System.out.print("*");
            }
            System.out.println("");
        } 
        
        for(int rr=1; rr<3; rr++){
            for(int ps = 1; ps<=korkeus-2; ps++){
                System.out.print(" ");
            }
            for(int x=1; x<=3; x++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        //tulostaKolmio(3);
        //System.out.println("---");
        jouluKuusi(10);
        //System.out.println("---");
        //jouluKuusi(10);
    }
}
