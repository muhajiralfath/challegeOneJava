public class VariableDanData {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

//        Lenkapi kode
        int sementara = a;
        a = b;
        b = sementara;

        System.out.printf("%d - %d", a, b);
    }
}
