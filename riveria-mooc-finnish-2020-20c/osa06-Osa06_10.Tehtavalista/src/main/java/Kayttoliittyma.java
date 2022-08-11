import java.util.Scanner;

public class Kayttoliittyma {

    private Tehtavalista tehtavalista;
    private Scanner lukija;

    public Kayttoliittyma (Tehtavalista tehtavalista, Scanner lukija){
        this.tehtavalista=tehtavalista;
        this.lukija=lukija;
    }

    public void kaynnista(){
        while(true) {
            System.out.println("Komento: ");
            String komento = lukija.nextLine();

            if(komento.equals("lopeta")){
                System.out.print("Hei hei!");
                break;
            } 
            if(komento.equals("lisaa")){
                System.out.print("Lisättävä:");
                String lisattava = lukija.nextLine();
                tehtavalista.lisaa(lisattava);

            }
            if(komento.equals("poista")){
                System.out.print("Mikä poistetaan?");
                int poistettava = Integer.valueOf(lukija.nextLine());
                tehtavalista.poista(poistettava);
            }
            if(komento.equals("listaa")){
                tehtavalista.tulosta();
            }
        }
    }
}
