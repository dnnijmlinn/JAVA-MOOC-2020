
public class Main {

    public static void main(String[] args) {

        Pakka p = new Pakka();
System.out.println(p.onTyhja());
System.out.println(p.arvot());
p.lisaa("Arvo");
System.out.println(p.onTyhja());
System.out.println(p.arvot());
String otettu = p.ota();
System.out.println(p.onTyhja());
System.out.println(p.arvot());
System.out.println(otettu);



        // Kokeile luokkaasi täällä

    }
}
