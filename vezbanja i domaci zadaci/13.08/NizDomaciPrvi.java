import java.util.Scanner;

public class NizDomaciPrvi {
    public static void main(String[] args){
        //    Napraviti program u kom su upisani ime i godine nekoliko osoba (minimum 3).
        //    Kada korisnik programa unosi imena osoba pri svakom unosu treba da izbaci njihove godine i
        //    poredja od najmladje do najstarije osobe.

        System.out.println("Unesi ime Ana, Jovan ili Maja da bi proverio njihove godine?");
        Scanner sc = new Scanner(System.in);
        String ime;
        ime = sc.nextLine();
        String [] imena = {"ana", "jovan", "maja"};
        int[] godine ={70, 30, 2};

        switch(ime){
            case "Ana" :
                System.out.println("Ana ima 70 godina i ona je najstarija.");
                break;
            case "Jovan" :
                System.out.println("Jovan ima 30 godina i on je srednje starosne dobi.");
                break;
            case "Maja" :
                System.out.println("Maja ima 2 godine i ona je najmladja");
                break;
        }

    }
}
