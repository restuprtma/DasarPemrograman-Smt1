import java.util.Scanner;

public class individu9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalUnit;
        double harga100unitPertama, hargaSetelah100Unit, hargaUnitSisa, totalHarga, biayaTambahan;

        // Input

        System.out.print("Masukkan total unit: ");
        totalUnit = scanner.nextInt();
        scanner.close();

        // Calculate harga for each tier
        harga100unitPertama = 0.85 * Math.min(totalUnit, 100);
        hargaSetelah100Unit = 1.45 * Math.max(Math.min(totalUnit - 100, 100), 0);
        hargaUnitSisa = 1.85 * Math.max(totalUnit - 200, 0);

        // Calculate total harga
        totalHarga = totalUnit + hargaSetelah100Unit + hargaUnitSisa;

        // Check for minimum charge
        if (totalHarga < 500) {
            totalHarga = 500;
        }

        // Check for additional charge
        if (totalHarga > 2500) {
            biayaTambahan = 0.03 * totalHarga;
            totalHarga += biayaTambahan;
        }

        // Output
        System.out.println("Harga akhir: $" + totalHarga);
   

    }
}
