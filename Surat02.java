public class Surat02 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    // Constructor default
    public Surat02() {}

    // Constructor berparameter
    public Surat02(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    
    public String toString() {
        String jenisStr = (jenisIzin == 'S') ? "Sakit" : "Izin Keperluan Lain";
        return "ID: " + idSurat +
               " | Nama: " + namaMahasiswa +
               " | Kelas: " + kelas +
               " | Jenis: " + jenisStr +
               " | Durasi: " + durasi + " hari";
    }
}