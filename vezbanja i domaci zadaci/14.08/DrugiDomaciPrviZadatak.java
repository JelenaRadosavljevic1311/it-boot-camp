import java.util.Scanner;

public class DrugiDomaciPrviZadatak {
    public static void main(String[] args){
        //Napisati program koji od korisnika traži da unese neki datum i
        // da ispiše koji je to po redu dan u godini. Za izračunavanje definisati i koristiti niz.
        System.out.println("Unesi dan: ");
        Scanner sc = new Scanner(System.in);
        int[] dani = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dan=0;
        int mesec=0;
        int redni= 0;
        dan= sc.nextInt();
        System.out.println("Unesi na koji mesec se odnosi: ");
        mesec= sc.nextInt();

        for (int i=0; i< (mesec-1); i++) {
            redni = redni+dani[i];
        }
        System.out.println("Dan koji ste uneli je"+redni+"redni dan u godini");
    }
}
