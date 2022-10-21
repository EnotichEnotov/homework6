import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        byte[] ar = new byte[n];
        for (int i = 0; i < n; ++i) {
            boolean q = in.nextBoolean();
            if (q==true) {
                ar[i] = 1;
            }
            else{
                ar[i] = 0;
            }

        }

        for (int i = 0; i < n; ++i) {
                System.out.print(ar[i] == 1);
            System.out.print(" ");
        }
    }
}
