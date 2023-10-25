/**
 * latihan2
 */
import java.util.Scanner;
public class latihan2 {

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0, disTambahan = 0, totDiskon = 0;

        System.out.print("Masukkan Jenis Buku : ");
        jenisBuku = input09.nextLine();
        System.out.print("Masukkan Jumlah Buku : ");
        jumlahBuku = input09.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2){
                disTambahan = 2;
            }
        }else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                disTambahan = 2;
            }else if (jumlahBuku <= 3){
                disTambahan = 1;
            }
        }else {
            if (jumlahBuku > 3) {
                disTambahan = 5;
            }
        }

        totDiskon = diskon + disTambahan;
        System.out.println("Total diskon : " +totDiskon+ "%");
        
    }
}