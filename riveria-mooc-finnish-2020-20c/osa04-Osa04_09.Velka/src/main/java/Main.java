
public class Main {

    public static void main(String[] args) {

        Velka asuntolaina = new Velka(1500.0, 2);
        asuntolaina.tulostaSaldo();

       // asuntolaina.odotaVuosi();
    //    asuntolaina.tulostaSaldo();

        int vuosia = 0;

       while (vuosia < 20) {
           // asuntolaina.odotaVuosi();
            vuosia++;
            
        }

        asuntolaina.tulostaSaldo();
    }
}
