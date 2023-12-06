package jobsheet14;

import java.util.Scanner;

public class tugas3 {
    static boolean primaRekursif(int x, int y){
        if (y == 1){
            return true;
        } else {
            if (x % y == 0){
                return false;
            } else {
                return primaRekursif(x, y - 1);
            }
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan anda : ");
        int bilangan = sc.nextInt();

        boolean cekPrima = primaRekursif(bilangan, bilangan / 2);
        if (cekPrima) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
        sc.close();
    }
}
