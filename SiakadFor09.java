import java.util.Scanner;
public class SiakadFor09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0;
        double nilai, terendah = 100;

        //masukkan nilai mahasiswa
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            sc.nextDouble();
        }

        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }

        //menampilkan nilai tertinggi dan terendah
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}