
import java.util.Scanner;

public class PenjualanKafe23 {

    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] penjualan = new int[5][7];
        Scanner input = new Scanner(System.in);

        inputPenjualan(input, menu, penjualan);
        tampilkanPenjualan(menu, penjualan);
        menuTerlaris(menu, penjualan);
        rataRataPenjualan(menu, penjualan);
    }

    public static void inputPenjualan(Scanner input, String[] menu, int[][] penjualan) {
        System.out.println("Input data penjualan (per menu, 7 hari):");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }

    public static void tampilkanPenjualan(String[] menu, int[][] penjualan) {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void menuTerlaris(String[] menu, int[][] penjualan) {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris + " (Total: " + maxPenjualan + ")");
    }

    public static void rataRataPenjualan(String[] menu, int[][] penjualan) {
        System.out.println("\nRata-rata penjualan:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = totalPenjualan / 7.0;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }
}
