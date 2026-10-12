public class WaktuCahaya {
    public static void main(String[] args) {
        double kecepatan = 300000;           
        double jarakBulan = 384400;          
        double jarakMatahari = 152100000;    

        double waktuBulan = jarakBulan / kecepatan;
        double waktuMatahari = jarakMatahari / kecepatan;

        System.out.println("Waktu ke Bulan     : " + waktuBulan + " detik");
        System.out.println("Waktu ke Matahari  : " + waktuMatahari + " detik");
        System.out.println("                   = " + (waktuMatahari / 60) + " menit");
    }
}
