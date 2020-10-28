package PozoristePaketDomaci;

import java.util.ArrayList;

public class Predstava {
    ////Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
    //// Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
    ////Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava
    // razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).

    private String imePredstave;
    private Pozoriste naziv;

    private ArrayList<Zaposleni> imena = new ArrayList<Zaposleni>();

    public Predstava(String imePredstave, Pozoriste naziv) {
        this.imePredstave = imePredstave;
        this.naziv = naziv;

    }


    public ArrayList<Zaposleni> getImena() {
        return imena;
    }

    public void dodajImena(Zaposleni z) {imena.add(z);
    }

    public void ukloniImena(Zaposleni z) {
        imena.remove(z);
    }

    public String getImePredstave() {
        return imePredstave;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < imena.size(); i++) {
            sb.append(imena.get(i));

            if (i != imena.size() - 1) {
                sb.append(", ").append("\n");
            }
        }
        return imePredstave + ", " + naziv.getNaziv() + "\n" + sb;
    }
}


