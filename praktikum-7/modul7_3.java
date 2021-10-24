import java.util.Scanner;
public class modul7_3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Scanner masuk = new Scanner(System.in);
        String pil,jenis;
        System.out.println("Hitung persegi/lingkaran");
        System.out.println("==========================");
        System.out.print("masukkan pilihan: ");
        pil = in.next();
        switch (pil){
            case "persegi":
                int sisi;
                System.out.print("masukkan sisi : ");
                sisi = masuk.nextInt();
                System.out.print("luas/keliling : ");
                jenis = in.next();
                switch (jenis){
                    case "luas":
                        int luas = sisi * sisi;
                        System.out.println("Luas persegi : "+luas);
                        break;
                    case "keliling":
                        int kel = 4 * sisi;
                        System.out.println("Keliling persegi : "+kel);
                        break;
                    default:
                        System.out.println("salah masukkan jenis");
                }
               break;
            case "lingkaran":
                double jari;
                System.out.print("masukkan jari-jari : ");
                jari = masuk.nextDouble();
                System.out.print("luas/keliling : ");
                jenis = in.next();
                switch (jenis){
                    case "luas":
                        double luas1 = 3.14 * jari * jari;
                        System.out.println("luas lingkaran : "+luas1);
                        break;
                    case "keliling":
                        double kell = 2 * 3.14 * jari;
                        System.out.println("keliling lingkaran : "+kell);
                        break;
                    default:
                        System.out.println("Salah masukkan pilihan");
                }
                break;
            default:
                System.out.println("salah masukkan pilihan");
        }
    }
}
