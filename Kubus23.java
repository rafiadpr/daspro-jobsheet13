
import java.util.Scanner;

public class Kubus23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }

    public static double hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi;
        return volume;
    }

    public static double hitungLuasPermukaan(double sisi) {
        double luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
}
