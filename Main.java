package tugas3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        // Perulangan untuk input data mahasiswa
        boolean next = true;
        while (next) {
            Mahasiswa mhs = new Mahasiswa();

            // Input NIM dan nama
            System.out.print("Masukkan NIM: ");
            mhs.setNim(scanner.nextLine());

            System.out.print("Masukkan nama: ");
            mhs.setNama(scanner.nextLine());

            // ArrayList untuk menyimpan data mata kuliah
            ArrayList<MataKuliah> matkuls = new ArrayList<>();

            // Perulangan untuk input data mata kuliah
            boolean nextMatkul = true;
            while (nextMatkul) {
                MataKuliah mk = new MataKuliah();

                // Input kode MK, nama MK, dan nilai angka
                System.out.print("Masukkan kode mata kuliah: ");
                mk.setKodeMk(scanner.nextLine());

                System.out.print("Masukkan nama mata kuliah: ");
                mk.setNamaMk(scanner.nextLine());

                System.out.print("Masukkan nilai: ");
                mk.setNilaiAngka(scanner.nextInt());

                // Consume the newline character
                scanner.nextLine();

                // Menambahkan mata kuliah ke ArrayList
                matkuls.add(mk);

                // Menanyakan apakah ingin menambahkan mata kuliah lagi
                System.out.print("Tambah Mata Kuliah? (y/n): ");
                String tambahMK = scanner.nextLine();
                nextMatkul = tambahMK.equalsIgnoreCase("y");
            }

            // Menambahkan data mata kuliah ke objek mahasiswa
            mhs.setMatkuls(matkuls);

            // Menambahkan objek mahasiswa ke ArrayList
            mahasiswas.add(mhs);

            // Menanyakan apakah ingin menambahkan data mahasiswa lagi
            System.out.print("Input kembali mahasiswa? (y/n): ");
            String tambah = scanner.nextLine();
            next = tambah.equalsIgnoreCase("y");
        }

        // Menampilkan data mahasiswa dan mata kuliahnya
        for (Mahasiswa mhs : mahasiswas) {
            String nim = mhs.getNim();
            String nama = mhs.getNama();
            System.out.println("--------------KARTU HASIL STUDI--------------");
            System.out.println("    Nama    : " + nama);
            System.out.println("    NIM     : " + nim);
            System.out.println("---------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-5s |\n", "Kode MK", "Nama MK","Nilai");
            System.out.println("---------------------------------------------");
            for (MataKuliah mk : mhs.getMatkuls()) {
                String kodeMk = mk.getKodeMk();
                String namaMk = mk.getNamaMk();
                int nilaiAngka = (int) mk.getNilaiAngka();
                String khs = mk.setKHS();
                System.out.printf("| %-10s | %-20s | %-5s |\n", kodeMk, namaMk, khs);
            }
            System.out.println("---------------------------------------------");
            System.out.println("\n");
        }

    }
}
