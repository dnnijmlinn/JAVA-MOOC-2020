
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne

        Tili MatinTili = new Tili("Matin tili", 1000);
        Tili OmaTili = new Tili("Oma tili", 0);

    //    System.out.println("Alkutilanne");
        System.out.println(MatinTili);
        System.out.println(OmaTili);

        MatinTili.otto(100);
    //    System.out.println("Arton tilin saldo on nyt: " + MatinTili.saldo());
        OmaTili.pano(100);
    //    System.out.println("Arton toisen tilin saldo on nyt: " + OmaTili.saldo());

        System.out.println("Lopputilanne");
        System.out.println(MatinTili);
        System.out.println(OmaTili);

    }
}
