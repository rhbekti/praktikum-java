import java.util.Scanner;
class KondisiBulan { 
    public static void main(String[]args){
        Scanner masuk = new Scanner(System.in);
        int kode_bulan;
        // deklarasi untuk menyimpan kondisi pembanding
        String [] kondisi_1 = {"1","3","5","7","8","10","12"};
        String [] kondisi_2 = {"4","6","9","11"};

        System.out.print("Masukkan kode bulan = ");
        kode_bulan = masuk.nextInt();
        // validasi bulan 1,3,5,7,8,10,12
        for(int i = 0;i < kondisi_1.length;i++){
            if(kode_bulan == Integer.parseInt(kondisi_1[i])){
                System.out.println("Jumlah hari = 31 hari");
                System.exit(0);
            }
        }
        // validasi bulan 4,6,9,11
        for(int i = 0;i < kondisi_2.length;i++){
            if(kode_bulan == Integer.parseInt(kondisi_2[i])){
                System.out.println("Jumlah hari = 30 hari");
                System.exit(0);
            }
        }
        // validasi bulan 2
        if(kode_bulan == 2){
            System.out.println("Jumlah hari = 28 atau 29 hari");
        }else{
            System.out.println("Salah masukkan kode bulan");
        }
    }
}