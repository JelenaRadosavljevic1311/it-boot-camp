package PozoristePaketDomaci;

public class Pozoriste {
    //Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv koji mogu da se dohvate.
    // Moze da se sastavi tekstualni opis u obliku naziv[id].
    //
    private String naziv;
    private static int ID_GLOBAL =0;
    private int idBroj;

    public Pozoriste(String naziv) {
        this.naziv = naziv;
        this.idBroj = ID_GLOBAL++;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getIdBroj() {
        return idBroj;
    }

    @Override
    public String toString() {
        return naziv + "-" + idBroj;
    }

}
