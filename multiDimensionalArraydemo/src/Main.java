public class Main {
    public static void main(String[] args) {
        String[][] sheirler = new String[3][3];

        sheirler[0][0] = "İstanbul";
        sheirler[0][1] = "Bursa";
        sheirler[0][2] = "Bilecik";
        sheirler[1][0] = "Ankara";
        sheirler[1][1] = "Konya";
        sheirler[1][2] = "Kayseri";
        sheirler[2][0] = "Diyerbakır";
        sheirler[2][1] = "şanlıurfa";
        sheirler[2][2] = "Gaziantep";

        for (int i =0;i<=2;i++) {
            System.out.println("---------");
            for (int j = 0; j <= 2; j++){
                System.out.println(sheirler[i][j]);
            }
        }

    }
}