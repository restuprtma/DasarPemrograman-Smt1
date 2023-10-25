package jobsheet9;

import java.util.Scanner;
public class LinearSearch09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array : ");
        int jml = sc.nextInt();

        int[] arrayInt = new int[jml];
        int key;

        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-" +i+ " : ");
            int bill = sc.nextInt();

            arrayInt[i] = bill;
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                System.out.println("Key ada dalam array pada posisi indeks ke-" + i);
                break;
            }else {
                System.out.println("Key tidak ditemukan");  
                break;
            }
        }

    }
}
