

/**
 * Bank09
 */
import java.util.Scanner;


public class Bank09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTabunganAwal, lamaMenabung;
        double presentaseBunga = 0.02, bunga, jumlahTabunganAkhir;

        System.out.println("Masukkan Jumlah Tabungan Awal Anda: " );
        jumlahTabunganAwal = sc.nextInt();
        System.out.println("Masukkan LAma Menabung Anda; ");
        lamaMenabung = sc.nextInt();

        bunga = lamaMenabung * presentaseBunga * jumlahTabunganAwal;

        jumlahTabunganAkhir = bunga+jumlahTabunganAwal;

        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Jumlah Tabungan Akhir Anda Adalah: " + jumlahTabunganAkhir);
    }
}