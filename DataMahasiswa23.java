
import java.util.Scanner;

public class DataMahasiswa23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input.nextInt();

        String[] namaMahasiswa = new String[jumlahMahasiswa];
        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];

        inputDataMahasiswa(input, namaMahasiswa, nilaiMahasiswa);
        tampilkanSeluruhData(namaMahasiswa, nilaiMahasiswa);
        nilaiTertinggi(namaMahasiswa, nilaiMahasiswa);
        rataRataNilai(namaMahasiswa, nilaiMahasiswa);
    }

    // Fungsi untuk menginputkan data nilai dan mahasiswa
    public static void inputDataMahasiswa(Scanner input, String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println("\nMasukkan data mahasiswa dan nilai:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input.next();
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Nilai tugas ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data dari tugas pertama hingga terakhir
    public static void tampilkanSeluruhData(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println("\nSeluruh Data Nilai:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan nilai tertinggi mahasiswa
    public static void nilaiTertinggi(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println("\nNilai Tertinggi Setiap Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            int maxNilai = 0;
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                if (nilaiMahasiswa[i][j] > maxNilai) {
                    maxNilai = nilaiMahasiswa[i][j];
                }
            }
            System.out.println(namaMahasiswa[i] + ": " + maxNilai);
        }
    }

    // Fungsi untuk menampilkan rata-rata nilai setiap mahasiswa
    public static void rataRataNilai(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println("\nRata-rata Nilai Setiap Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }
            double rataRata = (double) totalNilai / nilaiMahasiswa[i].length;
            System.out.println(namaMahasiswa[i] + ": " + rataRata);
        }
    }
}
