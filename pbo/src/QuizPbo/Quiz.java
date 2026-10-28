package QuizPbo;

import java.util.Scanner;

public class Quiz {

    
    static double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (0.30 * tugas) + (0.30 * uts) + (0.40 * uas);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        
        String[] npm = new String[jumlah];
        String[] nama = new String[jumlah];
        double[] tugas = new double[jumlah];
        double[] uts = new double[jumlah];
        double[] uas = new double[jumlah];
        double[] nilaiAkhir = new double[jumlah];
        String[] nilaiHuruf = new String[jumlah];
        String[] status = new String[jumlah];

        
        for (int i = 0; i < jumlah; i++) {

            System.out.println("\n=== Data Mahasiswa ke-" + (i + 1) + " ===");

            System.out.print("NPM  : ");
            npm[i] = input.nextLine();

            System.out.print("Nama : ");
            nama[i] = input.nextLine();

        
            do {
                System.out.print("Nilai Tugas (0-100): ");
                tugas[i] = input.nextDouble();

                if (tugas[i] < 0 || tugas[i] > 100) {
                    System.out.println("Nilai tidak valid! Masukkan nilai 0-100.");
                }
            } while (tugas[i] < 0 || tugas[i] > 100);

        
            do {
                System.out.print("Nilai UTS (0-100): ");
                uts[i] = input.nextDouble();

                if (uts[i] < 0 || uts[i] > 100) {
                    System.out.println("Nilai tidak valid! Masukkan nilai 0-100.");
                }
            } while (uts[i] < 0 || uts[i] > 100);

        
            do {
                System.out.print("Nilai UAS (0-100): ");
                uas[i] = input.nextDouble();

                if (uas[i] < 0 || uas[i] > 100) {
                    System.out.println("Nilai tidak valid! Masukkan nilai 0-100.");
                }
            } while (uas[i] < 0 || uas[i] > 100);

            input.nextLine();

        
            nilaiAkhir[i] = hitungNilaiAkhir(tugas[i], uts[i], uas[i]);

        
            if (nilaiAkhir[i] >= 80) {
                nilaiHuruf[i] = "A";
                status[i] = "LULUS";
            } else if (nilaiAkhir[i] >= 70) {
                nilaiHuruf[i] = "B";
                status[i] = "LULUS";
            } else if (nilaiAkhir[i] >= 60) {
                nilaiHuruf[i] = "C";
                status[i] = "LULUS";
            } else if (nilaiAkhir[i] >= 50) {
                nilaiHuruf[i] = "D";
                status[i] = "TIDAK LULUS";
            } else {
                nilaiHuruf[i] = "E";
                status[i] = "TIDAK LULUS";
            }
        }

        
        System.out.println("\n\n===============================================================");
        System.out.println("                  DATA NILAI MAHASISWA");
        System.out.println("===============================================================");

        System.out.printf("%-15s %-20s %-8s %-8s %-8s %-10s %-6s %-15s%n",
                "NPM", "Nama", "Tugas", "UTS", "UAS",
                "Akhir", "Huruf", "Status");

        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-15s %-20s %-8.2f %-8.2f %-8.2f %-10.2f %-6s %-15s%n",
                    npm[i],
                    nama[i],
                    tugas[i],
                    uts[i],
                    uas[i],
                    nilaiAkhir[i],
                    nilaiHuruf[i],
                    status[i]);
        }

        System.out.println("===============================================================");

        input.close();
    }
}

       

