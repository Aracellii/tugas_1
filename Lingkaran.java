package tugas_satu;

public class Lingkaran extends Bangun {
    public double jari;  

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    @Override
    public double hitungLuas() {
        return Math.PI * jari * jari;  
    }
    @Override
    public double hitungKeliling() {
        return Math.PI * jari *2;  
    }
}
