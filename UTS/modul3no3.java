package UTS;

import java.util.Scanner;

public class modul3no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris piramida: ");
        int jumlahBaris = input.nextInt();

        for (int i = 1; i <= jumlahBaris; i++) {
            // Membuat spasi sebelum angka
            for (int j = 1; j <= jumlahBaris - i; j++) {
                System.out.print(" ");
            }

            // Mencetak angka menurun dari i hingga 1
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Mencetak angka naik dari 2 hingga i
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            // Pindah ke baris berikutnya
            System.out.println( );

            input.close();
        }
    }
}
