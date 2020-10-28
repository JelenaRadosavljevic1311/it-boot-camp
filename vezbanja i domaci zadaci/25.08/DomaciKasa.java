import java.util.Scanner;

public class DomaciKasa {
    public static void main(String[] args) {
        //Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
        //0 - Izlaz iz programa
        //1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
        //2 - naplata racuna
        //
        //Ukoliko korisnik unese opciju 0 program se zavrsava.
        //Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
        //Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
        //Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
        //Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
        // Zatim se ponovo ispisuje meni.
        Scanner sc = new Scanner(System.in);
        int opcija=1;
        int cena=0;
        int racun = 0;
        int iznos=0;

        while (opcija > 0) {
            System.out.println("Dobro dosli u menu. Opcije su sledece: ");
            System.out.println("Pritisnite 0 - Izlaz iz programa; ");
            System.out.println("Pritisnite 1 - Dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu); ");
            System.out.println("Pritisnite 2 - naplata racuna.");

            opcija = sc.nextInt();

            if (opcija==0) {
                System.out.println("Izasli ste iz programa. ");
            }

            if (opcija==1) {
                System.out.println("Unesite cenu proizvoda: ");
                cena=sc.nextInt();
                racun=racun+cena;
                System.out.println("U korpi imate proizvod u vrednosti od " + racun + " rsd. Odaberite iz menija Vas sledeci korak.");
            }

            if (opcija==2) {
                System.out.println("Unesite iznos sa uplatu? ");
                iznos= sc.nextInt();
                if(iznos==racun) {
                    System.out.println("Uspesno ste platili. Hvala Vam na kupovini sa nama.");
                }
                if(iznos>racun){
                    System.out.println("Vise ste platili, Vas kusur iznosi: "+(iznos-racun) + " dinara.");
                }
                if(iznos<racun){
                    System.out.println("Manje ste uplatili. Molimo vas da uplatite jos: "+ (racun-iznos)+ " dinara.");
                }
                if(racun-iznos==0) {
                    break;
                }
            }
        }
    }
}