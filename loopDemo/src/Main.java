public class Main {
    public static void main(String[] args) {
        //For
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti");

        //while
        int i = 1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("Döngü bitti");

        //Do-while
        // bunda şart uymasa bile bir defa çalışır
        int j = 11;
        do {
            System.out.println(j);
            j+=3;
        }while (j<10);{
            System.out.println("Döngü bitti");
        }



    }
}