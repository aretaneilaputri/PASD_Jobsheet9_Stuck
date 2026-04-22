# PASD_Jobsheet9_Stuck
2.1 —— Percobaan 1: Mahasiswa Mengumpulkan Tugas
Pertanyaan dan Jawaban
1.	Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
Jawaban:Yang perlu diperbaiki adalah di MahasiswaDemo02.java bagian case 2, yaitu setelah scan.nextInt() perlu ditambahkan scan.nextLine() untuk membersihkan sisa karakter enter di buffer. Kalau tidak ditambahkan, waktu balik ke menu dan pilih case 1, input nama langsung kelewat begitu saja karena Scanner masih membaca sisa \n tadi sebagai inputan.
2.	Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!
Jawaban:Stack bisa menampung 5 data tugas mahasiswa. Angka 5 ini ditentukan waktu object stack dibuat di MahasiswaDemo02.java:
StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5)
Angka 5 itu kemudian masuk ke konstruktor dan dijadikan ukuran array-nya:
public StackTugasMahasiswa02(int size) {
    this.size = size;
    stack = new Mahasiswa02[size];
    top = -1;
}
Jadi kalau mau kapasitasnya lebih besar atau kecil, tinggal ganti angka 5 itu saja.
3.	Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?
Jawaban:Karena array itu ukurannya fixed, tidak bisa bertambah sendiri. Kalau langsung push tanpa cek dulu seperti ini:
public void push(Mahasiswa02 mhs) {
    top++;
    stack[top] = mhs;
}
Begitu stack sudah penuh dan push dipanggil lagi, top naik jadi 5 dan program mencoba akses stack[5] yang tidak ada — langsung error ArrayIndexOutOfBoundsException dan program mati. Pengecekan !isFull() mencegah hal itu terjadi dengan menolak push kalau memang sudah tidak ada ruang.
4.	Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!
Jawab:Stack itu seperti tumpukan buku — yang pertama diletakkan ada paling bawah. Nah di array, "paling bawah" artinya indeks 0, karena itu adalah slot pertama yang terisi waktu push pertama kali dilakukan. Jadi method peekBottom() cukup mengembalikan stack[0] tanpa perlu menggeser top sama sekali:
public Mahasiswa02 peekBottom() {
    if (!isEmpty()) {
        return stack[0];
    } else {
        System.out.println("Stack kosong!");
        return null;
    }
}
5.	Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!
Jawab:Informasi jumlah tugas sudah tersimpan secara tidak langsung di variabel top. Waktu stack kosong top bernilai -1, waktu ada 1 data top jadi 0, waktu ada 3 data top jadi 2, dan seterusnya. Jadi jumlah tugas yang ada tinggal top + 1 — tidak perlu loop, tidak perlu variabel tambahan:
public int hitungTugas() {
    return top + 1;
}
6.	Commit dan push kode program ke Github
