package Knjiga;

public class Autor {
    //Autor poseduje ime, prezime, godinu rodjenja.
    //Ime, prezime i godina rodjenja se zadaju prilikom kreiranja
    //i ne mogu da se promene.
    private String ime;
    private String prezime;
    private int godinaRodjenja;

    public Autor(String ime, String prezime, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
}
