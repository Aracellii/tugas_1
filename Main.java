package tugas_satu;

public class Main {
    public static void main(String[] args) {
        Bangun lingkaran = new Lingkaran(4); 
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungKeliling());

        Bangun persegi = new Persegi(4); 
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());

        
        Tabung tabung = new Tabung(4, 7);  
        System.out.println("Luas Permukaan Tabung: " + tabung.hitungKeliling());
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
    }
}
