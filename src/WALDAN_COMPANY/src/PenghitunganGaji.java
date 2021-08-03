/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class PenghitunganGaji {

    static Scanner sc = new Scanner(System.in);
    static String[][] dataNamaDanGenderAwal, dataNamaDanGenderAkhir;
    static String[] dataJabatanPegawaiAwal, dataJabatanPegawaiAkhir, dataStatusPegawaiAwal, dataStatusPegawaiAkhir;
    static int[][] dataGajiPokokDanTunjanganJabatan = {{5_000_000, 250_000}, {4_000_000, 200_000}, {3_000_000, 150_000}};
    static int[] dataNoIndukKaryawanAwal, dataNoIndukKaryawanAkhir, dataTotalLemburAwal, dataTotalLemburAkhir;
    static int[] gajiTunjanganHarian = {150_000, 100_000};
    static int gajiLembur = 50_000, biayaAsuransi = 100_000, x = 0, awal = 0, batas = 5, kodeCari;

    static void inputDataNama(String[][] arrAwal, String[][] arrAkhir) {
        int i = 0;
        for (String[] arrAwal1 : arrAwal) {
            if ("x".equals(arrAwal1[0])) {
                continue;
            }
            arrAkhir[i][0] = arrAwal1[0];
            i++;
        }
    }

    static void inputDataGender(String[][] arrAwal, String[][] arrAkhir) {
        int i = 0;
        for (String[] arrAwal1 : arrAwal) {
            if ("x".equals(arrAwal1[1])) {
                continue;
            }
            arrAkhir[i][1] = arrAwal1[1];
            ++i;
        }
    }

    static void inputAngka(int[] arrAwal, int[] arrAkhir) {
        int i = 0;
        for (int j = 0; j < arrAwal.length; j++) {
            if (arrAwal[j] == -1) {
                continue;
            }
            arrAkhir[i] = arrAwal[j];
            i++;
        }
    }

    static void inputHuruf(String[] arrAwal, String[] arrAkhir) {
        int i = 0;
        for (String arrAwal1 : arrAwal) {
            if ("x".equals(arrAwal1)) {
                continue;
            }
            arrAkhir[i] = arrAwal1;
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("*=====\\ WALDAN COMPANY /=====*");
        String[][] dataNamaDanGender = {
            {"AFADA NUR", "L"},
            {"MUHAMMAD ALFIAN", "L"},
            {"MUHAMMAD WAHYU PRATAMA", "L"},
            {"MUSTIKA PUTRI", "P"},
            {"RIZKY AMALIA SANDYAPUTRI", "P"},
            {"THOSIN HILMI", "L"},
            {"YASMIN", "P"}
        };
        dataNamaDanGenderAwal = new String[dataNamaDanGender.length][2];
        inputDataNama(dataNamaDanGender, dataNamaDanGenderAwal);
        inputDataGender(dataNamaDanGender, dataNamaDanGenderAwal);
        dataNamaDanGenderAkhir = new String[dataNamaDanGender.length][2];
        inputDataNama(dataNamaDanGenderAwal, dataNamaDanGenderAkhir);
        inputDataGender(dataNamaDanGenderAwal, dataNamaDanGenderAkhir);

        String[] dataJabatanPegawai = {"A", "B", "B", "C", "A", "C", "A"};
        dataJabatanPegawaiAwal = new String[dataJabatanPegawai.length];
        inputHuruf(dataJabatanPegawai, dataJabatanPegawaiAwal);
        dataJabatanPegawaiAkhir = new String[dataJabatanPegawai.length];
        inputHuruf(dataJabatanPegawaiAwal, dataJabatanPegawaiAkhir);

        String[] dataStatusPegawai = {"PT", "PTT", "PT", "PTT", "PT", "PT", "PT"};
        dataStatusPegawaiAwal = new String[dataStatusPegawai.length];
        inputHuruf(dataStatusPegawai, dataStatusPegawaiAwal);
        dataStatusPegawaiAkhir = new String[dataStatusPegawai.length];
        inputHuruf(dataStatusPegawaiAwal, dataStatusPegawaiAkhir);

        int[] dataNoPegawai = {1101, 1102, 1103, 1104, 1105, 1106, 1107};
        dataNoIndukKaryawanAwal = new int[dataNoPegawai.length];
        inputAngka(dataNoPegawai, dataNoIndukKaryawanAwal);
        dataNoIndukKaryawanAkhir = new int[dataNoPegawai.length];
        inputAngka(dataNoIndukKaryawanAwal, dataNoIndukKaryawanAkhir);

        int[] dataTotalLembur = {13, 11, 14, 13, 8, 9, 11};
        dataTotalLemburAwal = new int[dataTotalLembur.length];
        inputAngka(dataTotalLembur, dataTotalLemburAwal);
        dataTotalLemburAkhir = new int[dataTotalLembur.length];
        inputAngka(dataTotalLemburAwal, dataTotalLemburAkhir);

        menuUtama();
    }

    static void menuUtama() {
        String[] pilihanMenuUtama = {
            "Menu Data Pegawai", "Menu Penghitungan Gaji",
            "Menu Slip Gaji", "Menu Pencarian Pegawai",
            "Menu Pelaporan"
        };
        System.out.println("*=====>>> MENU UTAMA <<<=====*");
        int i = 0, j = 0;
        do {
            System.out.printf("%d. %s\n", ++j, pilihanMenuUtama[i]);
            i++;
        } while (i < pilihanMenuUtama.length);
        System.out.println("0. Keluar Dari Program");
        System.out.print("==> Masukkan Pilihan 1/2/3 dst!\n" + "--> ");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                menuDataPegawai();
                break;
            case 2:
                menuHitungGaji();
                break;
            case 3:
                slipGaji();
                break;
            case 4:
                menuCariPegawai();
                pilihanMenuCariPegawai();
                pilihanCariPegawai();
                break;
            case 5:
                menuPelaporan();
                break;
            case 0:
                System.out.println("*=====>>> TERIMAKASI <<<=====*");
                System.exit(0);
                break;
            default:
                pilihanSalah();
                menuUtama();
        }
    }

    static void menuDataPegawai() {
        System.out.println("*=====>>> MENU DATA PEGAWAI <<<=====*");
        System.out.println("NAMA PEGAWAI:");
        batas = (batas > dataNamaDanGenderAkhir.length) ? dataNamaDanGenderAkhir.length : batas;
        for (int i = awal; i < batas; i++) {
            System.out.printf("%d. ", ++x);
            System.out.printf("%s \n", dataNamaDanGenderAkhir[i][0]);
        }
        if (batas == dataNamaDanGenderAkhir.length) {
            System.out.println("SUDAH DI UJUNG DATA"
                    + "\n~ Tekan (N) Jika Ingin Kembali Ke Data Awal");
        } else if (dataNamaDanGenderAkhir.length / batas != 0) {
            System.out.println("~ Tekan (Y) Untuk Data Selanjutnya...");
        }
        System.out.println("~ Tekan (I) Info Lebih Lengkap Tentang Pegawai");
        System.out.println("~ Tekan (X) Untuk Kembali Ke MENU UTAMA");
        System.out.print("==> Masukkan Pilihan!\n" + "--> ");
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'N':
            case 'n':
                x = 0;
                awal = 0;
                batas = 5;
                menuDataPegawai();
                break;
            case 'Y':
            case 'y':
                awal = batas;
                batas += 5;
                menuDataPegawai();
                break;
            case 'X':
            case 'x':
                x = 0;
                awal = 0;
                batas = 5;
                menuUtama();
                break;
            case 'I':
            case 'i':
                x = 0;
                awal = 0;
                batas = 5;
                System.out.println("~ Cari Pegawai Untuk Melihat Info Lengkap!");
                menuCariPegawai();
                pilihanMenuCariPegawai();
                pilihanCariPegawai();
                break;
            default:
                x = 0;
                awal = 0;
                batas = 5;
                pilihanSalah();
                menuDataPegawai();
        }
    }

    static void menuHitungGaji() {
        String[] pilihanMenuGaji = {
            "Gaji Pokok", "Tunjangan Jabatan", "Tunjangan Harian", "Lembur", "Asuransi"
        };
        System.out.println("*=====>>> MENU HITUNG GAJI PEGAWAI <<<=====*");
        System.out.println("~ Cari Pegawai Yang Ingin Dihitung Gajinya!");
        menuCariPegawai();
        pilihanMenuCariPegawai();
        System.out.println("~ Pilih Jenis Gaji Yang Ingin Dihitung!");
        int i = 0, j = 0;
        while (i < pilihanMenuGaji.length) {
            System.out.printf("%d. %s\n", ++j, pilihanMenuGaji[i]);
            ++i;
        }
        System.out.println("9. Kembali Ke MENU UTAMA");
        pilihanGaji();
    }

    static void pilihanGaji() {
        System.out.print("==> Masukkan Pilihan 1/2 dst!\n" + "--> ");
        int pil = sc.nextInt();
        int gaji = 0;
        switch (pil) {
            case 1:
                System.out.println("----------------------------------------");
                System.out.printf("GAJI POKOK = Rp%d\n", hitungGajiPokok(gaji));
                System.out.println("----------------------------------------");
                System.out.println();
                System.out.println("~ Tekan (Y) Untuk Menghitung Gaji Lainnya");
                System.out.println("~ Tekan (X) Untuk Kembali Ke MENU UTAMA");
                pilihanSelesai();
                break;
            case 2:
                tampil(kodeCari);
                System.out.println("----------------------------------------");
                System.out.printf("TUNJANGAN JABATAN = Rp%d\n", hitungTunjanganJabatan(gaji));
                System.out.println("----------------------------------------");
                System.out.println("~ Tekan (Y) Untuk Menghitung Gaji Lainnya");
                System.out.println("~ Tekan (X) Untuk Kembali Ke MENU UTAMA");
                pilihanSelesai();
                break;
            case 3:
                tampil(kodeCari);
                System.out.println("----------------------------------------");
                System.out.printf("TUNJANGAN HARIAN = Rp%d\n", hitungTunjanganHarian(gaji));
                System.out.println("----------------------------------------");
                System.out.println("~ Tekan (Y) Untuk Menghitung Gaji Lainnya");
                System.out.println("~ Tekan (X) Untuk Kembali Ke MENU UTAMA");
                pilihanSelesai();
                break;
            case 4:
                tampil(kodeCari);
                System.out.println("----------------------------------------");
                System.out.printf("GAJI LEMBUR = Rp%d\n", hitungLembur(gajiLembur, dataTotalLemburAkhir[kodeCari]));
                System.out.println("----------------------------------------");
                System.out.println("~ Tekan (Y) Untuk Menghitung Gaji Lainnya");
                System.out.println("~ Tekan (X) Untuk Kembali Ke MENU UTAMA");
                pilihanSelesai();
                break;
            case 5:
                tampil(kodeCari);
                System.out.println("----------------------------------------");
                System.out.printf("BIAYA ASURANSI = Rp%d\n", biayaAsuransi);
                System.out.println("----------------------------------------");
                System.out.println("~ Tekan (Y) Untuk Menghitung Gaji Lainnya");
                System.out.println("~ Tekan (X) Untuk Kembali Ke MENU UTAMA");
                pilihanSelesai();
                break;
            case 9:
                menuUtama();
                break;
            default:
                pilihanSalah();
                pilihanGaji();
        }
    }

    static void pilihanSelesai() {
        System.out.print("==> Masukkan Pilihan!\n" + "--> ");
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'Y':
            case 'y':
                String[] pilihanMenuGaji = {
                    "Gaji Pokok", "Tunjangan Jabatan", "Tunjangan Harian", "Lembur", "Asuransi"
                };
                System.out.println("~ Pilih Jenis Gaji Yang Ingin Dihitung!");
                int i = 0,
                 j = 0;
                while (i < pilihanMenuGaji.length) {
                    System.out.printf("%d. %s\n", ++j, pilihanMenuGaji[i]);
                    i++;
                }
                System.out.println("9. Kembali Ke MENU UTAMA");
                pilihanGaji();
                break;
            case 'X':
            case 'x':
                System.out.println();
                menuUtama();
                break;
            default:
                pilihanSalah();
                pilihanSelesai();
        }
    }

    static int hitungGajiPokok(int gajiPokok) {
        String a = dataJabatanPegawaiAkhir[kodeCari];
        switch (a) {
            case "A":
                gajiPokok = dataGajiPokokDanTunjanganJabatan[0][0];
                break;
            case "B":
                gajiPokok = dataGajiPokokDanTunjanganJabatan[1][0];
                break;
            case "C":
                gajiPokok = dataGajiPokokDanTunjanganJabatan[2][0];
                break;
            default:
        }
        return gajiPokok;
    }

    static int hitungTunjanganJabatan(int tunjanganJabatan) {
        String a = dataJabatanPegawaiAkhir[kodeCari];
        switch (a) {
            case "A":
                tunjanganJabatan = dataGajiPokokDanTunjanganJabatan[0][1];
                break;
            case "B":
                tunjanganJabatan = dataGajiPokokDanTunjanganJabatan[1][1];
                break;
            case "C":
                tunjanganJabatan = dataGajiPokokDanTunjanganJabatan[2][1];
                break;
            default:
        }
        return tunjanganJabatan;
    }

    static int hitungTunjanganHarian(int tunjanganHarian) {
        String a = dataStatusPegawaiAkhir[kodeCari];
        switch (a) {
            case "PT":
                tunjanganHarian = gajiTunjanganHarian[0];
                break;
            case "PTT":
                tunjanganHarian = gajiTunjanganHarian[1];
                break;
            default:
                System.out.println("----------------------------------------");
                System.out.println("JABATAN TIDAK TERSEDIA");
                System.out.println("----------------------------------------");
        }
        return tunjanganHarian;
    }

    static int hitungLembur(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a + hitungLembur(a, b - 1);
        }
    }

    static void slipGaji() {
        int simpan = 0, penghasilan = 0, potongan = 0;
        System.out.println("*=====>>> MENU SLIP GAJI KARYAWAN <<<=====*");
        System.out.println("~ Cari Pegawai Yang Ingin Dicetak Slip Gajinya!");
        menuCariPegawai();
        pilihanMenuCariPegawai();
        System.out.println("~ Memasukkan Tanggal Periode SLIP GAJI!");
        int[] tanggal = new int[6];
        System.out.print("==> Masukkan Tanggal Hari Ini!\n--> ");
        tanggal[0] = sc.nextInt();
        System.out.print("==> Masukkan Bulan Sekarang(Berupa Angka)!\n--> ");
        tanggal[1] = sc.nextInt();
        System.out.print("==> Masukkan Tahun Sekarang(ex:2020)!\n--> ");
        tanggal[2] = sc.nextInt();
        tanggal[3] = tanggal[0];
        tanggal[5] = tanggal[2];
        tanggal[4] = tanggal[1] + 1;
        if (tanggal[4] == 13) {
            tanggal[4] = 1;
            tanggal[5] += 1;
        }
        System.out.println("\n*=====\\ ***** /    WALDAN COMPANY     \\ ***** /=====*");
        System.out.println("*======\\ *** /  MOBILE APP DEVELOPER   \\ *** /======*");
        System.out.println("*=======\\_*_/ waldancompany@gmail.co.id \\_*_/=======*");
        System.out.println("-----------------------------------------------------");
        System.out.println("                 SLIP GAJI KARYAWAN");
        System.out.printf("           Periode %02d-%02d-%d - %02d-%02d-%d\n", tanggal[0], tanggal[1], tanggal[2], tanggal[3], tanggal[4], tanggal[5]);
        System.out.println("           -------------------------------\n");
        System.out.printf("NIK\t: %d\n", dataNoIndukKaryawanAkhir[kodeCari]);
        System.out.printf("Nama\t: %s\n", dataNamaDanGenderAkhir[kodeCari][0]);
        System.out.printf("Jabatan\t: %s\n", dataJabatanPegawaiAkhir[kodeCari]);
        System.out.printf("Status\t: %s\n\n", dataStatusPegawaiAkhir[kodeCari]);
        System.out.println("PENGHASILAN:");
        System.out.printf("Gaji Pokok\t\tRp%10d\n", hitungGajiPokok(simpan));
        penghasilan += hitungGajiPokok(simpan);
        System.out.printf("Tunjangan Jabatan\tRp%10d\n", hitungTunjanganJabatan(simpan));
        penghasilan += hitungTunjanganJabatan(simpan);
        System.out.printf("Tunjangan Harian\tRp%10d\n", hitungTunjanganHarian(simpan));
        penghasilan += hitungTunjanganHarian(simpan);
        System.out.printf("Lembur\t\t\tRp%10d\n", hitungLembur(gajiLembur, dataTotalLemburAkhir[kodeCari]));
        penghasilan += hitungLembur(gajiLembur, dataTotalLemburAkhir[kodeCari]);
        System.out.println("\t\t\t------------ +");
        System.out.printf("TOTAL PENGHASILAN (A)\tRp%10d\n", penghasilan);
        System.out.println("\nPOTONGAN:");
        System.out.printf("Asuransi\t\tRp%10d\n", biayaAsuransi);
        System.out.println("\t\t\t------------ +");
        potongan += biayaAsuransi;
        System.out.printf("TOTAL POTONGAN (B)\tRp%10d\n", potongan);
        simpan = penghasilan - potongan;
        System.out.println("-----------------------------------------------------");
        System.out.printf("PENERIMAAN BERSIH(A-B)\tRp%10d\n", simpan);
        System.out.println("-----------------------------------------------------");
        System.out.printf("\t\t\tMadura, %02d-%02d-%d\n", tanggal[3], tanggal[4], tanggal[5]);
        System.out.println("\t\t\tManajer Operasional\n\n\n");
        System.out.println("\t\t\tMoh. Iqbal Waldan\n");
        pilihanMenuPrint();
    }

    static void pilihanMenuPrint() {
        System.out.println("~ Tekan (Y) Untuk Cetak Dokumen Slip Gaji");
        System.out.println("~ Tekan (N) Untuk Simpan Dokumen Slip Gaji");
        System.out.println("~ Tekan (X) Untuk Kembali Ke MENU UTAMA");
        System.out.print("==> Masukkan Pilihan!\n" + "--> ");
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'Y':
            case 'y':
                System.out.println("----------------------------------------");
                System.out.println("PROSES CETAK DOKUMEN SUKSES");
                System.out.println("----------------------------------------");
                pilihanMenuPrint();
                break;
            case 'N':
            case 'n':
                System.out.println("----------------------------------------");
                System.out.println("PROSES SIMPAN DOKUMEN SUKSES");
                System.out.println("----------------------------------------");
                pilihanMenuPrint();
                break;
            case 'X':
            case 'x':
                System.out.println();
                menuUtama();
                break;
            default:
                pilihanSalah();
                pilihanMenuPrint();
        }
    }

    static void menuCariPegawai() {
        String[] pilihanCariPegawai = {
            "Nama Pegwai", "Gender Pegawai", "Jabatan Pegawai", "No Induk Pegawai", "Status Pegawai", "Total Jam Lembur Per Bulan"
        };
        System.out.println("*=====>>> MENU MENCARI PEGAWAI <<<=====*");
        int i = 0, j = 0;
        while (i < pilihanCariPegawai.length) {
            System.out.printf("%d. %s\n", ++j, pilihanCariPegawai[i]);
            i++;
        }
        System.out.println("9. Kembali Ke MENU UTAMA");
    }

    static void pilihanMenuCariPegawai() {
        System.out.print("==> Masukkan Pilihan 1/2/3 dst!\n" + "--> ");
        int cari = sc.nextInt();
        switch (cari) {
            case 1:
                System.out.println("*=====>>> MENCARI PEGAWAI BERDASARKAN NAMA PEGAWAI <<<=====*");
                sc.nextLine();
                cariNama();
                tampil(kodeCari);
                break;
            case 2:
                System.out.println("*=====>>> MENCARI PEGAWAI BERDASARKAN GENDER PEGAWAI <<<=====*");
                cariGender();
                cariNama();
                tampil(kodeCari);
                break;
            case 3:
                System.out.println("*=====>>> MENCARI PEGAWAI BERDASARKAN JABATAN PEGAWAI <<<=====*");
                cariJabatan();
                cariNama();
                tampil(kodeCari);
                break;
            case 4:
                System.out.println("*=====>>> MENCARI PEGAWAI BERDASARKAN NOMOR INDUK PEGAWAI <<<=====*");
                cariNomor();
                tampil(kodeCari);
                break;
            case 5:
                System.out.println("*=====>>> MENCARI PEGAWAI BERDASARKAN STATUS PEGAWAI <<<=====*");
                cariStatus();
                cariNama();
                tampil(kodeCari);
                break;
            case 6:
                System.out.println("*=====>>> MENCARI PEGAWAI BERDASARKAN JUMLAH JAM LEMBUR <<<=====*");
                cariJumlahJamLembur();
                sc.nextLine();
                cariNama();
                tampil(kodeCari);
                break;
            case 9:
                System.out.println();
                menuUtama();
                break;
            default:
                pilihanSalah();
                menuCariPegawai();
                pilihanMenuCariPegawai();
        }
    }

    static void cariNama() {
        System.out.print("==> Masukkan Nama Lengkap Pegawai!\n" + "--> ");
        String nama = sc.nextLine();
        int y = 0;
        for (int i = 0; i < dataNamaDanGenderAkhir.length; i++) {
            if (dataNamaDanGenderAkhir[i][0].equalsIgnoreCase(nama)) {
                y = 1;
                kodeCari = i;
            }
        }
        nama = nama.toUpperCase();
        switch (y) {
            case 1:
                System.out.println("----------------------------------------");
                System.out.printf("NAMA PEGAWAI \"%s\" DITEMUKAN\n", nama);
                System.out.println("----------------------------------------");
                break;
            default:
                System.out.println("----------------------------------------");
                System.out.printf("NAMA PEGWAI \"%s\" TIDAK DITEMUKAN\n", nama);
                System.out.println("----------------------------------------");
                pilihanCariNama();
        }
    }

    static void pilihanCariNama() {
        pilihanLanjut();
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'N':
            case 'n':
                System.out.println();
                menuUtama();
                break;
            case 'Y':
            case 'y':
                System.out.println("*=====>>> LANJUT MENCARI PEGAWAI <<<=====*");
                sc.nextLine();
                cariNama();
                break;
            default:
                pilihanSalah();
                pilihanCariNama();
        }
    }

    static void cariGender() {
        System.out.print("==> Masukkan Gender Pegawai L/P!\n" + "--> ");
        sc.nextLine();
        String gender = sc.nextLine();
        gender = gender.toUpperCase();
        boolean pil = gender.equals("L") || gender.equals("P");
        if (!pil) {
            System.out.println("----------------------------------------");
            System.out.printf("GENDER \"%s\" TIDAK DITEMUKAN\n", gender);
            System.out.println("----------------------------------------");
            pilihanCariGender();
        } else {
            System.out.println("----------------------------------------");
            System.out.printf("GENDER \"%s\" DITEMUKAN\n", gender);
            System.out.println("----------------------------------------");
        }
        int y = 0;
        for (String[] dataNamaDanGenderAkhir1 : dataNamaDanGenderAkhir) {
            if (dataNamaDanGenderAkhir1[1].equals(gender)) {
                System.out.printf("%d. %s\n", ++y, dataNamaDanGenderAkhir1[0]);
            }
        }
    }

    static void pilihanCariGender() {
        pilihanLanjut();
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'N':
            case 'n':
                System.out.println();
                menuUtama();
                break;
            case 'Y':
            case 'y':
                System.out.println("*=====>>> LANJUT MENCARI PEGAWAI<<<=====*");
                cariGender();
                break;
            default:
                pilihanSalah();
                pilihanCariGender();
        }
    }

    static void cariJabatan() {
        System.out.print("==> Masukkan Jabatan Pegawai A/B/C!\n" + "--> ");
        sc.nextLine();
        String jabatan = sc.nextLine();
        jabatan = jabatan.toUpperCase();
        boolean pil = jabatan.equals("A") || jabatan.equals("B") || jabatan.equals("C");
        if (!pil) {
            System.out.println("----------------------------------------");
            System.out.printf("JABATAN \"%s\" TIDAK DITEMUKAN\n", jabatan);
            System.out.println("----------------------------------------");
            pilihanCariJabatan();
        } else {
            System.out.println("----------------------------------------");
            System.out.printf("JABATAN \"%s\" DITEMUKAN\n", jabatan);
            System.out.println("----------------------------------------");
        }
        int y = 0;
        for (int i = 0; i < dataJabatanPegawaiAkhir.length; i++) {
            if (dataJabatanPegawaiAkhir[i].equals(jabatan)) {
                System.out.printf("%d. %s\n", ++y, dataNamaDanGenderAkhir[i][0]);
            }
        }
    }

    static void pilihanCariJabatan() {
        pilihanLanjut();
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'N':
            case 'n':
                System.out.println();
                menuUtama();
                break;
            case 'Y':
            case 'y':
                System.out.println("*=====>>> LANJUT MENCARI PEGAWAI<<<=====*");
                cariJabatan();
                break;
            default:
                pilihanSalah();
                pilihanCariJabatan();
        }
    }

    static void cariStatus() {
        System.out.print("==> Masukkan Status Pegawai PT/PTT!\n" + "--> ");
        sc.nextLine();
        String status = sc.nextLine();
        status = status.toUpperCase();
        boolean pil = status.equals("PT") || status.equals("PTT");
        if (pil) {
            System.out.println("----------------------------------------");
            System.out.printf("STATUS \"%s\" DITEMUKAN\n", status);
            System.out.println("----------------------------------------");
        } else {
            System.out.println("----------------------------------------");
            System.out.printf("STATUS \"%s\" TIDAK DITEMUKAN\n", status);
            System.out.println("----------------------------------------");
            pilihanCariStatus();
        }
        int y = 0;
        for (int i = 0; i < dataStatusPegawaiAkhir.length; i++) {
            if (dataStatusPegawaiAkhir[i].equals(status)) {
                System.out.printf("%d. %s\n", ++y, dataNamaDanGenderAkhir[i][0]);
            }
        }
    }

    static void pilihanCariStatus() {
        pilihanLanjut();
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'N':
            case 'n':
                System.out.println();
                menuUtama();
                break;
            case 'Y':
            case 'y':
                System.out.println("*=====>>> LANJUT MENCARI PEGAWAI<<<=====*");
                cariStatus();
                break;
            default:
                pilihanSalah();
                pilihanCariStatus();
        }
    }

    static void cariNomor() {
        System.out.print("==> Masukkan No Pegawai!\n" + "--> ");
        int nomor = sc.nextInt();
        int y = 0;
        for (int i = 0; i < dataNoIndukKaryawanAkhir.length; i++) {
            if (dataNoIndukKaryawanAkhir[i] == nomor) {
                kodeCari = i;
                y = 1;
            }
        }
        switch (y) {
            case 1:
                System.out.println("----------------------------------------");
                System.out.printf("NO PEGAWAI \"%d\" DITEMUKAN\n", nomor);
                System.out.println("----------------------------------------");
                System.out.print("--> ");
                break;
            default:
                System.out.println("----------------------------------------");
                System.out.printf("NO PEGAWAI \"%d\" TIDAK DITEMUKAN\n", nomor);
                System.out.println("----------------------------------------");
                pilihanCariNomor();
        }
        System.out.println(dataNamaDanGenderAkhir[kodeCari][0]);
    }

    static void pilihanCariNomor() {
        pilihanLanjut();
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'N':
            case 'n':
                System.out.println();
                menuUtama();
                break;
            case 'Y':
            case 'y':
                System.out.println("*=====>>> LANJUT MENCARI PEGAWAI<<<=====*");
                cariNomor();
                break;
            default:
                pilihanSalah();
                pilihanCariNomor();
        }
    }

    static void cariJumlahJamLembur() {
        System.out.print("==> Masukkan Jumlah Jam Lembur!\n" + "--> ");
        int lembur = sc.nextInt();
        int y = 0, z = 0;
        for (int i = 0; i < dataTotalLemburAkhir.length; i++) {
            if (dataTotalLemburAkhir[i] == lembur) {
                z = 1;
            }
        }
        switch (z) {
            case 1:
                System.out.println("----------------------------------------");
                System.out.printf("JUMLAH JAM LEMBUR \"%d\" DITEMUKAN\n", lembur);
                System.out.println("----------------------------------------");
                break;
            default:
                System.out.println("----------------------------------------");
                System.out.printf("JUMLAH JAM LEMBUR \"%d\" TIDAK DITEMUKAN\n", lembur);
                System.out.println("----------------------------------------");
                pilihanCariJumlahJamLembur();
        }
        for (int i = 0; i < dataTotalLemburAkhir.length; i++) {
            if (dataTotalLemburAkhir[i] == lembur) {
                System.out.printf("%d. %s\n", ++y, dataNamaDanGenderAkhir[i][0]);
            }
        }
    }

    static void pilihanCariJumlahJamLembur() {
        pilihanLanjut();
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'N':
            case 'n':
                menuUtama();
                break;
            case 'Y':
            case 'y':
                System.out.println("*=====>>> LANJUT MENCARI PEGAWAI<<<=====*");
                cariJumlahJamLembur();
                break;
            default:
                pilihanSalah();
                pilihanCariJumlahJamLembur();
        }
    }

    static void pilihanLanjut() {
        System.out.println("~ Tekan (Y) Untuk Melanjutkan Mencari");
        System.out.println("~ Tekan (N) Untuk Kembali Ke MENU UTAMA");
        System.out.print("==> Masukkan Pilihan!\n" + "--> ");
    }

    static void pilihanSalah() {
        System.out.println("\n----------------------------------------");
        System.out.println("PILIHAN YANG ANDA MASUKKAN TIDAK TERSEDIA");
        System.out.println("----------------------------------------\n");
    }

    static void pilihanCariPegawai() {
        System.out.println("~ Tekan (Y) Untuk Mencari Pegawai Dengan Kriteria Lain");
        System.out.println("~ Tekan (X) untuk Kembali Ke MENU UTAMA");
        System.out.print("==> Masukkan Pilihan!\n" + "--> ");
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'Y':
            case 'y':
                System.out.println();
                menuCariPegawai();
                pilihanMenuCariPegawai();
                pilihanCariPegawai();
                break;
            case 'X':
            case 'x':
                System.out.println();
                menuUtama();
                break;
            default:
                pilihanSalah();
                pilihanCariPegawai();
        }
    }

    static void tampil(int a) {
        System.out.println("*=====>>> DATA LENGKAP PEGAWAI <<<=====*");
        System.out.printf("NAMA\t\t\t: %s\n", dataNamaDanGenderAkhir[a][0]);
        System.out.printf("GENDER\t\t\t: %s\n", dataNamaDanGenderAkhir[a][1]);
        System.out.printf("NO INDUK KARYAWAN\t: %d\n", dataNoIndukKaryawanAkhir[a]);
        System.out.printf("JABATAN PEGAWAI\t\t: %s\n", dataJabatanPegawaiAkhir[a]);
        System.out.printf("STATUS PEGAWAI\t\t: %s\n", dataStatusPegawaiAkhir[a]);
        System.out.printf("TOTAL JAM LEMBUR/BULAN\t: %d jam\n", dataTotalLemburAkhir[a]);
    }

    static void menuPelaporan() {
        String[] pilihanMenuPelaporan = {
            "Menu Tambah Data Pegawai", "Menu Hapus Data Pegawai",
            "Menu Edit Data Pegawai", "Menu Ubah Ketentuan Gaji Pokok",
            "Menu Ubah Ketentan Tunjangan Jabatan", "Menu Ubah Ketentan Tunjangan Harian",
            "Menu Ubah Ketentuan Lembur", "Menu Ubah Ketentuan Biaya Asuransi"
        };
        System.out.println("*=====>>> MENU PELAPORAN <<<=====*");
        int i = 0, j = 0;
        do {
            System.out.printf("%d. %s\n", ++j, pilihanMenuPelaporan[i]);
            i++;
        } while (i < pilihanMenuPelaporan.length);
        System.out.println("9. Kembali Ke MENU UTAMA");
        System.out.print("==> Masukkan Pilihan 1/2 dst!\n" + "--> ");
        int pelaporan = sc.nextInt();
        switch (pelaporan) {
            case 1:
                System.out.println("*=====>>> MENAMBAH DATA PEGAWAI <<<=====*");
                System.out.print("==> Apakah Anda Yakin Untuk Menambahkan Karyawan (Y/n)?\n" + "--> ");
                char pilihan = sc.next().charAt(0);
                switch (pilihan) {
                    case 'Y':
                    case 'y':
                        nambahPegawai();
                        break;
                    case 'N':
                    case 'n':
                        menuPelaporan();
                        break;
                    default:
                        pilihanSalah();
                        menuPelaporan();
                }
                break;
            case 2:
                System.out.println("*=====>>> MENGHAPUS DATA PEGAWAI <<<=====*");
                System.out.print("==> Apakah Anda Yakin Untuk Menghapus Data Karyawan (Y/n)?\n" + "--> ");
                pilihan = sc.next().charAt(0);
                switch (pilihan) {
                    case 'Y':
                    case 'y':
                        hapusPegawai();
                        break;
                    case 'N':
                    case 'n':
                        menuPelaporan();
                        break;
                    default:
                        pilihanSalah();
                        // untuk merun kembali menu awal ketika menu yang dimasukkan salah
                        menuPelaporan();
                }
                break;
            case 3:
                System.out.println("*=====>>> MENGEDIT DATA PEGAWAI <<<=====*");
                System.out.print("==> Apakah Anda Yakin Untuk Mengedit Data Karyawan (Y/n)?\n" + "--> ");
                pilihan = sc.next().charAt(0);
                switch (pilihan) {
                    case 'Y':
                    case 'y':
                        menuCariPegawai();
                        pilihanMenuCariPegawai();
                        editPegawai();
                        break;
                    case 'N':
                    case 'n':
                        menuPelaporan();
                        break;
                    default:
                        pilihanSalah();
                        menuPelaporan();
                }
                break;
            case 4:
                System.out.println("*=====>>> MEUBAH KETENTUAN GAJI POKOK <<<=====*");
                sc.nextLine();
                System.out.printf("~ Gaji Pokok Jabatan A : Rp%d\n", dataGajiPokokDanTunjanganJabatan[0][0]);
                System.out.printf("~ Gaji Pokok Jabatan B : Rp%d\n", dataGajiPokokDanTunjanganJabatan[1][0]);
                System.out.printf("~ Gaji Pokok Jabatan C : Rp%d\n", dataGajiPokokDanTunjanganJabatan[2][0]);
                pilihanUbahGajiPokok();
                System.out.println("----------------------------------------");
                System.out.println("KETENTUAN GAJI POKOK BERHASIL DIUBAH");
                System.out.println("----------------------------------------");
                menuPelaporan();
                break;
            case 5:
                System.out.println("*=====>>> MEUBAH KETENTUAN TUNJANGAN JABATAN <<<=====*");
                sc.nextLine();
                System.out.printf("~ Tunjangan Jabatan A : Rp%d\n", dataGajiPokokDanTunjanganJabatan[0][1]);
                System.out.printf("~ Tunjangan Jabatan B : Rp%d\n", dataGajiPokokDanTunjanganJabatan[1][1]);
                System.out.printf("~ Tunjangan Jabatan C : Rp%d\n", dataGajiPokokDanTunjanganJabatan[2][1]);
                pilihanUbahTunjanganJabatan();
                System.out.println("----------------------------------------");
                System.out.println("KETENTUAN TUNJANGAN JABATAN BERHASIL DIUBAH");
                System.out.println("----------------------------------------");
                menuPelaporan();
                break;
            case 6:
                System.out.println("*=====>>> MEUBAH KETENTUAN TUNJANGAN HARIAN <<<=====*");
                sc.nextLine();
                System.out.printf("~ Tunjangan Harian PT  : Rp%d\n", gajiTunjanganHarian[0]);
                System.out.printf("~ Tunjangan Harian PTT : Rp%d\n", gajiTunjanganHarian[1]);
                pilihanUbahTunjanganHarian();
                System.out.println("----------------------------------------");
                System.out.println("KETENTUAN TUNJANGAN HARIAN BERHASIL DIUBAH");
                System.out.println("----------------------------------------");
                menuPelaporan();
                break;
            case 7:
                System.out.println("*=====>>> MEUBAH KETENTUAN GAJI LEMBUR <<<=====*");
                System.out.printf("Gaji Lembur Pegawai: Rp%d\n", gajiLembur);
                System.out.print("==> Masukkan Ketentuan Baru Gaji Lembur Perjam Dalam Sebulan!\n--> Rp");
                int lembur = sc.nextInt();
                gajiLembur = lembur;
                System.out.printf("Ketentuan Gaji Lembur Perjam Dalam Sebulan Diubah Menjadi %d", lembur);
                System.out.println("----------------------------------------");
                System.out.println("KETENTUAN GAJI LEMBUR BERHASIL DIUBAH");
                System.out.println("----------------------------------------");
                menuPelaporan();
                break;
            case 8:
                System.out.println("*=====>>> MEUBAH KETENTUAN BIAYA ASURANSI <<<=====*");
                System.out.printf("Biaya Asuransi Pegawai: Rp%d\n", biayaAsuransi);
                System.out.print("==> Masukkan Ketentuan Baru Biaya Asuransi Pegawai Dalam Sebulan!\n--> Rp");
                int asuransi = sc.nextInt();
                biayaAsuransi = asuransi;
                System.out.printf("Ketentuan Biaya Asuransi Pegawai Dalam Sebulan Diubah Menjadi %d", asuransi);
                System.out.println("----------------------------------------");
                System.out.println("KETENTUAN BIAYA ASURANSI BERHASIL DIUBAH");
                System.out.println("----------------------------------------");
                menuPelaporan();
                break;
            case 9:
                System.out.println();
                menuUtama();
                break;
            default:
                pilihanSalah();
                menuPelaporan();
        }
    }

    static void pilihanUbahGajiPokok() {
        System.out.println("Pilih Jabatan Yang Ingin Diubah Gaji Pokoknya!");
        System.out.print("==> Masukkan Jabatan Pegawai(A/B/C)!\n--> ");
        String jabatan = sc.nextLine();
        jabatan = jabatan.toUpperCase();
        int gajiPokok = 0;
        switch (jabatan) {
            case "A":
                System.out.print("==> Masukkan Ketentuan Baru Gaji Pokok Perbulan!\n--> Rp");
                gajiPokok = sc.nextInt();
                dataGajiPokokDanTunjanganJabatan[0][0] = gajiPokok;
                break;
            case "B":
                System.out.print("==> Masukkan Ketentuan Baru Gaji Pokok Perbulan!\n--> Rp");
                gajiPokok = sc.nextInt();
                dataGajiPokokDanTunjanganJabatan[1][0] = gajiPokok;
                break;
            case "C":
                System.out.print("==> Masukkan Ketentuan Baru Gaji Pokok Perbulan!\n--> Rp");
                gajiPokok = sc.nextInt();
                dataGajiPokokDanTunjanganJabatan[2][0] = gajiPokok;
                break;
            default:
                pilihanSalah();
                pilihanUbahGajiPokok();
        }
        System.out.printf("Ketentuan Gaji Pokok Perbulan Jabatan %s Diubah Menjadi %d\n", jabatan, gajiPokok);
    }

    static void pilihanUbahTunjanganJabatan() {
        System.out.println("Pilih Jabatan Yang Ingin Diubah Tunjangannya!");
        System.out.print("==> Masukkan Jabatan Pegawai(A/B/C)!\n--> ");
        String jabatan = sc.nextLine();
        jabatan = jabatan.toUpperCase();
        int tunjangan = 0;
        switch (jabatan) {
            case "A":
                System.out.print("==> Masukkan Ketentuan Baru Tunjangan Jabatan Perbulan!\n--> Rp");
                tunjangan = sc.nextInt();
                dataGajiPokokDanTunjanganJabatan[0][1] = tunjangan;
                break;
            case "B":
                System.out.print("==> Masukkan Ketentuan Baru Tunjangan Jabatan Perbulan!\n--> Rp");
                tunjangan = sc.nextInt();
                dataGajiPokokDanTunjanganJabatan[1][1] = tunjangan;
                break;
            case "C":
                System.out.print("==> Masukkan Ketentuan Baru Tunjangan Jabatan Perbulan!\n--> Rp");
                tunjangan = sc.nextInt();
                dataGajiPokokDanTunjanganJabatan[2][1] = tunjangan;
                break;
            default:
                pilihanSalah();
                pilihanUbahTunjanganJabatan();
        }
        System.out.printf("Ketentuan Tunjangan Perbulan Jabatan %s Diubah Menjadi %d\n", jabatan, tunjangan);
    }

    static void pilihanUbahTunjanganHarian() {
        System.out.println("Pilih Status Pegawai Yang Ingin Diubah Tunjangannya!");
        System.out.print("==> Masukkan Status Pegawai(PT/PTT)!\n--> ");
        String status = sc.nextLine();
        status = status.toUpperCase();
        int tunjangan = 0;
        switch (status) {
            case "PT":
                System.out.print("==> Masukkan Ketentuan Baru Tunjangan Harian Perbulan!\n--> Rp");
                tunjangan = sc.nextInt();
                gajiTunjanganHarian[0] = tunjangan;
                break;
            case "PTT":
                System.out.print("==> Masukkan Ketentuan Baru Tunjangan Harian Perbulan!\n--> Rp");
                tunjangan = sc.nextInt();
                gajiTunjanganHarian[1] = tunjangan;
                break;
            default:
                pilihanSalah();
                pilihanUbahTunjanganHarian();
        }
        System.out.printf("Ketentuan Tunjangan Perbulan Status %s Diubah Menjadi %d\n", status, tunjangan);
    }

    static void nambahPegawai() {
        // NAMA DAN GENDER
        dataNamaDanGenderAkhir = new String[dataNamaDanGenderAwal.length + 1][2];
        inputDataNama(dataNamaDanGenderAwal, dataNamaDanGenderAkhir);
        sc.nextLine();
        System.out.print("==> Masukkan Nama Lengkap Karyawan!\n" + "--> ");
        String input = sc.nextLine();
        input = input.toUpperCase();
        dataNamaDanGenderAkhir[dataNamaDanGenderAwal.length][0] = input;
        inputDataGender(dataNamaDanGenderAwal, dataNamaDanGenderAkhir);
        System.out.print("==> Masukkan Gender Karyawan (L/P)!\n" + "--> ");
        input = sc.nextLine();
        input = input.toUpperCase();
        dataNamaDanGenderAkhir[dataNamaDanGenderAwal.length][1] = input;
        dataNamaDanGenderAwal = new String[dataNamaDanGenderAkhir.length][2];
        inputDataNama(dataNamaDanGenderAkhir, dataNamaDanGenderAwal);
        inputDataGender(dataNamaDanGenderAkhir, dataNamaDanGenderAwal);

        // JABATAN
        dataJabatanPegawaiAkhir = new String[dataJabatanPegawaiAwal.length + 1];
        inputHuruf(dataJabatanPegawaiAwal, dataJabatanPegawaiAkhir);
        System.out.print("==> Masukkan Jabatan Karyawan (A/B/C)!\n" + "--> ");
        input = sc.nextLine();
        input = input.toUpperCase();
        dataJabatanPegawaiAkhir[dataJabatanPegawaiAwal.length] = input;
        dataJabatanPegawaiAwal = new String[dataJabatanPegawaiAkhir.length];
        inputHuruf(dataJabatanPegawaiAkhir, dataJabatanPegawaiAwal);

        // NO INDUK
        dataNoIndukKaryawanAkhir = new int[dataNoIndukKaryawanAwal.length + 1];
        inputAngka(dataNoIndukKaryawanAwal, dataNoIndukKaryawanAkhir);
        dataNoIndukKaryawanAkhir[dataNoIndukKaryawanAwal.length] = cekNoInduk();
        dataNoIndukKaryawanAwal = new int[dataNoIndukKaryawanAkhir.length];
        inputAngka(dataNoIndukKaryawanAkhir, dataNoIndukKaryawanAwal);

        // STATUS PEGAWAI
        dataStatusPegawaiAkhir = new String[dataStatusPegawaiAwal.length + 1];
        inputHuruf(dataStatusPegawaiAwal, dataStatusPegawaiAkhir);
        sc.nextLine();
        System.out.print("==> Masukkan Status Karyawan (PT/PTT)!\n" + "--> ");
        input = sc.nextLine();
        input = input.toUpperCase();
        dataStatusPegawaiAkhir[dataStatusPegawaiAwal.length] = input;
        dataStatusPegawaiAwal = new String[dataStatusPegawaiAkhir.length];
        inputHuruf(dataStatusPegawaiAkhir, dataStatusPegawaiAwal);

        // JUMLAH JAM LEMBUR
        dataTotalLemburAkhir = new int[dataTotalLemburAwal.length + 1];
        inputAngka(dataTotalLemburAwal, dataTotalLemburAkhir);
        System.out.print("==> Masukkan Total Jam Lembur Karyawan!\n" + "--> ");
        dataTotalLemburAkhir[dataTotalLemburAwal.length] = sc.nextInt();
        dataTotalLemburAwal = new int[dataTotalLemburAkhir.length];
        inputAngka(dataTotalLemburAkhir, dataTotalLemburAwal);

        System.out.println("----------------------------------------");
        System.out.println("DATA KARYAWAN BERHASIL DI TAMBAHKAN");
        System.out.println("----------------------------------------");
        tampil(dataJabatanPegawaiAkhir.length - 1);
        menuPelaporan();
    }

    static void hapusPegawai() {
        menuCariPegawai();
        pilihanMenuCariPegawai();
        // NAMA
        dataNamaDanGenderAwal[kodeCari][0] = "x";

        // GENDER
        dataNamaDanGenderAwal[kodeCari][1] = "x";
        dataNamaDanGenderAkhir = new String[dataNamaDanGenderAwal.length - 1][2];
        inputDataNama(dataNamaDanGenderAwal, dataNamaDanGenderAkhir);
        inputDataGender(dataNamaDanGenderAwal, dataNamaDanGenderAkhir);
        dataNamaDanGenderAwal = new String[dataNamaDanGenderAkhir.length][2];
        inputDataNama(dataNamaDanGenderAkhir, dataNamaDanGenderAwal);
        inputDataGender(dataNamaDanGenderAkhir, dataNamaDanGenderAwal);

        //JABATAN
        dataJabatanPegawaiAwal[kodeCari] = "x";
        dataJabatanPegawaiAkhir = new String[dataJabatanPegawaiAwal.length - 1];
        inputHuruf(dataJabatanPegawaiAwal, dataJabatanPegawaiAkhir);
        dataJabatanPegawaiAwal = new String[dataJabatanPegawaiAkhir.length];
        inputHuruf(dataJabatanPegawaiAkhir, dataJabatanPegawaiAwal);

        //NO INDUK
        dataNoIndukKaryawanAwal[kodeCari] = -1;
        dataNoIndukKaryawanAkhir = new int[dataNoIndukKaryawanAwal.length - 1];
        inputAngka(dataNoIndukKaryawanAwal, dataNoIndukKaryawanAkhir);
        dataNoIndukKaryawanAwal = new int[dataNoIndukKaryawanAkhir.length];
        inputAngka(dataNoIndukKaryawanAkhir, dataNoIndukKaryawanAwal);

        //STATUS PEGAWAI
        dataStatusPegawaiAwal[kodeCari] = "x";
        dataStatusPegawaiAkhir = new String[dataStatusPegawaiAwal.length - 1];
        inputHuruf(dataStatusPegawaiAwal, dataStatusPegawaiAkhir);
        dataStatusPegawaiAwal = new String[dataStatusPegawaiAkhir.length];
        inputHuruf(dataStatusPegawaiAkhir, dataStatusPegawaiAwal);

        //TOTAL LEMBUR
        dataTotalLemburAwal[kodeCari] = -1;
        dataTotalLemburAkhir = new int[dataTotalLemburAwal.length - 1];
        inputAngka(dataTotalLemburAwal, dataTotalLemburAkhir);
        dataTotalLemburAwal = new int[dataTotalLemburAkhir.length];
        inputAngka(dataTotalLemburAkhir, dataTotalLemburAwal);

        System.out.println("----------------------------------------");
        System.out.println("DATA KARYAWAN BERHASIL DI HAPUS");
        System.out.println("----------------------------------------");
        menuPelaporan();
    }

    static void editPegawai() {
        String[] pilihanEditPegawai = {"Nama Pegawai", "Gender Pegawai", "Jabatan Pegawai", "No Induk Pegawai", "Status Pegawai", "Total Jam Lembur Per Bulan"};
        System.out.println("=====>>> PILIHAN DATA YANG AKAN DI EDIT <<<=====");
        int i = 0, j = 0;
        do {
            System.out.printf("%d. %s\n", ++j, pilihanEditPegawai[i]);
            i++;
        } while (i < pilihanEditPegawai.length);
        System.out.println("9. Kembali Ke MENU UTAMA");
        System.out.print("==> Masukkan Pilihan 1/2/3 dst!\n" + "--> ");
        String input;
        int ubah = sc.nextInt();
        sc.nextLine();
        switch (ubah) {
            case 1:
                // NAMA
                System.out.print("==> Masukkan Nama Lengkap Karyawan!\n" + "--> ");
                input = sc.nextLine();
                input = input.toUpperCase();
                dataNamaDanGenderAkhir[kodeCari][0] = input;
                inputDataNama(dataNamaDanGenderAkhir, dataNamaDanGenderAwal);
                break;
            case 2:
                // GENDER
                System.out.print("==> Masukkan Gender Karyawan (L/P)!\n" + "--> ");
                input = sc.nextLine();
                input = input.toUpperCase();
                dataNamaDanGenderAkhir[kodeCari][1] = input;
                inputDataGender(dataNamaDanGenderAkhir, dataNamaDanGenderAwal);
                break;
            case 3:
                // JABATAN
                System.out.print("==> Masukkan Jabatan Karyawan (A/B/C)!\n" + "--> ");
                input = sc.nextLine();
                input = input.toUpperCase();
                dataJabatanPegawaiAkhir[kodeCari] = input;
                inputHuruf(dataJabatanPegawaiAkhir, dataJabatanPegawaiAwal);
                break;
            case 4:
                // NO INDUK
                dataNoIndukKaryawanAkhir[kodeCari] = cekNoInduk();
                inputAngka(dataNoIndukKaryawanAkhir, dataNoIndukKaryawanAwal);
                break;
            case 5:
                // STATUS PEGAWAI
                System.out.print("==> Masukkan Status Karyawan (PT/PTT)!\n" + "--> ");
                input = sc.nextLine();
                input = input.toUpperCase();
                dataStatusPegawaiAkhir[kodeCari] = input;
                inputHuruf(dataStatusPegawaiAkhir, dataStatusPegawaiAwal);
                break;
            case 6:
                // JUMLAH JAM LEMBUR
                System.out.print("==> Masukkan Total Jam Lembur Karyawan!\n" + "--> ");
                dataTotalLemburAkhir[kodeCari] = sc.nextInt();
                inputAngka(dataTotalLemburAkhir, dataTotalLemburAwal);
                break;
            case 9:
                System.out.println();
                menuUtama();
                break;
            default:
                pilihanSalah();
                editPegawai();
        }

        System.out.println("----------------------------------------");
        System.out.println("DATA KARYAWAN BERHASIL DI EDIT");
        System.out.println("----------------------------------------");
        System.out.println("Tekan (Y) Untuk Lanjut Mengedit");
        System.out.println("Tekan (N) Untuk Kembali");
        pilihanEditData();
    }

    static void pilihanEditData() {
        System.out.print("==> Masukkan Pilihan!\n" + "--> ");
        char pilihan = sc.next().charAt(0);
        switch (pilihan) {
            case 'Y':
            case 'y':
                editPegawai();
                break;
            case 'N':
            case 'n':
                menuPelaporan();
                break;
            default:
                pilihanSalah();
                pilihanEditData();
        }
    }

    static int cekNoInduk() {
        System.out.print("==> Masukkan No Induk Karyawan!\n" + "--> ");
        int noInduk = sc.nextInt();
        int cek = 0;
        for (int i = 0; i < dataNoIndukKaryawanAkhir.length; i++) {
            if (noInduk == dataNoIndukKaryawanAkhir[i]) {
                cek++;
            }
        }
        if (cek != 0) {
            System.out.println("----------------------------------------");
            System.out.printf("NO INDUK %d SUDAH DIGUNAKAN\n", noInduk);
            System.out.println("----------------------------------------");
            noInduk = cekNoInduk();
        }
        return noInduk;
    }
}
