package jobsheet14;

import java.util.Scanner;

public class tugas2 {
        static int penjumlahanRekursif(int f){
        if(f == 1){
            System.out.print(f);
            return 1;
        } else {
            int output = penjumlahanRekursif(f - 1);
            System.out.print(" + " + f);
            return f + output;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka batas akhir penjumlahan : ");
        int angka = sc.nextInt();

        int output = penjumlahanRekursif(angka);
        System.out.println(" = " + output);

        sc.close();
    }
}
