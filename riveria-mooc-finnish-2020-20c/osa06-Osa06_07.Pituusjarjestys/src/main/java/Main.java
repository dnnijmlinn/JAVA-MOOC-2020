
public class Main {

    public static void main(String[] args) {
        Huone huone = new Huone();
        huone.lisaa(new Henkilo("Lea", 183));
        huone.lisaa(new Henkilo("Kenya", 182));
        huone.lisaa(new Henkilo("Auli", 186));
        huone.lisaa(new Henkilo("Nina", 172));
        huone.lisaa(new Henkilo("Terhi", 185));

        System.out.println("");
        for (Henkilo henkilo : huone.getHenkilot()) {
            System.out.println(henkilo);
        }

        System.out.println();
        System.out.println("Lyhin: " + huone.ota());
        System.out.println("");
        for (Henkilo henkilo : huone.getHenkilot()) {
            System.out.println(henkilo);
        }
    }
}