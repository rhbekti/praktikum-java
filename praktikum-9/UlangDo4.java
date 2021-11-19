import java.util.Scanner;

public class UlangDo4{
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
        int bil = 1,total;

        System.out.print("Masukkan jumlah perulangan = ");
        total = scan.nextInt();

        do{
            System.out.println("STMIK AKAKOM");
            bil++;
        } while(bil <= total);

        System.out.println("total perulangan = "+total);
    }
}