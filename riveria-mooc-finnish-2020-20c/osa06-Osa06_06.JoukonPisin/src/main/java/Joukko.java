
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> elements;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.elements = new ArrayList<>();
    }

    public void lisaa(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String pisin() {
        if (this.elements.isEmpty()) {
            return null;
        }
        String longestString = this.elements.get(0);
        for (String element : elements) {
            if (longestString.length() < element.length()) {
                longestString = element;
            }
        }
        return longestString;

    }

}