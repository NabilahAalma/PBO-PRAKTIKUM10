package HitungDataMahasiswa;

import java.util.ArrayList;

public class InputNilai {
    ArrayList<Mahasiswa> listmahasiswa;

    public InputNilai() {
        listmahasiswa = new ArrayList();
    }

    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah, int nilai1, int nilai2, int nilai3, int nilai4, int nilai5, double nilaiAkhir) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, MataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5, nilaiAkhir);
        listmahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getALL() {
        return listmahasiswa;
    }

    public boolean deleteData(int index) {
        try {
            // hapus di sepesifik baris
            listmahasiswa.remove(index);
            return true; // Return sukses jika berhasil dihapus
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index " + index + " is out of bounds.");
            return false; // Return false jika indeks yang dihapus tidak berhasil atau tidak valid
        }
    }
    
    public double hitungNilaiAkhir(int nil1, int nil2, int nil3, int nil4, int nil5) {
        // Menghitung nilai akhir sebagai rata-rata dari nilai 1 sampai nilai 5
        return ((nil1*0.1) + (nil2*0.15) + (nil3*0.25) + (nil4*0.15) + (nil5*0.35));
    }
}