public class Studenti {
    // Kreirati sopstvenu klasu Studenti, koja ce imati sledece podatke:
    // njihova imena i prezimena, broj indexa, smer, rezultate ispita izrazeni u procentima (51% za polozen ispit).
    // U svoj programu koristi klasu i sve navedene parametre gde ce korisnik programa unositi
    // parametre broj indexa i rezultati ispita. Unos samo broja indexa ispita treba da izbaci sve podatke o studentu.

    private String imeIPrezime;
    private int brojIndexa;
    private String smer;
    private int rezultati; //u procentima

    //konstruktori

    public Studenti(String imeIPrezime, String smer) {
        this.imeIPrezime = imeIPrezime;
        this.smer = smer;
    }


    //geteri i seteri

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }
    public void setBrojIndexa(int brojIndexa) {
        if (brojIndexa > 0){
        }
        this.brojIndexa = brojIndexa;
    }

    public String getSmer() {
        return smer;
    }

    public int getRezultati() {
        return rezultati;
    }
    public void setRezultati(int rezultati) {
        this.rezultati = rezultati;
    }
}
