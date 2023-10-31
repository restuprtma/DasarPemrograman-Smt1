package jobsheet9;

import java.util.Scanner;

public class TugasJobsheet9 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai;
        int nilaitinggi = 0;
        int nilairendah = 0;
        int jmlhnilaitinggi = 0;
        int nilaitertinggi = 0;
        int nilaiterendah = 0;
        double total = 0;
        double ratanilaitinggi = 0;
        double ratanilarendah = 0;

        System.out.print("Masukkan Jumlah Nilai yang ingin ditambahkan : ");
        int x = input.nextInt();
        nilai = new int[x]; 

        for (int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            if (nilaitertinggi < nilai[i]) {
                nilaitertinggi = nilai[i];
            }else nilaiterendah = nilai[i];
        }
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
            if (nilai[i] > 70) {
                jmlhnilaitinggi += nilai[i];
                nilaitinggi++;
            }else nilairendah++;
        }

        ratanilaitinggi = jmlhnilaitinggi / nilaitinggi;
        ratanilarendah = (total - jmlhnilaitinggi) / nilairendah;
        System.out.println("Nilai tertinggi = " + nilaitertinggi);
        System.out.println("Nilai terendah = " + nilaiterendah );
        System.out.println("Rata-rata nilai tinggi = " + ratanilaitinggi);
        System.out.println("Rata-rata nilai rendah = " + ratanilarendah);

        input.close();
    }
}
