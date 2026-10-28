
package tugas;

import java.util.Scanner;

public class tugas4  {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int jam, menit, detik, totdek;
        
        System.out.println("Masukkan jam:");
        jam = input.nextInt();
        
        System.out.println("Masukkan menit");
        menit = input.nextInt();
        
        System.out.println("Masukkan detik");
        detik = input.nextInt();
        
        totdek = jam*3600 + menit*60 + detik;
        
        System.out.println("Hasil detik: " + totdek);
    }
    
}
