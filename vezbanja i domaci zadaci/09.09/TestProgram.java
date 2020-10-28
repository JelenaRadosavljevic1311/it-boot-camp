package Domaci;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class TestProgram {

//potrebno je napraviti test za ispravnost klase Zaposleni.
//Ako se na osnovu testova pronađe neka greška u kodu potrebno je da se popravi originalni kod.
//Proveriti da li konstruktor public Zaposleni dobro postavlja argumente,
// kao i da li get metode vraćaju odgovarajuće vrednosti.

    @Test
    public void metodaTestNazivSet() {

        Zaposleni z = new Zaposleni("Mina Minic", 1987, new Date(2019, 05, 06));
        z.setNaziv("Maja Ciric");
        Assert.assertEquals(z.getNaziv(), "Maja Ciric");
    }

    @Test
    public void metodaTestGodRodjenja() {
        Zaposleni z = new Zaposleni("Mina Minic", 1987, new Date(2019, 05, 06));
        Assert.assertEquals(z.getGodRodjenja(), 1987);
    }

    @Test
    public void metodaTestGDatumZaposlenja() {
        Zaposleni z = new Zaposleni("Mina Minic", 1987, new Date(2019, 05, 06));
        Assert.assertEquals(z.getDatumZap(), new Date(2019,05,06));
    }

    @Test
    public void metodaTestNazivGet(){
       Zaposleni z = new Zaposleni("Mina Minic", 1987, new Date(2019, 05, 06));
       Assert.assertEquals(z.getNaziv(),"Mina Minic");
    }
 }


