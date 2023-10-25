import java.util.Scanner;
/**
 * PemilihanPercobaan209
 */
public class PemilihanPercobaan209 {

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        float uas, uts, kuis, tugas, total;

        System.out.print("Nilai uas\t: ");
        uas = input09.nextFloat();
        System.out.print("Nilai uts\t: ");
        uts = input09.nextFloat();
        System.out.print("Nilai kuis\t: ");
        kuis = input09.nextFloat();
        System.out.print("Nilai Tugas\t: ");
        tugas = input09.nextFloat();

        total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);

        String message = total > 80 ? "A" :
        total > 73 && total <= 80 ? "B+" :
        total > 65 && total <= 73 ? "B" :
        total > 60 && total <= 65 ? "C+" :
        total > 50 && total <= 60 ? "C" :
        total > 39 && total <= 50 ? "D" :
        "E" ;
        System.out.println("Anda Mendapat Nilai akhir "+total+" Serta Nilai Huruf "+message);
    }
}