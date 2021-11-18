import java.util.Scanner;
public class Tugas2 {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		String jawab;
		int counter = 0;
		boolean kondisi = true;

		do{
			System.out.println("STMIK AKAKOM");
			System.out.print("Tampilkan lagi [ya/tidak]?");
			jawab = scan.nextLine();
			if(jawab.equalsIgnoreCase("tidak")){
				kondisi = false;
			} else if(jawab.equalsIgnoreCase("ya")){
				kondisi = true;
			} else {
				System.out.println("Input jawab anda tidak dapat di proses");
				kondisi = false;
			}
			counter++;
		} while(kondisi);

		System.out.println("Anda telah melakukan perulangan sebnayak = "+counter);
	}
}