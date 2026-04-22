public class StackTugasMahasiswa02 {
    Mahasiswa02[] stack;
    int top;
    int size;

    public StackTugasMahasiswa02(int size) {
        this.size = size;
        stack = new Mahasiswa02[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa02 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa02 pop() {
        if (!isEmpty()) {
            Mahasiswa02 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public Mahasiswa02 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public int hitungTugas() {
        return top + 1;
    }

    // PERCOBAAN 2: konversi nilai ke biner
    public void konversiDesimalKeBiner(int kode) {
        StackKonversi02 stackKonversi = new StackKonversi02();

        do {
            stackKonversi.push(kode % 2);
            kode = kode / 2;
        } while (kode > 0);

        System.out.print("Nilai Biner Tugas: ");
        while (!stackKonversi.isEmpty()) {
            System.out.print(stackKonversi.pop());
        }
        System.out.println();
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println(" ");
    }
}