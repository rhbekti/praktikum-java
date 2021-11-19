import java.util.Scanner;

public class Tugas1{
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
       int data,bil,i = 1,jumlah = 0;

       System.out.print("Banyaknya data : ");
       data = scan.nextInt();

       do{
           System.out.print("Data ke-"+i+": ");
           bil = scan.nextInt();
           jumlah += bil;
           i++;
       } while(i <= data);

       System.out.println("Jumlah : "+Double.valueOf(jumlah));
       System.out.println("Rata-Rata : "+(Double.valueOf(jumlah)/Double.valueOf(data)));
    }
}