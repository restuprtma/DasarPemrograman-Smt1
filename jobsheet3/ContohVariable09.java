/**
 * ContohVariable09
 */
public class ContohVariable09 {

    public static void main(String[] args) {
        String hobySayaAdalah = "Bermain";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSaya = 18;
        double $ipk = 3.98, tinggi = 1.78;

        System.out.println(hobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}