/**
 * PemilihanPercobaan109
 */
import java.util.Scanner;

public class PemilihanPercobaan109 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan angka : ");
        angka = input.nextInt();

        String jenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " adalah bilangan " + jenisBilangan);

    }   
}