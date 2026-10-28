package TugasSepeda;

public class ProgramSepeda {

    private String merk;
    private int jarakTempuh;

    
    public ProgramSepeda(String merk) {
        this.merk = merk;
        this.jarakTempuh = 0;
    }

    
    public void maju() {
        this.jarakTempuh += 10;
        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object Sepeda " + this.merk
                + ", Jarak tempuh " + this.jarakTempuh + " Km\n");
    }

    
    public void mundur() {
        this.jarakTempuh -= 5;

        if (this.jarakTempuh < 0) {
            this.jarakTempuh = 0;
        }

        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object Sepeda " + this.merk
                + ", Jarak tempuh " + this.jarakTempuh + " Km\n");
    }

    
    public void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + this.merk
                + ", Jarak tempuh akhir " + this.jarakTempuh + " Km\n");
    }

        public String getMerk() {
        return merk;
    }

    
    public static void main(String[] args) {
        ProgramSepeda sepeda1 = new ProgramSepeda("Polygon");

        sepeda1.maju();
        sepeda1.maju();
        sepeda1.mundur();
        sepeda1.berhenti();
    }
}