import java.util.Scanner;

public class Tugas1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[]args){
        int pilihan;

        System.out.print("Selamat Datang di STMIK AKAKOM\nDaftar Jenjang : \n1.SI\n2.D3\nsilakan masukkan pilihan jenjang : ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.print("Daftar Pilihan SI\n1.TI\n2.SI\nmasukkan pilihan : ");
                pilihan = input.nextInt();
                switch (pilihan){
                    case 1:
                        System.out.println("Anda memilih prodi TI biaya SPA = Rp 13.000.000");
                        break;
                    case 2:
                        System.out.println("Anda memilih prodi SI biaya SPA = Rp 12.000.000");
                        break;
                    default:
                        System.out.println("Pilihan anda tidak dapat di proses");
                }
                break;
            case 2:
                System.out.print("Daftar Pilihan D3\n1.TK\n2.KA\n3.MI\nmasukkan pilihan : ");
                pilihan = input.nextInt();
                switch (pilihan){
                    case 1:
                        System.out.println("Anda memilih prodi TK biaya SPA = Rp 10.000.000");
                        break;
                    case 2:
                        System.out.println("Anda memilih prodi KA biaya SPA = Rp 10.000.000");
                        break;
                    case 3:
                        System.out.println("Anda memilih prodi MI biaya SPA = Rp 10.000.000");
                        break;
                    default:
                        System.out.println("Pilihan anda tidak dapat di proses");
                }
                break;
            default:
                System.out.println("Pilihan anda tidak dapat di proses");
        }
    }
}
