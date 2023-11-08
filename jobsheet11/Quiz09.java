package jobsheet11;

import java.util.Scanner;
import java.util.Random;

public class Quiz09 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';

        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) = ");
                int answer = input.nextInt();
                input.nextLine();
                
                if (answer < number) {
                    System.out.println("Angka yang anda tebak terlalu kecil");
                } else if (answer > number) {
                    System.out.println("Angka yang anda tebak terlalu besar");
                } else {
                    System.out.println("Selamat, Anda benar!");
                    success = true;
                }
            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y)? ");
            menu = input.nextLine().charAt(0);

            if (menu != 'y' && menu != 'Y'){
                break;
            }
        } while (true);
    }
}
