public class ValueWithOperator {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;

        //kode menukar isi variable

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("%d - %d", a, b);
    }
}
