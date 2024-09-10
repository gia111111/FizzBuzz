public class Reduce {
    public static void main(String[] args) {
        int i = 0;
        int n = 100;
        while (n != 0) {
            if (n % 2 == 0) {
                i = i + 1;
                n = n / 2;
            }
            else {
                i = i + 1;
                n = n -1;
            }
        }
        System.out.println(i);
    }
}
