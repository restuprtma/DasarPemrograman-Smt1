package jobsheet9;

import java.util.Scanner;
public class ArrayRataNilai09 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;

        System.out.print("masukkan jumlah mahasiswa : ");
        jumlah = sc.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int lulus = 0;
        double total = 0;
        double rata2;
        double sumLulus = 0, sumTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                lulus++;
                sumLulus += nilaiMhs[i];
            } else {
                sumTdkLulus += nilaiMhs[i];
            }           
        }
        for (int i = 0; i < nilaiMhs.length; i++){

            total += nilaiMhs[i];
        }
        double rata2lulus = sumLulus / lulus;
        double rata2tdkLulus = sumTdkLulus / (nilaiMhs.length - lulus);
        System.out.println("Rata-rata nilai lulus = "+rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2tdkLulus);
    }
}
