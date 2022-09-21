public class Main {
    public static void main(String[] args) {

        int sayı = 4;
        int toplam = 0;
        for (int i = 1; i < sayı; i++) {
            if (sayı % i == 0) {
                toplam = toplam + i;

            }
        }

        if (sayı == toplam) {
            System.out.println("Mükemmel sayi:" + sayı);
        } else {
            System.out.println("Mükemmel sayi değil:" + sayı);

        }

    }
}