package jobsheet13;

import java.util.Scanner;
public class UcapanTerimaKasih09 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank You "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I cloud ask you anything.");
    }
    
    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Wish you all the best";
        UcapanTambahan(ucapan);
    }
}
