public class Segitiga2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        double luas = 0.5 * a * b;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double keliling = a + b + c;

        System.out.println("Luas     = " + luas);     
        System.out.println("Sisi c   = " + c);        
        System.out.println("Keliling = " + keliling); 
    }
}
