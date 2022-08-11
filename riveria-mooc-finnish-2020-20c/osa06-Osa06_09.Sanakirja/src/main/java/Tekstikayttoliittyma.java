import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma (Scanner lukija , Sanakirja sanakirja){
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }

    public void kaynnista() {        

        while(true) {
            System.out.println("Komento: ");
            String luettu = lukija.nextLine();

            if(luettu.equals("lopeta")){
                System.out.print("Hei hei!");
                break;
            } 
            else if(luettu.equals("lisaa")){
                System.out.print("Sana:");
                String sana = lukija.nextLine();
                System.out.print("Käännös:");
                String kaanos = lukija.nextLine();
                sanakirja.lisaa(sana, kaanos);

            }
            else if(luettu.equals("hae")){
                System.out.print("Haettava:");
                String haettava = lukija.nextLine();
                if(sanakirja.kaanna(haettava)==null){
                    System.out.println("Sanaa " + haettava + " ei löydy");
                }else {
                    System.out.println(sanakirja.kaanna(haettava));
                }
            }
            else  {
                System.out.println("Tuntematon komento ");
            }
            
        }
            
    }

}
