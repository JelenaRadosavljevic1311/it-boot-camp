import java.util.Arrays;
import java.util.Scanner;

public class DrugiDomaciDrugiZadatak {
    public static void main(String[] args) {
        //Napisati program koji traži od korisnika da unese deset celih brojeva (brojevi trebaju da se
        // učitavaju kao niz), zatim sortira brojeve od najmanjeg do najveceg i tako sortirane ih istampa.
        System.out.println("Unesi prvi broj:");
        Scanner sc = new Scanner(System.in);

        int[] niz = new int[10];
        int broj;
        broj = sc.nextInt();

        for (int i=1; i<niz.length;i++){
            System.out.print("Nastavi da upisujes brojeve: ");
            niz[i] = sc.nextInt();
        }
        for (int i = 1; i < niz.length; i++)
            System.out.print(niz[i]);
    }
}
