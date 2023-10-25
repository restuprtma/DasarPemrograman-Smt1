import java.util.Scanner;

/**
 * LatihanIndividu109
 */
public class LatihanIndividu109 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jarak;

        System.out.print("Masukkan Jarak Pertarungan anda (dalam satuan meter) :");
        jarak = input.nextDouble();

        if(jarak <= 5 )
            System.out.println("Anda disarankan menggunakan melee weapon untuk melakukan pertarungan jarak dekat, dikarenakan jarak anda adalah pertarungan jarak dekat");
        else
        System.out.println("Anda disarankan menggunakan ranged weapon untuk melakukan pertarungan jarak jauh, karena jarak pertarungan anda yang jauh");
        input.close();
    }
}