import java.util.Arrays;
import java.util.Scanner;

public class RastuciIliOpadajuciNiz {
    public static void main(String[] args) {
        //Napisati program koji će za uneti niz proveravati da li je rastući ili nije rastući.
        //Kao dodatak zadatku, proveriti da li je niz rastući, opadajući ili ništa od toga.

        System.out.println("Unesi koliko clanova zelis da ima niz: ");
        Scanner sc = new Scanner(System.in);
        int broj;
        broj = sc.nextInt();

        while (broj <= 0) {
            System.out.println("Broj koji ste uneli nije dobar. Morate uneti broj koji je veci od 0. ");
            System.out.println("Unesite ponovo broj:");
            broj = sc.nextInt();
        }

        int[] niz = new int[broj];

        //Ostale metode:
        ucitavanjeNiza(niz);
        iscitavanjeNiza(niz);
        System.out.println(rastuciIliNe(niz));
        System.out.println(opadajuciIliNe(niz));

    }

    public static void ucitavanjeNiza(int[] niz) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi clanove niza: ");
            niz[i] = sc.nextInt();
        }
    }

    public static void iscitavanjeNiza(int[] niz) {
        System.out.println(Arrays.toString(niz));
    }

    public static String rastuciIliNe(int[] niz) {

        for (int i =0, j = niz.length-1; i< niz.length/2; i++, j--){
            if (niz[i] < niz[j]) return "Niz jeste  rastuci.";
        } return "1. metoda: Niz nije rastuci.";
    }



    public static String opadajuciIliNe(int[] niz) {

        for (int i =0, j = niz.length-1; i< niz.length/2; i++, j--){
            if (niz[i] > niz[j]) return "Niz nije  rastuci.";
        } return "2. metoda: Niz jeste rastuci.";

    }

}
