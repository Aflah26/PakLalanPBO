package tugas;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        float jari, keliling, luas;
        float pi = 3.14f;
        
        System.out.println("Masukkan jari-jari lingkaran: ");
        jari = input.nextFloat();
        
        luas = pi*jari*jari;
        keliling = 2*pi*jari;
        
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}