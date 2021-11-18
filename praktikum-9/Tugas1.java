public class Tugas1 {

	public static void main(String[] args){
		// inisialisasi variabel celcius dan fahrenheit
		double celcius,fahrenheit;
		// menampilkan nilai suhu fahrenheit dari nilai celcius 20 - 30
		celcius = 20;
		// memproses perulangan
		do{
			fahrenheit = (celcius*9/5) + 32;
			System.out.println("suhu celcius "+celcius+" = "+fahrenheit+" F");
			celcius++;
		} while(celcius <= 30);
	}
}