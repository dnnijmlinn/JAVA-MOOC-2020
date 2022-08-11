import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvosanaTilastot statistics = new ArvosanaTilastot();

        UserInterface ui = new UserInterface(scanner, statistics);
        ui.start();

    }
}