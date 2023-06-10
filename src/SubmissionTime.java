import java.util.Scanner;

public class SubmissionTime {
    public static void main(String[] args) {
        // Kodisi SUCCESS jika collect pada 8 - 17
        Scanner scan = new Scanner(System.in);

//        System.out.print("Mengumpulkan pada jam: ");
        int collect = scan.nextInt();

        if(collect >= 8 && collect <= 17){
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

    }
}
