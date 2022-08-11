
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        int eka = 0;
        int toka = 0;
 
        while (true) {
            System.out.println("Ensimmäinen:" + eka + "/100");
            System.out.println("Toinen:" + toka + "/100");
            String luettu = lukija.nextLine();
            System.out.println("");
            String[] osat = luettu.split(" ");
 
 
            if (osat[0].equals("lopeta")) {
                break;
            }
 
            else if (osat[0].equals("lisaa")){
                int cont =Integer.parseInt(osat[1]);
                if(cont>0){
                    if (eka + cont >=100){
                        eka = 100;
                    } else {
                        eka += cont;
                    }
                }else {
                    cont=0;
                }
                
            }
 
            else if (osat[0].equals("siirra")){
                int cont =Integer.parseInt(osat[1]);
                if (eka - cont<0){
                    cont = eka;
                    eka = 0;
                    toka+=cont;
                }
                else{
                    eka-=cont;
                    toka+=cont;
                    if(toka>=100){
                        toka=100;
                    }
                }
            }
            else if (osat[0].equals("poista")){
                int cont =Integer.parseInt(osat[1]);
                if(cont>toka){
                    cont=toka;
                    toka-=cont;
                }else {
                    toka-=cont;
                }
            }
        }
    }

}
