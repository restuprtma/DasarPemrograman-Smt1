package jobsheet9;

import java.util.Scanner;
public class LinearSearch09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array : ");
        int jml = sc.nextInt();

        int[] arrayInt = new int[jml];
        int key = 0;
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-" +i+ " : ");
            arrayInt[i] = sc.nextInt();

            if (arrayInt[i] == key){
                hasil = i;
                

            }
        }

        System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
    }
}
