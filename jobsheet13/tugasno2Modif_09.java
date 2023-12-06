package jobsheet13;

import java.util.Scanner;

public class tugasno2Modif_09 {
    static Scanner sc = new Scanner(System.in);
    static int jumlahMhswa;
    static int jumlahMinggu;
    static String[] namaMhswa;
    static double[][] nilaiMhswa;

    static void inputnama(){
        sc.nextLine();
        for(int i = 0; i < jumlahMhswa; i++){
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + " : ");
            namaMhswa[i] = sc.nextLine();
        }
    }

    static void inputNilai(){
        for (int i = 0; i < jumlahMhswa; i++){
            System.out.println("Masukkan nilai Mahasiswa atas nama " + namaMhswa[i] + " (Minggu ke-1 hingga ke-" + jumlahMinggu + "): ");
            for (int j = 0; j < jumlahMinggu; j++){
                System.out.print("Minggu ke-" + (j + 1) + " : ");
                nilaiMhswa[i][j] = sc.nextDouble();
            }
        }
    }

    static void dataNilaiMhswa(){
        System.out.println("Nilai Tugas Lima Mahasiswa dari Minggu 1 hingga 7 berturut-turut :");
        for (int i = 0; i < jumlahMhswa; i++) {
            System.out.print("Mahasiswa " + namaMhswa[i] + ": ");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print(nilaiMhswa[i][j] + ", ");
            }
            System.out.println();
        }
    }

    static int mingguTertinggi(){
        double nilaiTertinggi = 0;
        
        int MingguTertinggi = 0;

        for(int j = 0; j < 7 ; j++) {
            double totalNilaiMinggu = 0;
            for(int i = 0; i < 5; i++){
                totalNilaiMinggu += nilaiMhswa[i][j];
            } if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                MingguTertinggi = j;
            }
        }
        return MingguTertinggi;
    }
    public static void main(String[] args) {
    System.out.print("Masukkan jumlah Mahasiswa : ");
    jumlahMhswa = sc.nextInt();
    System.out.print("Masukkan jumlah Minggu : ");
    jumlahMinggu = sc.nextInt();

    namaMhswa = new String[jumlahMhswa];
    nilaiMhswa = new double[jumlahMhswa][jumlahMinggu];

    inputnama();
    inputNilai();
    System.out.println();
    dataNilaiMhswa();
    printNilaiTertinggiMhswa();
    }
    static void printNilaiTertinggiMhswa(){
        double nilaiTertinggi = 0;
        int Mhswa = 0;
        int Minggu = 0;

        for(int i = 0; i < jumlahMhswa; i++){
            for(int j = 0; j < jumlahMinggu; j++){
                if (nilaiMhswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhswa[i][j];
                    Mhswa = i;
                    Minggu = j;
                }
            } 
        }
            System.out.println("\nNilai tertinggi diperoleh mahasiswa atas nama " + namaMhswa[Mhswa]);
            System.out.println("Nilai tertinggi terdapat pada minggu ke-" + (Minggu + 1) + " dengan nilai " + nilaiTertinggi);
    }
}
