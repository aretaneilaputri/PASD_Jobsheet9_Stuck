import java.util.Scanner;

public class SuratDemo02 {
    public static void main(String[] args) {
        StackSurat02 stackSurat = new StackSurat02(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Tampilkan Semua Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat      : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas         : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S=Sakit / I=Izin Lain): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari) : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat02 surat = new Surat02(id, nama, kelas, jenis, durasi);
                    stackSurat.push(surat);
                    break;

                case 2:
                    Surat02 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Surat diproses: " + diproses);
                    }
                    break;

                case 3:
                    Surat02 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat teratas: " + terakhir);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    stackSurat.cariSurat(cari);
                    break;

                case 5:
                    stackSurat.print();
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        
    }
}