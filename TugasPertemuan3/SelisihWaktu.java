package TugasPraktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelisihWaktu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("Waktu pertama");
        System.out.print("Jam   : ");
        int jam1 = Integer.parseInt(br.readLine());
        System.out.print("Menit : ");
        int menit1 = Integer.parseInt(br.readLine());
        System.out.print("Detik : ");
        int detik1 = Integer.parseInt(br.readLine());
 
        System.out.println("Waktu kedua");
        System.out.print("Jam   : ");
        int jam2 = Integer.parseInt(br.readLine());
        System.out.print("Menit : ");
        int menit2 = Integer.parseInt(br.readLine());
        System.out.print("Detik : ");
        int detik2 = Integer.parseInt(br.readLine());

        int waktu1 = jam1 * 3600 + menit1 * 60 + detik1;
        int waktu2 = jam2 * 3600 + menit2 * 60 + detik2;
 
        int selisih = waktu2 - waktu1;
 
        int jam = selisih / 3600;
        int sisa = selisih % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;
 
        System.out.println();
        System.out.println("Selisih waktu = " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}
