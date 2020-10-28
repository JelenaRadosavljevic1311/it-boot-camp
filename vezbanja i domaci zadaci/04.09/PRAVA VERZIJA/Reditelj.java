package PozoristePaketDomaci;

public class Reditelj extends Zaposleni {
    //Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].

    private String nadimak;

    public Reditelj(String imePrezime, Pozoriste pozoriste, String nadimak) {
        super(imePrezime, pozoriste);
        this.nadimak = nadimak;
    }

    @Override
    public String toString() {
        return nadimak + " _ " + getImePrezime() +" [" + getPozoriste() +"]";
    }
}
