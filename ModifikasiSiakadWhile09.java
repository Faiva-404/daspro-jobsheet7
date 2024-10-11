import java.util.Scanner;
public class ModifikasiSiakadWhile09 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari user
        Scanner sc = new Scanner(System.in);
        int nilai, jml, i = 0;

        // Menerima input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        // Perulangan while dengan batas jumlah mahasiswa
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            // Mengecek apakah nilai valid (0 hingga 100)
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue; // Lewati iterasi jika nilai tidak valid
            }

            // Menentukan kategori nilai berdasarkan rentang
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                // Pesan tambahan jika nilai A
                System.out.println("Bagus, pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }

            // Increment counter
            i++;
        }

        // Menutup scanner
        sc.close();
    }
}