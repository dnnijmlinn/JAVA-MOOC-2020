
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String lause = lukija.nextLine();
        String[] palat = lause.split(" ");
        String lause2 = lukija.nextLine();
        String[] palat2 = lause2.split(" ");
        String lause3 = lukija.nextLine();
        String[] palat3 = lause3.split(" ");


        for (int i = 0; i < palat.length; i++) {
            if(palat[i].contains("av")){
                System.out.println(palat[i]);
            }
            if(lause.equals("")){
                break;
            }
        }
        for (int i = 0; i < palat2.length; i++) {
            if(palat2[i].contains("av")){
                System.out.println(palat2[i]);
            }
            if(lause.equals("")){
                break;
            }
        }
        for (int i = 0; i < palat3.length; i++) {
            if(palat3[i].contains("av")){
                System.out.println(palat3[i]);
            }
            if(lause.equals("")){
                break;
            }
        }


    }
}
