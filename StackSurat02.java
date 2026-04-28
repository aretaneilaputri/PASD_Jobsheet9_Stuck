public class StackSurat02 {
    Surat02[] stack;
    int size;
    int top;

    public StackSurat02(int size) {
        this.size = size;
        this.stack = new Surat02[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Terima Surat Izin (push)
    public void push(Surat02 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat dari " + surat.namaMahasiswa + " berhasil diterima.");
        } else {
            System.out.println("Stack penuh! Surat tidak dapat diterima.");
        }
    }

    // Proses Surat Izin (pop)
    public Surat02 pop() {
        if (!isEmpty()) {
            Surat02 surat = stack[top];
            stack[top] = null;
            top--;
            return surat;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    // Lihat Surat Izin Terakhir (peek)
    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    // Cari Surat berdasarkan nama mahasiswa
    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan: " + stack[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama \"" + namaMahasiswa + "\" tidak ditemukan.");
        }
    }

    // Tampilkan semua surat
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
        } else {
            System.out.println("=== Daftar Surat dalam Stack ===");
            for (int i = top; i >= 0; i--) {
                System.out.println("[" + i + "] " + stack[i]);
            }
        }
    }
}