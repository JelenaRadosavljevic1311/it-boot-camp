public class StudentiGlavno {
    public static void main(String[] args){

        Studenti prvi = new Studenti("Ana Petrovic", "prirodni smer");
        Studenti drugi = new Studenti("Maja Markovic", "drustveni smer");

        prvi.setBrojIndexa(56);
        System.out.println(prvi.getBrojIndexa());
        prvi.setBrojIndexa(0);
        System.out.println(prvi.getBrojIndexa());
    }
}
