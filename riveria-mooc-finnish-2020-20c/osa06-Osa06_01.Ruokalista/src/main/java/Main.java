
public class Main {
    public static void main(String[] args) {
        Ruokalista exactum = new Ruokalista();

        Ruokalista menu = new Ruokalista();
        menu.lisaaAteria("Tofuratatouille");
        menu.lisaaAteria("Chili-kookoskana");
        menu.lisaaAteria("Chili-kookoskana");
        menu.lisaaAteria("Lihapyörykät sinappikastikeella");

        menu.tulostaAteriat();
        menu.tyhjennaRuokalista();

        System.out.println();
        menu.lisaaAteria("Tomaatti-mozzarellasalaatti");
        menu.tulostaAteriat();



        
        // Kun olet luonut metodin lisaaAteria(String ateria), 
        // voit poistaa allaolevat kommentit
        
//        exactum.lisaaAteria("Pariloitua lohta ja kuhaa, basilikalla maustettua valkoviinivoikastiketta.");
//        exactum.lisaaAteria("Kesäinen vihersalaatti ja omena-hunajavinegretti.");
//        exactum.lisaaAteria("Paahdettua karitsan seläkettä ja punaviinikastiketta.");
        
        // Kun olet luonut metodin tulostaAteriat(), 
        // voit poistaa allaolevan kommentin
        
//        exactum.tulostaAteriat();
        
        // Kun olet luonut metodin tyhjennaRuokalista(), voit poistaa 
        // allaolevat kommentit
//        exactum.tyhjennaRuokalista();
//        exactum.tulostaAteriat();
    }
}
