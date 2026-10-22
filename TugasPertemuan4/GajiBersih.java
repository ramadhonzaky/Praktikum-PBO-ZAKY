package TugasPraktikum4;

import java.util.Scanner;
 
public class GajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("NIK                              : ");
        String nik = input.nextLine();
        System.out.print("Nama                             : ");
        String nama = input.nextLine();
        System.out.print("Kode golongan (1-4)              : ");
        int kode = input.nextInt();
        input.nextLine(); 
        System.out.print("Status (Menikah/Belum/Cerai)     : ");
        String status = input.nextLine();
        System.out.print("Jumlah anak                      : ");
        int jumlahAnak = input.nextInt();
 
        double gajiPokok;
        switch (kode) {
            case 1: gajiPokok = 1200000; break;
            case 2: gajiPokok = 1500000; break;
            case 3: gajiPokok = 1750000; break;
            case 4: gajiPokok = 2000000; break;
            default:
                System.out.println("Kode golongan tidak valid!");
                input.close();
                return;
        }
 
        double tunjPasangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjPasangan = 0.10 * gajiPokok;
        }
 
        double tunjAnak = 0.05 * gajiPokok * jumlahAnak;
 
        double tunjangan = tunjPasangan + tunjAnak;
 
        double gajiBersih = gajiPokok + tunjangan;
 
        System.out.println("\n===== SLIP GAJI =====");
        System.out.println("NIK              : " + nik);
        System.out.println("Nama             : " + nama);
        System.out.printf("Gaji pokok       : Rp%,.0f%n", gajiPokok);
        System.out.printf("Tunj. pasangan   : Rp%,.0f%n", tunjPasangan);
        System.out.printf("Tunj. anak       : Rp%,.0f%n", tunjAnak);
        System.out.printf("Total tunjangan  : Rp%,.0f%n", tunjangan);
        System.out.printf("Gaji bersih      : Rp%,.0f%n", gajiBersih);
 
        input.close();
    }
}
