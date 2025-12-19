
import java.util.Scanner;

public class Magang2 {

    static Scanner sc = new Scanner(System.in);

    // BATAS MAKSIMAL DATA
    static final int MAX = 100;

    // ARRAY DATA MAHASISWA
    static String[] nama = new String[MAX];
    static int[] nim = new int[MAX];
    static String[] prodi = new String[MAX];
    static int[] semester = new int[MAX];
    static String[] perusahaan = new String[MAX];
    static String[] status = new String[MAX];

    static int jumlahData = 0; // penanda jumlah pendaftar

    public static void main(String[] args) {
        int menu;

        do {
            System.out.println("\n=== SISTEM PENDAFTARAN MAGANG ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar");
            System.out.println("3. Cari Berdasarkan Prodi");
            System.out.println("4. Hitung Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                tambahData();
            } else if (menu == 2) {
                tampilkanSemua();
            } else if (menu == 3) {
                cariProdi();
            } else if (menu == 4) {
                hitungStatus();
            } else if (menu == 5) {
                System.out.println("Program selesai.");
            } else {
                System.out.println("Menu tidak valid!");
            }

        } while (menu != 5);
    }

    // ================= INPUT DATA =================
    static void tambahData() {
        if (jumlahData >= MAX) {
            System.out.println("Data penuh!");
            return;
        }

        System.out.print("Nama Mahasiswa: ");
        nama[0]= sc.nextLine();

        System.out.print("NIM: ");
        nim[jumlahData] = sc.nextInt();
        sc.nextLine();

        System.out.print("Program Studi: ");
        prodi[jumlahData] = sc.nextLine();

        semester[jumlahData] = inputSemester();

        System.out.print("Perusahaan Tujuan: ");
        perusahaan[jumlahData] = sc.nextLine();

        while (true) {
            System.out.print("Status (Diterima/Menunggu/Ditolak): ");
            status[jumlahData] = sc.nextLine();

            if (status[jumlahData].equalsIgnoreCase("diterima")
                    || status[jumlahData].equalsIgnoreCase("menunggu")
                    || status[jumlahData].equalsIgnoreCase("ditolak")) {
                break;
            }
            System.out.println("Status tidak valid!");
        }

        jumlahData++;
        System.out.println("Data berhasil ditambahkan!");
    }

    // ================= TAMPIL SEMUA =================
    static void tampilkanSemua() {
        if (jumlahData == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("\n=== DAFTAR PENDAFTAR MAGANG ===");
        System.out.printf("%-4s %-20s %-12s %-20s %-10s %-20s %-10s\n",
                "No", "Nama", "NIM", "Prodi", "Semester", "Perusahaan", "Status");

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-4d %-20s %-12d %-20s %-10d %-20s %-10s\n",
                    i + 1,
                    nama[i],
                    nim[i],
                    prodi[i],
                    semester[i],
                    perusahaan[i],
                    status[i]);
        }
    }

    // ================= CARI PRODI =================
    static void cariProdi() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        System.out.print("Masukkan Prodi: ");
        String cari = sc.nextLine();
        boolean ketemu = false;

        for (int i = 0; i < jumlahData; i++) {
            if (prodi[i].equalsIgnoreCase(cari)) {
                if (!ketemu) {
                    System.out.println("\nNama\t\tNIM\tSemester\tPerusahaan\tStatus");
                }
                ketemu = true;
                System.out.println(nama[i] + "\t" + nim[i] + "\t" + semester[i]
                        + "\t\t" + perusahaan[i] + "\t" + status[i]);
            }
        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // ================= HITUNG STATUS =================
    static void hitungStatus() {
        int diterima = 0, menunggu = 0, ditolak = 0;

        for (int i = 0; i < jumlahData; i++) {
            if (status[i].equalsIgnoreCase("diterima")) {
                diterima++;
            } else if (status[i].equalsIgnoreCase("menunggu")) {
                menunggu++;
            } else if (status[i].equalsIgnoreCase("ditolak")) {
                ditolak++;
            }
        }

        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak  : " + ditolak);
    }

    // ================= VALIDASI SEMESTER =================
    static int inputSemester() {
        int smt;
        while (true) {
            System.out.print("Semester (6 atau 7): ");
            smt = sc.nextInt();
            sc.nextLine();

            if (smt == 6 || smt == 7) {
                return smt;
            }
            System.out.println("Semester salah!");
        }
    }
}
