import java.util.Random;
import java.util.Scanner;

public class TebakAngkaRandom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // inisialisasi scanner untuk menerima input dari pengguna
        Random random = new Random(); // inisialisasi random untuk membuat angka acak
        int angkaTebakan = random.nextInt(100)+1; // membuat variabel untuk menebak angka 1-100
        int tebak; // membuat variabel untuk menyimpan tebakan pengguna
        int jumlahTebakan = 0; // membuat variabel untuk menyimpan jumlah tebakan
        int waktu = 60000; // membuat variabel untuk menyimpan waktu maksimal
        Long mulai = System.currentTimeMillis(); // membuat variabel untuk menyimpan mulainya waktu permainan
        Long batasWaktu = mulai + waktu; // membuat variabel untuk menyimpan waktu akhir permainan

        // Menampilkan pesan selamat datang dan instruksi permainan kepada pengguna
        System.out.println("Selamat datang di permainan tebak angka!");
        System.out.println("Angka telah dipilih secara acak antara 1 hingga 100.");
        System.out.println("Anda memiliki 1 menit untuk menebak angka tersebut.");
        System.out.println("Mulai tebak angka:");
        // Memulai loop permainan hingga pengguna menebak angka dengan benar atau waktu habis
        do {
            System.out.println("");
            System.out.print("Tebak angka (1-100) : ");
            tebak = scanner.nextInt(); // memberikan akses input kepada pengguna
            jumlahTebakan++; // menghitung jumlah tebakan bila loop terus berjalan

            // memeriksa apakah waktu telah habis, jika ya maka permainan akan berhenti dan menampilkan pesan
            if (System.currentTimeMillis() > batasWaktu) {
                System.out.println("Maaf, anda sudah melebihi tenggat waktu. Tebakan yang benar adalah " + angkaTebakan);
                break;
            } else if (tebak > angkaTebakan) { // memeriksa jika tebakan terlalu tinggi akan menampilkan pesan kesalahan
                System.out.println("Maaf, tebakan Anda terlalu tinggi");
            } else if (tebak < angkaTebakan) { // memeriksa jika tebakan terlalu rendah akan menampilkan pesan kesalahan
                System.out.println("Maaf, tebakan Anda terlalu rendah.");
            } else { // bila tebakan benar akan memunculkan pesan berhasil
                System.out.println("Selamat, tebakan Anda benar!");
                System.out.println("Anda berhasil menebak angka " + angkaTebakan + " dalam " + jumlahTebakan + " kali percobaan.");
                break;
            }
        } while (true);

        // menampilkan pesan terima kasih setelah permainan selesai
        System.out.println("");
        System.out.println("Terima kasih telah bermain. Sampai jumpa!");
    }
}