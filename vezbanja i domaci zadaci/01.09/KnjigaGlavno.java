package Knjiga;

public class KnjigaGlavno {
    public static void main(String[] args){
        //1. Napraviti sistem klasa koji opisuje knjigu.
        //Autor poseduje ime, prezime, godinu rodjenja.
        //Ime, prezime i godina rodjenja se zadaju prilikom kreiranja
        //i ne mogu da se promene.
        //
        //Knjiga poseduje naziv, AUTORA (TIPA Autor),
        //broj strana, godinu izdanja.
        //Sva polja mogu da se dohvate,
        //a godina izdanja moze i da se postavi
        //
        //U programu iskoristi sva polja iz svih kreiranih klasa gde ce se kreirati 3 knjige, a knjige biti poredjane po godini izdanja.

        Autor autor1 = new Autor("Lav","Tolstoj",1828);
        System.out.println("Autor prve knjige je "+ (autor1.getIme())+" " + autor1.getPrezime() +" koji je rodjen "+ autor1.getGodinaRodjenja() +" godine.");
        Knjiga prvaKnjiga = new Knjiga("Ana Karenjina",900,1560);
        System.out.println(autor1.getIme()+ " " + autor1.getPrezime() +" je napisao knjigu u ponudi, a to je " + prvaKnjiga.getNaziv() + " i ima ukupno " + prvaKnjiga.getBrojStrana() +" strana.");

        Knjiga drugaKnjiga = new Knjiga("It",1000, 1986);
        Autor autor2 = new Autor("Stiven", "King", 1987);
        System.out.println("Autor druge knjige je "+ (autor2.getIme())+" " + autor2.getPrezime() +" koji je rodjen "+ autor2.getGodinaRodjenja() +" godine.");
        System.out.println(autor2.getIme()+ " " + autor2.getPrezime() +" je napisao knjigu u ponudi, a to je " + drugaKnjiga.getNaziv() + " i ima ukupno " + drugaKnjiga.getBrojStrana() +" strana.");

        Knjiga trecaKnjiga = new Knjiga ("Beli ocnjak", 1000,1906);
        Autor autor3 = new Autor("Dzek", "London", 1876);
        System.out.println("Autor trece knjige je "+ (autor3.getIme())+" " + autor3.getPrezime() +" koji je rodjen "+ autor3.getGodinaRodjenja() +" godine.");
        System.out.println(autor3.getIme()+ " " + autor3.getPrezime() +" je napisao knjigu u ponudi, a to je " + trecaKnjiga.getNaziv() + " i ima ukupno " + trecaKnjiga.getBrojStrana() +" strana.");


        System.out.println("Prema godinama izdavanja, knjige  su po sledecem redu: ");

        if (prvaKnjiga.getGodinaIzdanja()> drugaKnjiga.getGodinaIzdanja() && drugaKnjiga.getGodinaIzdanja() > trecaKnjiga.getGodinaIzdanja() && prvaKnjiga.getGodinaIzdanja()> trecaKnjiga.getGodinaIzdanja()) {
                System.out.println(prvaKnjiga.getNaziv() + prvaKnjiga.getGodinaIzdanja());
                System.out.println(drugaKnjiga.getNaziv() + drugaKnjiga.getGodinaIzdanja());
                System.out.println(trecaKnjiga.getNaziv() + trecaKnjiga.getGodinaIzdanja());
            }
        if (prvaKnjiga.getGodinaIzdanja()< drugaKnjiga.getGodinaIzdanja() && drugaKnjiga.getGodinaIzdanja() < trecaKnjiga.getGodinaIzdanja() && prvaKnjiga.getGodinaIzdanja()< trecaKnjiga.getGodinaIzdanja()) {
            System.out.println(prvaKnjiga.getNaziv() + " " + prvaKnjiga.getGodinaIzdanja());
            System.out.println(drugaKnjiga.getNaziv() + " " + drugaKnjiga.getGodinaIzdanja());
            System.out.println(trecaKnjiga.getNaziv() + " " + trecaKnjiga.getGodinaIzdanja());
        }

        if (prvaKnjiga.getGodinaIzdanja()< drugaKnjiga.getGodinaIzdanja() && drugaKnjiga.getGodinaIzdanja() > trecaKnjiga.getGodinaIzdanja() && prvaKnjiga.getGodinaIzdanja()< trecaKnjiga.getGodinaIzdanja()) {
            System.out.println(drugaKnjiga.getNaziv() + " " + drugaKnjiga.getGodinaIzdanja());
            System.out.println(trecaKnjiga.getNaziv() + " " + trecaKnjiga.getGodinaIzdanja());
            System.out.println(prvaKnjiga.getNaziv() + " " + prvaKnjiga.getGodinaIzdanja());
        }


        }
    }

