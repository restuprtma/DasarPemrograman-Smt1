import java.util.Scanner;

/**
 * LatihanIndividu209
 */
public class LatihanIndividu209 {

    public static void main(String[] args) {
        String username = "user123";
        String password = "pass123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

      
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
        
        scanner.close();
    }
}