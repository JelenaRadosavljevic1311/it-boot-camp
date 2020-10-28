package Knjiga;

public class Knjiga {
    //Knjiga poseduje naziv, AUTORA (TIPA Autor),
    //broj strana, godinu izdanja.
    //Sva polja mogu da se dohvate,
    //a godina izdanja moze i da se postavi

    private String naziv;
    private Autor autor;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String naziv, int brojStrana, int godinaIzdanja) {
        this.naziv = naziv;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaziv() {
        return naziv;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


