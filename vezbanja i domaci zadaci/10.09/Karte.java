package Tablic;

import java.util.Arrays;
import java.util.Scanner;

public class Karte {
    //Zadatak 1.
    //Zadatak predstavlja jedan deo kartaške igre Tablić.
    //- Napraviti metodu koja ce da u jedan niz ucita sve karte koje je jedan korisnik sakupio.
    // Karte učitavati kao cele brojeve - kec je broj 11, žandar 12, dama 13 i kralj 14. Tražiti od korisnika da učita koliko karata ima,
    // a nakon toga koje su to karte. Voditi računa o tome da li su broj karata, kao i svaka karta korektne vrednosti.

    //- Napraviti metodu koja broji koliko ima štihova u nizu. Podrazumevati da mala dvojka i dupla desetka nemaju specijalno znacenje.
    //
    //- Napraviti metodu koja će za dva prosleđena niza vratiti informaciju o tome ko je pobednik (ko ima više sakupljenih štihova).
    //
    //- Napraviti glavni program koji prikazuje primenu svih prethodno napisanih metoda.



    public static void unosKarata(int[] niz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi karte igraca:");
         int sum = 0;
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
            if (niz[i] > 14) {
                System.out.println("Ne postoji takva karta.");
                break;
            }
        }
    }

    public static void vaseKarte(int[] niz){
        System.out.println(Arrays.toString(niz));

    }

    public static int stihoviKarata(int[] niz) {
        int sum = 0;
        for (int i = 0; i < niz.length; i++) {
            Scanner sc = new Scanner(System.in);
            if (niz[i] == 10 || niz[i] == 11 || niz[i] == 12 || niz[i] == 13 || niz[i] == 14) {
                 sum++;
            }
        } return sum;
    }
}



