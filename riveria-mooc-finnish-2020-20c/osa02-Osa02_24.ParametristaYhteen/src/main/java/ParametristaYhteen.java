
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLuvustaYhteen(5);
    }

    public static void tulostaLuvustaYhteen(int luku) {
        int i = 1;
        while (luku >= i) {
            System.out.println(luku);
            luku--;
        }

    }
}
