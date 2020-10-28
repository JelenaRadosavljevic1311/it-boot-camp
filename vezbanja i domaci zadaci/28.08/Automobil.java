public class Automobil {

    // klase bez maina sa objektima
    // klase su kao sablon po kojem se objekti ponasaju
    // svaka klasa ima neka polja, podsecaju na promenljive
  // pravo pristupa
    /* Napisati klasu Automobil. Automobil ima
        marku (polje tipa String) koje moze da se dohvati, ali ne i postavi
        model (polje tipa String) koje moze da se dohvati ali ne i postavi
        serijski broj (polje tipa int) koje moze da se dohvati ali ne i postavi
        Automobil moze da ima vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku

        Napisati glavni program koji kreira dva automobila.
        U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
        //1. Dopuniti zadatak Automobil sa predavanja tako sto se automobil kreira sa stepenom prenosa. Stepen prenosa moze da se smanji i poveca.
*/

    private String marka;
    private String model;
    private int stepenPrenosa;
    private int serBr;
    private String vlasnik;
    //geteri dohvate vrednost polja a ne menjaju
    // seteri postavljaju
    //Moramo da napravimo metodu getera da bi dohavtio

    //konstruktor:
    public Automobil(String marka, String model, int serBr, int stepenPrenosa){
    // sve vrednosti na deafault vrednosti postavlja
    this.marka = marka;
    this.model = model;
    this.serBr = serBr;
    this.stepenPrenosa = stepenPrenosa;
    }

    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
    public int getSerBr(){
        return serBr;
    }
    public int getStepenPrenosa() { return stepenPrenosa;}
    public String getVlasnik(){
        return vlasnik;
    }
    //seter je void jer vraca
    public void setVlasnik(String vlasnik){
        this.vlasnik = vlasnik;// odnosi se na polje gore private
    }
    public void setStepenPrenosa (int stepenPrenosa){
        this.stepenPrenosa= stepenPrenosa;
    }
}
