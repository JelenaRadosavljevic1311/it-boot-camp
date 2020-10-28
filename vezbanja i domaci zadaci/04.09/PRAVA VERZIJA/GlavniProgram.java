package PozoristePaketDomaci;

public class GlavniProgram {
    public static void main(String[] args){
//Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv koji mogu da se dohvate.
// Moze da se sastavi tekstualni opis u obliku naziv[id].
//
//Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen.
// Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].
//
//Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].
//
//Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].
//
//Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
// Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
//Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom,
// a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).

        Pozoriste p = new Pozoriste("Puz");//dobice sam br 1
        System.out.println(p);

        Reditelj prvi = new Reditelj("Jovan Jovanovic", p, "Joca");
        Predstava predstava = new Predstava("Crvenkapa", p);
        predstava.dodajImena(prvi);
        Zaposleni radnik = new Zaposleni("Pera Peric", p);
        predstava.dodajImena(radnik);

        System.out.println(predstava.toString());


    }
}

