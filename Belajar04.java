public class Belajar04 {
    public static void main(String[] args) {
        int A,B,C;
        A = 5;
        B = 2;
        
        //Menambah
        C = A + B;
        System.out.println("A + B = " + C);
       
        //Mengurangi
        C = A - B;
        System.out.println("A - B = " + C);
        
        //Mengalikan
        C = A * B;
        System.out.println("A * B = " + C);
       
        //Membagi
        C = A / B;
        System.out.println("A / B = " + C);
        System.out.println("A / B = " + (double) A/B);
       
        //Modulus = sisa bagi
        C = A % B;
        System.out.println("A % B = " + C);
    }
}