
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kokeile sovelluksen osien yhteistoimintaa täällä
        Tehtavalista lista = new Tehtavalista();
        lista.lisaa("lue kurssimateriaalia");
        lista.lisaa("katso uusin fool us");
        lista.lisaa("ota rennosti");
        
        lista.tulosta();
        lista.poista(2);
        
        System.out.println();
        lista.tulosta();
        
    }
}
