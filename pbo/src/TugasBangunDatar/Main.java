package TugasBangunDatar;

public class Main {

    public static void main(String[] args) {

        // Membuat objek dari setiap bangun datar
        BangunDatar persegi = new Persegi(5);

        BangunDatar persegiPanjang =
                new PersegiPanjang(8, 4);

        BangunDatar segitiga =
                new Segitiga(4, 3, 3, 4, 5);

        BangunDatar lingkaran = new Lingkaran(7);

        // Menampilkan hasil
        tampilkanHasil("PERSEGI", persegi);
        tampilkanHasil("PERSEGI PANJANG", persegiPanjang);
        tampilkanHasil("SEGITIGA", segitiga);
        tampilkanHasil("LINGKARAN", lingkaran);
    }

    public static void tampilkanHasil(
            String nama, BangunDatar bangun) {

        System.out.println("=== " + nama + " ===");
        System.out.printf("Luas     : %.2f%n",
                bangun.hitungLuas());
        System.out.printf("Keliling : %.2f%n",
                bangun.hitungKeliling());
        System.out.println();
    }
}