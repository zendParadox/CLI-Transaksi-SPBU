import java.util.Scanner;

public class spbu {

    Scanner input = new Scanner(System.in);

    int masukan;
    String namaBBM, jawab;
    boolean ket1, ket2, ket3;
    double hargaBBM, keluaranLiter1, keluaranLiter2, keluaranLiter3, masukan1, masukan2, masukan3;
    double diskon1, diskon2, diskon3, hargaAkhir1, hargaAkhir2, hargaAkhir3, totalDiskon, totalHarga, totalSebelumDiskon;

    void tampilan(){
        System.out.println("| ================================================= |");
        System.out.println("| ----------------- Selamat Datang ---------------- |");
        System.out.println("| ----------------------- Di ---------------------- |");
        System.out.println("| ---------------- SPBU Serang Raya --------------- |");
        System.out.println("| ================================================= |");
    }

    void tampilanAwal() {
        do {
            System.out.println("\n-------------------Jenis Bensin----------------------");
            System.out.println("\t| NO. |   Jenis BBM   |     Harga/Liter     |");
            System.out.println("\t| 1.  |   SR - Lite   |    Rp. 8.000,-      |");
            System.out.println("\t| 2.  |   SR - Max    |    Rp. 10.000,-     |");
            System.out.println("\t| 3.  |   Super - SR  |    Rp. 15.000,-     |");

            System.out.print("Silahkan Masukkan Nomor Yang Anda Inginkan: ");
            masukan = input.nextInt();

            switch (masukan) {
                case 1:
                    ket1 = true;
                    System.out.print("Berapa Banyak Bensin Yang Anda Inginkan: ");
                    masukan1 = input.nextInt();
                    if (masukan1 >= 250000){
                        diskon1 = masukan1 * 0.05;
                        System.out.println("Selamat Anda Mendapat Diskon Sebesar 5% = " + diskon1);
                    }
                    hargaAkhir1 = masukan1 - diskon1;
                    keluaranLiter1 = masukan1 / 8000;
                    System.out.println("Keluaran: " + keluaranLiter1 + " liter");
                    break;
                case 2:
                    ket2 = true;
                    namaBBM = "SR - Max";
                    hargaBBM = 10000;
                    System.out.print("Berapa Banyak Bensin Yang Anda Inginkan: ");
                    masukan2 = input.nextInt();
                    if (masukan2 >= 250000){
                        diskon2 = masukan1 * 0.05;
                        System.out.println("Selamat Anda Mendapat Diskon Sebesar 5% = " + diskon1);
                    }
                    hargaAkhir2 = masukan2 - diskon2;
                    keluaranLiter2 = masukan2 / 10000;
                    System.out.println("Keluaran: " + keluaranLiter2 + " liter");
                    break;
                case 3:
                    ket3 = true;
                    namaBBM = "Super - SR";
                    hargaBBM = 15000;
                    System.out.print("Berapa Banyak Bensin Yang Anda Inginkan: ");
                    masukan3 = input.nextInt();
                    if (masukan3 >= 250000){
                        diskon3 = masukan1 * 0.05;
                        System.out.println("Selamat Anda Mendapat Diskon Sebesar 5% = " + diskon1);
                    }
                    hargaAkhir3 = masukan3 - diskon3;
                    keluaranLiter3 = masukan3 / 15000;
                    System.out.println("Keluaran: " + keluaranLiter3 + " liter");
                    break;
            }
            jawab = "t";
            System.out.print("Anda Ingin Kembali Membeli BBM? (y/t): ");
            jawab = input.next();
        } while (jawab.equalsIgnoreCase("y"));
    }

    void invoice(){
        System.out.println("\n\nDaftar produk yang dibeli: ");
        System.out.println(" |     Jenis Bensin    |     Harga     |  Liter Yang Dikeluarkan  |  Total Harga  |");
        if (ket1) {
            System.out.println(" |     SR - Lite       | Rp.  8.000,-  |          " + keluaranLiter1 + "           |   " + masukan1 + "    |");
        }if (ket2) {
            System.out.println(" |     SR - Max        | Rp.  10.000,- |          " + keluaranLiter2 + "            |   " + masukan2 + "    |");
        }if (ket3) {
            System.out.println(" |     Super - SR      | Rp.  15.000,- |          " + keluaranLiter3 + "            |   " + masukan3 + "    |");
        }

        totalDiskon = diskon1 + diskon2 + diskon3;
        System.out.println("\nAnda Mendapat Diskon Dengan Total: " + totalDiskon);
        totalSebelumDiskon = masukan1 + masukan2 + masukan3;
        System.out.println("Total Keseluruhan Harga (Sebelum Diskon): " + totalSebelumDiskon);
        totalHarga = hargaAkhir1 + hargaAkhir2 + hargaAkhir3;
        System.out.println("Total Keseluruhan Harga (Sesudah Diskon): " + totalHarga);

    }
}