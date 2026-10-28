
package tugas;

import java.util.Scanner;

public class tugas1{

    public static void main(String[] args) {
        int tahun;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Tahun (1909 - 2024: ");
        tahun = input.nextInt();
        
        if(tahun % 4 == 0){
            System.out.println(tahun + " adalah tahun kabisat");
        }else{
            System.out.println(tahun + " adalah bukan tahun kabisat");
        }
    }
    
}

