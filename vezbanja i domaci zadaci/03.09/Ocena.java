package Domaci;
public class Ocena {
    //Napraviti klasu Ocena. Potrebno je da sadrzi broj poena koje je neko imao na ispitu i metodu koja vraca koja ocena je u pitanju.
    // Sadrzi naziv predmeta, i rok u kom je odrzan.
    // Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena koja racuna i vraca prosek. Prethodnu klasu testirati.

    private double brojPoena;
    private String nazivPredmeta;
    private String rok;
   // private int [] ocene = new int[n];

    public Ocena(int brojPoena, String nazivPredmeta, String rok) {
        this.brojPoena = brojPoena;
        this.nazivPredmeta = nazivPredmeta;
        this.rok = rok;
    }

    public double getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(double brojPoena) {
        this.brojPoena = brojPoena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }


    public static double izracunajOcenu(double brojPoena) {
        if (brojPoena<0 && brojPoena<=50){
            return 5;
        }
        if (brojPoena>50 && brojPoena<=60){
            return 6;
        }
        if (brojPoena>60 && brojPoena<=70){
            return 7;
        }
        if (brojPoena>70 && brojPoena<=80){
            return 8;
        }
        if (brojPoena>80 && brojPoena<=90){
            return 9;
        }
        if (brojPoena>90 && brojPoena<=100){
            return 10;
        }
        else if (brojPoena<=0){
            System.out.println("Niste uneli dobar br. poena.");
        } return 0;



    }

    public static double prosekOcena(double[] nizOcena){
        double zbir =0;
        double prosek;
        for (int i =0; i< nizOcena.length; i++){
            zbir= zbir + nizOcena[i];
        }
        prosek = zbir/ nizOcena.length;
        return prosek;
    }
}








