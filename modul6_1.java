class modul6_1{
    public static void main(String[]args){
        // deklarasi variabel
        int bil;
        // jika nilai bil = 5
        // bil = 5;
        // jika nilai bil = 100    
        bil = 100;    

        switch(bil%2){
            case 0 :
                System.out.println("Bilangan genap");
                break;
            case 1 :
                System.out.println("Bilangan ganjil");
                break;
            default :
                System.out.println("Salah Bilangan");
        }
    }
}