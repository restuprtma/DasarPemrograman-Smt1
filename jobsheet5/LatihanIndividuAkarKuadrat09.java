import java.util.Scanner;

/**
 * LatihanIndividuAkarKuadrat09
 */
public class LatihanIndividuAkarKuadrat09 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Input nilai a dan b
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
        
        // Menghitung diskriminan
        double diskriminan = b * b - 4*a*c;
        
        // Mengecek apakah akar kuadratnya real atau kompleks
        if (diskriminan >= 0) {
            double akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            double akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            System.out.println("Akar 1: " + akar1);
            System.out.println("Akar 2: " + akar2);
        } else {
            double bagianRe = -b / (2 * a);
            double bagianIm = Math.sqrt(-diskriminan) / (2 * a);
            System.out.println("Akar 1 (Real): " + bagianRe + " + " + bagianIm + "i");
            System.out.println("Akar 2 (Real): " + bagianRe + " - " + bagianIm + "i");
            input.close();
        }
    }
}