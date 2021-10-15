/* program menghitung luas bangun
    matkul : Praktikum Agoritma
    dev    : Rahman Pambekti 
 */
import java.util.Scanner;
class Bangun { 
    public static void main(String[]args){
        int pilihan;

        System.out.println("-- Program Menghitung Luas --");
        System.out.println("1.Luas Persegi Panjang");
        System.out.println("2.Luas Lingkaran");
        System.out.print("Masukkan pilihan = ");
        pilihan = input.nextInt();

        // validasi input user
        switch(pilihan){
            case 1:
                // panggil function persegi panjang
                persegiPanjang();
                break;
            case 2:
                // panggil function lingkaran
                lingkaran();
                break;
            default:
                // tampilkan jika input user salah/tidak masuk kategori
                System.out.println("Maaf,tidak dapat memproses permintaan anda");
        }
    }

    // function untuk menghitung luas persegi panjang
    public static void persegiPanjang(){
        double p,l,luas;

        System.out.print("masukkan panjang = ");
        p = input.nextDouble();
        System.out.print("masukkan lebar = ");
        l = input.nextDouble();
        // rumus luas persegi
        luas = p * l;
        System.out.println("luas persegi panjang = "+luas);
    }

    // function untuk menghitung luas lingkaran
    public static void lingkaran(){
        double phi,r,luas;
        phi = 3.14;

        System.out.print("Masukkan jari-jari : ");
        r = input.nextDouble();
        // rumus luas lingkaran
        luas = phi * r * r;

        System.out.println("luas lingkaran = "+luas);
    }

    public static Scanner input = new Scanner(System.in);
}