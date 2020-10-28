public class ZgradaGlavniProgram {
    public static void main(String[] args){
        //dve zgrade kreirati

        //prva
        Zgrada prvaZgrada = new Zgrada("Knez Mihajlova",1,1,"Jovanovic");
        System.out.println("Ulica : " + prvaZgrada.getAdresa());
        System.out.println("Spratnost : " + prvaZgrada.getSpratnost());
        System.out.println("Stan je broj " + prvaZgrada.getBrojStanova());
        System.out.println("Prvo prezime porodice " + prvaZgrada.getPrezimena());

        prvaZgrada.setBrojStanova(2);
        System.out.println("Stan je broj " + prvaZgrada.getBrojStanova());
        prvaZgrada.setPrezimena("Petrovic");
        System.out.println("Drugo prezime porodice " + prvaZgrada.getPrezimena());

        prvaZgrada.setBrojStanova(3);
        System.out.println("Stan je broj " + prvaZgrada.getBrojStanova());
        prvaZgrada.setPrezimena("Nikolic");
        System.out.println("Trece prezime porodice " + prvaZgrada.getPrezimena());

        prvaZgrada.setBrojStanova(4);
        System.out.println("Stan je broj " + prvaZgrada.getBrojStanova());
        prvaZgrada.setPrezimena("Markovic");
        System.out.println("Cetvrto prezime porodice " + prvaZgrada.getPrezimena());

        // druga
        Zgrada drugaZgrada = new Zgrada("Knez Danilova",2,1,"Marjanovic");
        System.out.println("Ulica : " + drugaZgrada.getAdresa());
        System.out.println("Spratnost : " + drugaZgrada.getSpratnost());
        System.out.println("Stan je broj " + drugaZgrada.getBrojStanova());
        System.out.println("Prvo prezime porodice " + drugaZgrada.getPrezimena());

        drugaZgrada.setBrojStanova(2);
        System.out.println("Stan je broj " + drugaZgrada.getBrojStanova());
        drugaZgrada.setPrezimena("Radosavljevic");
        System.out.println("Drugo prezime porodice " + drugaZgrada.getPrezimena());

        drugaZgrada.setBrojStanova(3);
        System.out.println("Stan je broj " + drugaZgrada.getBrojStanova());
        drugaZgrada.setPrezimena("Antic");
        System.out.println("Trece prezime porodice " + drugaZgrada.getPrezimena());
    }
}
