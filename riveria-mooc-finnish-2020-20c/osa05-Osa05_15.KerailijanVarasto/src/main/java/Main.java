
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Varasto> varastot = new ArrayList<>();

        while(true){
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String tunnus = lukija.nextLine();
            if(tunnus.isEmpty()){
                break;
            }
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            if(nimi.isEmpty()){
                break;
            }
            Varasto varasto = new Varasto(tunnus, nimi);
            if(!(varastot.contains(varasto))){
                varastot.add(varasto);
            }

        }
        System.out.println("==Varastot==");
        for (Varasto varasto : varastot){
            System.out.println(varasto);
        }

    }
}
