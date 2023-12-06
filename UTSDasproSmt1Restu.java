

import java.util.Scanner;
public class UTSDasproSmt1Restu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiMtk, nilaiFisika, nilaiBInggris, nilaiBIndo;
        double rata2;
        String jurusan, prodi;

        System.out.print("Masukkan Jumlah calon mahasiswa\t: ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= jumlahMhs; i++){
        System.out.println("\nData calon mahasiswa ke-" + i);

        System.out.print("Masukkan Prodi yang anda pilih (D3 MI / D4 TI)\t: ");
        prodi = sc.nextLine();
        System.out.print("Masukkan jurusan (IPA / IPS / Bahasa)\t\t: ");
        jurusan = sc.nextLine();

        System.out.print("Masukkan nilai Matematika\t: " );
        nilaiMtk = sc.nextDouble();

        System.out.print("Masukkan nilai Fisika\t\t: " );
        nilaiFisika = sc.nextDouble();

        System.out.print("Masukkan nilai Bahasa Inggris\t: " );
        nilaiBInggris = sc.nextDouble();

        System.out.print("Masukkan nilai Bahasa Indonesia\t: " );
        nilaiBIndo = sc.nextDouble();

        rata2 = (nilaiMtk + nilaiFisika + nilaiBInggris + nilaiBIndo) / 4.0;
        System.out.println("Rata-rata nilai mahasiswa\t: " +rata2);

        if (prodi.equals("D3 MI") && jurusan.equals("IPA") && nilaiMtk >= 70 && nilaiFisika >= 70) {
            System.out.println("Selamat anda diterima di prodi D3 MI");
        }
        else if (prodi.equals("D4 TI") ) {
            if (jurusan.equals("IPA") || jurusan.equals("IPS") && nilaiMtk > 80 && rata2 >=80) {
                System.out.println("Selamat anda diterima di prodi D4 TI");
            }
        }
        else if (prodi.equals("D3 MI") && rata2 > 80 && nilaiMtk > 70 && nilaiBInggris > 70 && nilaiBIndo > 70) {
            System.out.println("Selamat anda diterima di prodi D3 MI");
        }
        else {
            System.out.println("Mohon maaf anda tidak lolos seleksi");
        }
    }
    sc.close();
    }
}
