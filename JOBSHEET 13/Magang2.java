
import java.io.*;
import java.util.Scanner;

public class Magang2 {

    static String[] nama = new String[100];
    static String[] nim = new String[100];
    static String[] prodi = new String[100];
    static String[] perusahaan = new String[100];
    static int[] semester = new int[100];
    static String[] status = new String[100];

    static int totalPendaftar = 0;

    static Scanner sc = new Scanner(System.in);
    private static final String NAMA_FILE = "data_magang.txt";

    public static void main(String[] args) {

        muatDataAwal();

        int menu;
        do {
            System.out.println("\n=== Sistem Pendaftaran Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Hapus Data Magang");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");

            if (sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine();
            } else {
                menu = 0;
                sc.nextLine();
            }

            switch (menu) {
                case 1 ->
                    tambahDataMagang();
                case 2 ->
                    tampilkanSemuaPendaftar();
                case 3 ->
                    cariPendaftarBerdasarkanProdi();
                case 4 ->
                    hitungStatus();
                case 5 ->
                    hapusDataMagang();
                case 6 ->
                    System.out.println("Keluar dari program...");
                default ->
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 6);
    }

    static void muatDataAwal() {
        File file = new File(NAMA_FILE);
        if (!file.exists()) {
            return;
        }

        try (Scanner fileSc = new Scanner(file)) {
            totalPendaftar = 0;
            while (fileSc.hasNextLine() && totalPendaftar < 100) {
                String baris = fileSc.nextLine();
                String[] data = baris.split(",");

                if (data.length == 6) {
                    nama[totalPendaftar] = data[0];
                    nim[totalPendaftar] = data[1];
                    prodi[totalPendaftar] = data[2];
                    perusahaan[totalPendaftar] = data[3];
                    semester[totalPendaftar] = Integer.parseInt(data[4].trim());
                    status[totalPendaftar] = data[5];
                    totalPendaftar++;
                }
            }
            System.out.println("Data pendaftar (" + totalPendaftar + ") berhasil dimuat dari file.");
        } catch (FileNotFoundException e) {
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format data di file.");
        }
    }

    static boolean simpanSemuaData() {
        try (FileWriter fw = new FileWriter(NAMA_FILE, false); PrintWriter pw = new PrintWriter(fw)) {

            for (int i = 0; i < totalPendaftar; i++) {
                String data = nama[i] + ","
                        + nim[i] + ","
                        + prodi[i] + ","
                        + perusahaan[i] + ","
                        + semester[i] + ","
                        + status[i];
                pw.println(data);
            }
            return true;
        } catch (IOException e) {
            System.out.println("Kesalahan: Gagal menyimpan semua data ke file.");
            return false;
        }
    }

    static void tambahDataMagang() {
        System.out.println("\n--- Tambah Data Magang ---");

        System.out.print("Nama: ");
        nama[totalPendaftar] = sc.nextLine();

        System.out.print("NIM: ");
        nim[totalPendaftar] = sc.nextLine();

        System.out.print("Program Studi: ");
        prodi[totalPendaftar] = sc.nextLine();

        System.out.print("Masukkan Perusahaan: ");
        perusahaan[totalPendaftar] = sc.nextLine();

        int inputSemester;
        do {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            if (sc.hasNextInt()) {
                inputSemester = sc.nextInt();
                if (inputSemester != 6 && inputSemester != 7) {
                    System.out.println("Input salah! Semester hanya boleh 6 atau 7.");
                }
            } else {
                inputSemester = 0;
                System.out.println("Input harus berupa angka.");
            }
            sc.nextLine();
        } while (inputSemester != 6 && inputSemester != 7);
        semester[totalPendaftar] = inputSemester;

        String inputStatus;
        do {
            System.out.print("Status Magang (Diterima/Menunggu/Ditolak): ");
            inputStatus = sc.nextLine();

            if (!inputStatus.equalsIgnoreCase("Diterima")
                    && !inputStatus.equalsIgnoreCase("Menunggu")
                    && !inputStatus.equalsIgnoreCase("Ditolak")) {
                System.out.println("Input salah! Status harus: Diterima, Menunggu, atau Ditolak.");
            }
        } while (!inputStatus.equalsIgnoreCase("Diterima")
                && !inputStatus.equalsIgnoreCase("Menunggu")
                && !inputStatus.equalsIgnoreCase("Ditolak"));

        status[totalPendaftar] = inputStatus;

        totalPendaftar++;
        System.out.println("Data Pendaftaran Magang Berhasil Ditambahkan. Total Pendaftar: " + totalPendaftar);

        try (FileWriter fw = new FileWriter(NAMA_FILE, true); PrintWriter pw = new PrintWriter(fw)) {

            String dataBaru = nama[totalPendaftar - 1] + ","
                    + nim[totalPendaftar - 1] + ","
                    + prodi[totalPendaftar - 1] + ","
                    + perusahaan[totalPendaftar - 1] + ","
                    + semester[totalPendaftar - 1] + ","
                    + status[totalPendaftar - 1];

            pw.println(dataBaru);

        } catch (IOException e) {
            System.out.println("Gagal menyimpan data ke file.");
        }
    }

    static void tampilkanSemuaPendaftar() {
        System.out.println("\n--- Daftar Pendaftar Magang ---");

        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.printf("%-3s %-15s %-12s %-25s %-15s %-10s %-10s\n",
                "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (int i = 0; i < totalPendaftar; i++) {
            System.out.printf("%-3d %-15s %-12s %-25s %-15s %-10d %-10s\n",
                    (i + 1),
                    nama[i],
                    nim[i],
                    prodi[i],
                    perusahaan[i],
                    semester[i],
                    status[i]);
        }
    }

    static void cariPendaftarBerdasarkanProdi() {
        System.out.println("\n--- Cari Pendaftar berdasarkan Program Studi ---");
        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar untuk dicari.");
            return;
        }

        System.out.print("Masukkan kata kunci Program Studi: ");
        String keyword = sc.nextLine();

        boolean ditemukan = false;

        System.out.printf("%-3s %-15s %-12s %-25s %-10s\n",
                "No", "Nama", "NIM", "Prodi", "Status");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < totalPendaftar; i++) {
            if (prodi[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.printf("%-3d %-15s %-12s %-25s %-10s\n",
                        (i + 1), nama[i], nim[i], prodi[i], status[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan prodi '" + keyword + "' tidak ditemukan.");
        }
    }

    static void hitungStatus() {
        System.out.println("\n--- Rekapitulasi Status Magang ---");
        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        int countDiterima = 0;
        int countMenunggu = 0;
        int countDitolak = 0;

        for (int i = 0; i < totalPendaftar; i++) {
            if (status[i].equalsIgnoreCase("Diterima")) {
                countDiterima++;
            } else if (status[i].equalsIgnoreCase("Menunggu")) {
                countMenunggu++;
            } else if (status[i].equalsIgnoreCase("Ditolak")) {
                countDitolak++;
            }
        }

        System.out.println("Diterima : " + countDiterima);
        System.out.println("Menunggu : " + countMenunggu);
        System.out.println("Ditolak  : " + countDitolak);
        System.out.println("Total    : " + totalPendaftar);
    }

    static void hapusDataMagang() {
        System.out.println("\n--- Hapus Data Magang ---");
        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar untuk dihapus.");
            return;
        }

        tampilkanSemuaPendaftar();

        System.out.print("Masukkan Nomor urut data yang ingin dihapus (1 - " + totalPendaftar + "): ");
        int nomorHapus;

        if (sc.hasNextInt()) {
            nomorHapus = sc.nextInt();
            sc.nextLine();
        } else {
            sc.nextLine();
            System.out.println("Input tidak valid. Harus berupa angka.");
            return;
        }

        int indeksHapus = nomorHapus - 1;

        if (indeksHapus >= 0 && indeksHapus < totalPendaftar) {
            String namaTerhapus = nama[indeksHapus];

            for (int i = indeksHapus; i < totalPendaftar - 1; i++) {
                nama[i] = nama[i + 1];
                nim[i] = nim[i + 1];
                prodi[i] = prodi[i + 1];
                perusahaan[i] = perusahaan[i + 1];
                semester[i] = semester[i + 1];
                status[i] = status[i + 1];
            }

            totalPendaftar--;

            if (simpanSemuaData()) {
                System.out.println("Data pendaftar atas nama '" + namaTerhapus + "' berhasil dihapus.");
                System.out.println("Total Pendaftar saat ini: " + totalPendaftar);
            } else {
                totalPendaftar++;
                System.out.println("Data berhasil dihapus dari memori, tapi gagal disimpan ke file.");
            }
        } else {
            System.out.println("Nomor urut tidak valid.");
        }
    }
}
