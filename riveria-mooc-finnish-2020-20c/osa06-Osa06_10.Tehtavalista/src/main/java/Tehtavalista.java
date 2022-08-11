import java.util.Scanner;
import java.util.ArrayList;


public class Tehtavalista {
    private ArrayList<String> lista = new ArrayList<>();

    public void lisaa(String tehtava) {
        lista.add(tehtava);

    }

    public void tulosta() {
        int num = 0;
        for(String tehtava : lista){
            num += 1;
            System.out.println(num + ": " + tehtava);
        }
    }

    public void poista(int numero) {
        lista.remove(numero - 1);
    }

}
