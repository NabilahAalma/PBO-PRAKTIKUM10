package HitungDataMahasiswa;

public class Mahasiswa {
    private String NIM, Nama, Alamat, MataKuliah;
    private int nilai1, nilai2, nilai3, nilai4, nilai5;
    private double nilaiAkhir;

    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah, int nilai1, int nilai2, int nilai3, int nilai4, int nilai5, double nilaiAkhir) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;        
        this.nilaiAkhir = nilaiAkhir;        
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }
    
    public String getMataKuliah() {
        return MataKuliah;
    }
    
    public int getNilai1(){
        return nilai1;
    }
    
    public int getNilai2(){
        return nilai2;
    }
    
    public int getNilai3(){
        return nilai3;
    }
    
    public int getNilai4(){
        return nilai4;   
    }
    
    public int getNilai5(){
        return nilai5;
    }
    
    public Double getNilaiAkhir(){
        return nilaiAkhir;
    }
}
