public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;
        
        System.out.println("a. Celcius ke Fahrenheit");
        System.out.println(C + " C = " + (9.0 / 5 * C + 32) + " F");
        System.out.println("   Fahrenheit ke Celcius");
        System.out.println(F + " F = " + ((F - 32) * 5.0 / 9) + " C");
        
        System.out.println("b. Celcius ke Reamur");
        System.out.println(C + " C = " + (4.0 / 5 * C) + " R");
        System.out.println("   Reamur ke Celcius");
        System.out.println(R + " R = " + (5.0 / 4 * R) + " C");

        System.out.println("c. Fahrenheit ke Reamur");
        System.out.println(F + " F = " + ((F - 32) * 4.0 / 9) + " R");
        System.out.println("   Reamur ke Fahrenheit");
        System.out.println(R + " R = " + (9.0 / 4 * R + 32) + " F");
    }
}
