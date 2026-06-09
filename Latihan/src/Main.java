import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        KeretaRepository repository =
                new KeretaRepositoryImpl();

        Validator validator =
                new NikValidator();

        ReservasiService reservasi =
                new ReservasiService(
                        repository,
                        validator);

        int pilihan = 0;

        try {

            do {

                System.out.println("\n==========================");
                System.out.println("      JAVA EXPRESS");
                System.out.println("==========================");
                System.out.println("1. Lihat Jadwal");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu : ");

                try {

                    pilihan = input.nextInt();
                    input.nextLine();

                    switch (pilihan) {

                        case 1:

                            System.out.println(
                                    "\n=== JADWAL KERETA ===");

                            for (Kereta k :
                                    repository.getSemuaKereta()) {

                                System.out.println(k);
                            }

                            break;

                        case 2:

                            System.out.print(
                                    "Kode Kereta : ");

                            String kode =
                                    input.nextLine();

                            Kereta kereta =
                                    repository.cariKereta(kode);

                            if (kereta.getSisaKursi() == 0) {

                                System.out.println(
                                        "Maaf, tiket "
                                                + kereta.getNama()
                                                + " sudah habis.");

                                break;
                            }

                            System.out.print("NIK : ");
                            String nik =
                                    input.nextLine();

                            System.out.print(
                                    "Nama Penumpang : ");

                            String nama =
                                    input.nextLine();

                            System.out.print(
                                    "Jumlah Tiket : ");

                            int jumlah =
                                    input.nextInt();

                            input.nextLine();

                            Penumpang penumpang =
                                    new Penumpang(
                                            nik,
                                            nama);

                            reservasi.pesanTiket(
                                    kode,
                                    penumpang,
                                    jumlah);

                            break;

                        case 3:

                            System.out.println(
                                    "Terima kasih telah menggunakan JAVA EXPRESS");

                            break;

                        default:

                            System.out.println(
                                    "Menu tidak tersedia.");
                    }
                }

                catch (InputMismatchException e) {

                    System.out.println(
                            "Input harus berupa angka!");

                    input.nextLine();
                }

                catch (DataPenumpangTidakValidException e) {

                    System.out.println(
                            "Error Data Penumpang: "
                                    + e.getMessage());
                }

                catch (RuteTidakDitemukanException e) {

                    System.out.println(
                            "Error Rute: "
                                    + e.getMessage());
                }

                catch (TiketHabisException e) {

                    System.out.println(
                            "Error Tiket: "
                                    + e.getMessage());
                }

            } while (pilihan != 3);
        }

        finally {

            System.out.println(
                    "\nProgram ditutup. Sampai jumpa!");

            input.close();
        }
    }
}