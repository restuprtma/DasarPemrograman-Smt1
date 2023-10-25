import java.util.Scanner;

public class HargaBayar09 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String merk;
        int harga, jumlah, JmlHalaman;
        double dis, total, bayar, jmlDis;

        System.out.print("Masukkan merk buku yang anda beli : ");
        merk = input.nextLine();
        System.out.print("Masukkan jumlah halaman buku : ");
        JmlHalaman = input.nextInt();
        System.out.print("Masukkan harga barang yang dibeli : ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        jumlah = input.nextInt();
        System.out.print("Masukkan besaran diskon : ");
        dis = input.nextDouble();


        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;
        
        System.out.println("");
        System.out.println("Merk buku yang anda beli: " + merk + " Berjumlah " + JmlHalaman + " Halaman");
        System.out.println("Harga buku perbiji : " + harga);
        System.out.println("Diskon yang anda dapatkan adalah : " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah : " + bayar);
    }
}