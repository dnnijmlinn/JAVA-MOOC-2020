
public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä

        Viesti viesti = new Viesti("Terve! Miten menee!", "Odotan sinua");
        Viestipalvelu sms = new Viestipalvelu();
        sms.lisaa(viesti);
        System.out.println(sms.getViestit());
    }
}
