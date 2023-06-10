import java.util.Scanner;

public class JamBelajar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jam = scan.nextInt();
        if (jam > 23 || jam < 0){
            System.out.println("WAKTU HANYA 24 JAM");
        } else if ((jam >= 8 && jam <=12) || (jam >= 14 && jam <=17) ) {
            System.out.println("JAM BELAJAR");
        } else {
            System.out.println("JAM ISTIRAHAT");
        }
    }
}
