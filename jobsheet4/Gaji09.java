/**
 * Gaji09
 */
import java.util.Scanner;

public class Gaji09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji, potGaji;

        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = sc.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Anda : ");
        jmlTdkMasuk = sc.nextInt();

        System.out.print("Masukkan Jumlah Gaji : ");
        gaji = sc.nextInt();
        System.out.print("Masukkan Potongan Gaji Jika Tidak Masuk : ");
        potGaji = sc.nextInt();

        totGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah : " + totGaji);
    }
}