import java.util.Scanner;

public class NizDomaciDrugi {
    public static void main(String[] args) {
        //    Napraviti program koji upisuje broj godina nekih osoba a posle 10 unosa,
        //    program treba da izbaci koliko osoba ima od 18 do 50 godina a koliko ima mladjih od 18.

        System.out.println("Unesi broj godina?");
        Scanner sc = new Scanner(System.in);
        int godine;
        godine= sc.nextInt();
        int stariji = 0;
        int mladji = 0;

        for (int i = 0; i <= 9; i++) {
            System.out.println("Unesite godine:");
            godine = sc.nextInt();
            if(godine<18){
                mladji=mladji+1;
            }
            if(godine>=18 && godine<50){
                stariji=stariji+1;
            }
        }
        System.out.println("Mladjih od 18 ima: "+ mladji);
        System.out.println("Starijih od 18, ispod 50 ima: " + stariji);

    }
}
