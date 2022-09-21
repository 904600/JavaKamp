public class Main {
    public static void main(String[] args) {

        int sayi = 20;
        //şart gerçekleşirse çalışır
        if(sayi<20) {
            System.out.println("Sayı 20 den büyüktür");
        }
        //üsteki çalışmazsa çalışır
        else if (sayi==20) {
            System.out.println("Sayi 20 ye eşittir");
        }
        //eğer üsteki şartlar değilse çalışır
        else {
            System.out.println("Sayı 20 den küçüktür");
        }



    }
}