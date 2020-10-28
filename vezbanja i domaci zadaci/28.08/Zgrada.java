public class Zgrada {
    // Napraviti sopstvenu klasu Zgrada.
    //Zgrada ima adresu na kojoj se nalazi, spratnost, broj stanova, prezimena stanara.
    //Sve tipove metoda u ovoj klasi treba iskoristiti u glavnom programu gde cete kreirati dve zgrade.
    // Sva polja mogu da se dohvate i postave.
    private String adresa;
    private int spratnost;
    private int brojStanova;
    private String prezimena;

    //konstruktori:
    public Zgrada (String adresa, int spratnost, int brojStanova, String prezimena){
        this.adresa = adresa;
        this.spratnost = spratnost;
        this.brojStanova = brojStanova;
        this.prezimena = prezimena;
    }

    //geteri i seteri:
    public String getAdresa(){
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getSpratnost() {
        return spratnost;
    }
    public void setSpratnost(int spratnost) {
        this.spratnost = spratnost;
    }

    public int getBrojStanova() {
        return brojStanova;
    }
    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    public String getPrezimena() {
        return prezimena;
    }
    public void setPrezimena(String prezimena) {
        this.prezimena = prezimena;
    }
}
