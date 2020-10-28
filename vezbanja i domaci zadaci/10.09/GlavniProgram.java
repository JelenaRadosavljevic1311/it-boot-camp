package Tablic;

import java.util.Scanner;

public class GlavniProgram {
    public static void main(String[] args) {

        //Zadatak 1.
        //
        //Zadatak predstavlja jedan deo kartaške igre Tablić.
        //- Napraviti metodu koja ce da u jedan niz ucita sve karte koje je jedan korisnik sakupio. Karte učitavati kao cele brojeve - kec je broj 11,
        // žandar 12, dama 13 i kralj 14. Tražiti od korisnika da učita koliko karata ima, a nakon toga koje su to karte.
        // Voditi računa o tome da li su broj karata, kao i svaka karta korektne vrednosti.
        //
        //- Napraviti metodu koja broji koliko ima štihova u nizu. Podrazumevati da mala dvojka i dupla desetka nemaju specijalno znacenje.
        //
        //- Napraviti metodu koja će za dva prosleđena niza vratiti informaciju o tome ko je pobednik (ko ima više sakupljenih štihova).
        //
        //- Napraviti glavni program koji prikazuje primenu svih prethodno napisanih metoda.

        System.out.println("Unesi br. karata: ");
        Scanner sc = new Scanner(System.in);
        int brojKarata;
        int sum;
        brojKarata = sc.nextInt();

        while(brojKarata <=0) {
            System.out.println("Broj karata mora biti veci od 0.");
            System.out.println("Unesi broj elemenata niza");
            brojKarata = sc.nextInt();
        }

        int[] niz = new int[brojKarata];
      Karte k = new Karte();
        k.unosKarata(niz);
        k.vaseKarte(niz);
        System.out.println("Broj poena za igraca je: " +k.stihoviKarata(niz) + ". Osvojili ste poene na neku od sledecih karata 10/11/12/13/14.");


        System.out.println("Na redu je drugi igrac. Drugi igrac ubacuje isti broj karata.");

        int[] niz2 = new int[brojKarata];
        k.unosKarata(niz2);
        k.vaseKarte(niz2);
        System.out.println("Broj poena za igraca je: " +k.stihoviKarata(niz2) + ". Osvojili ste poene na neku od sledecih karata 10/11/12/13/14.");

        if(k.stihoviKarata(niz)> k.stihoviKarata(niz2)){
            System.out.println("Cestitamo, pobedio je prvi igrac sa vecim ukupnim brojem osvojenih poena: " + k.stihoviKarata(niz) + ".");
        }
        if(k.stihoviKarata(niz2)> k.stihoviKarata(niz)){
            System.out.println("Cestitamo, pobedio je drugi igrac sa vecim ukupnim brojem osvojenih poena: " + k.stihoviKarata(niz2) + ".");
        }
        if(k.stihoviKarata(niz2)== k.stihoviKarata(niz)){
            System.out.println("Igra je zavrsena i rezultat je neresen. Oba igraca su osvojila po " + k.stihoviKarata(niz2) + " poena.");
        }


    }
}
