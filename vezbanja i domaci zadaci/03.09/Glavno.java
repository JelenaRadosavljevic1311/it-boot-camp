package Domaci;

import java.util.Arrays;

public class Glavno {
    public static void main (String[] args){
        //Napraviti klasu Ocena. Potrebno je da sadrzi broj poena koje je neko imao na ispitu i metodu koja vraca koja ocena je u pitanju.
        // Sadrzi naziv predmeta, i rok u kom je odrzan.
        // Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena koja racuna i vraca prosek. Prethodnu klasu testirati.
        //


        Ocena prva = new Ocena(66,"Ekonomija", "septembarski rok");
        Ocena druga = new Ocena (80,"Fizika", "septembarski rok");
        Ocena treca = new Ocena (88,"Engleski jezik", "septembarski rok");
        Ocena cetvrta = new Ocena(77,"Filozofija", "septembarski rok");
        Ocena peta = new Ocena (99,"kvantitativne metode","septembarski rok");


        double [] nizOcena = new double[]{prva.izracunajOcenu(prva.getBrojPoena()), druga.izracunajOcenu(druga.getBrojPoena()), treca.izracunajOcenu(treca.getBrojPoena()), cetvrta.izracunajOcenu(cetvrta.getBrojPoena()), peta.izracunajOcenu(peta.getBrojPoena())};
        System.out.println("Ocene koje ste uneli su : " + Arrays.toString(nizOcena));
        //Ovo sam koristila kao proveru da li mi racuna kako treba!!!    System.out.println("Vas prosek na osnovu unetih ocena je: " +(prva.izracunajOcenu(prva.getBrojPoena())+druga.izracunajOcenu(druga.getBrojPoena())+ treca.izracunajOcenu(treca.getBrojPoena())+cetvrta.izracunajOcenu(cetvrta.getBrojPoena())+peta.izracunajOcenu(peta.getBrojPoena()))/ nizOcena.length);

        System.out.println("Vas prosek na osnovu unetih ocena je: " + Ocena.prosekOcena(nizOcena));


    }
}
