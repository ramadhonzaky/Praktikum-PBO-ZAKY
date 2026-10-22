package TugasPraktikum4;

import java.util.Scanner;
 
public class KomisiSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan total penjualan hari ini (Rp): ");
        double penjualan = input.nextDouble();
 
        double jasa, komisi;
 
        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            jasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            jasa = 300000;
            komisi = 0.20 * penjualan;
        }
 
        double pendapatan = jasa + komisi;
 
        System.out.printf("Uang jasa  : Rp%,.0f%n", jasa);
        System.out.printf("Komisi     : Rp%,.0f%n", komisi);
        System.out.printf("Pendapatan : Rp%,.0f%n", pendapatan);
 
        input.close();
    }
}