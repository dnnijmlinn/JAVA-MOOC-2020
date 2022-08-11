
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String element) {
        this.alkiot.add(element);
    }

    public ArrayList<String> getElements() {
        return this.alkiot;
    }

    @Override
    public String toString() {
        String output = "Joukko " + this.nimi;
        String outputkak = "Joukossa " + this.nimi;
        String elementsAsString = "";
        if (this.alkiot.isEmpty()) {
            return output + " on tyhjä.";
        } else if (this.alkiot.size() == 1) {
            return outputkak  + " on " + this.alkiot.size() + " alkio:" + "\n" + this.alkiot.get(0);
        } else {
            for (String element : alkiot) {
                elementsAsString = elementsAsString+element + "\n";
            }
            return outputkak + " on " + this.alkiot.size() + " alkiota:" + "\n" + elementsAsString;
        }

    }

}
