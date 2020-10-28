import java.util.Scanner;

public class AutomobilGlavniProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Automobil a1 = new Automobil("audi","a3", 12345,50);
        //a1 je objekat klase automobil
        a1.setVlasnik("Pera Peric");
        System.out.println(a1.getMarka());
        System.out.println(a1.getModel());
        System.out.println(a1.getSerBr());
        System.out.println(a1.getVlasnik());
        a1.setStepenPrenosa(500);
        System.out.println("Stepen prenosa prvog automobila je: "+ a1.getStepenPrenosa());

        Automobil a2 = new Automobil("Alfa","g3",56789,200);
        a2.setVlasnik("Mika Mikic");
       System.out.println(a2.getMarka());
        System.out.println(a2.getModel());
        System.out.println(a2.getSerBr());
        System.out.println(a2.getVlasnik());
        a2.setStepenPrenosa(67);
        System.out.println("Stepen prenosa drugog automobila je: "+ a2.getStepenPrenosa());

        // konstruktor je specijalna metoda jer nema povratni tip
        //i zove se isto kao i klasa u kojoj je pozivamo
    }
}
