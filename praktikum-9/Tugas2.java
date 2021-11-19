import java.util.Scanner;

public class Tugas2{
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
      int i = 1,n;

      System.out.print("Masukkan nilai n = ");
      n = scan.nextInt();

      do{
          System.out.print(i*i+" ");
          i++;
      } while(i <= n);
    }
}