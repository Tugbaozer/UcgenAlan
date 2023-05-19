import java.util.Scanner;
import java.util.concurrent.Callable;

public class ucgenalan {
    public static void main(String[] args) {

        int a, b, c ;
        int u;
        int alan;

        Scanner veri = new Scanner(System.in);
        System.out.print("1. Kenar uzunluğu  : " );
        a = veri.nextInt();
        System.out.print("2. Kenar uzunluğu : " );
        b = veri.nextInt();
        System.out.print("3. Kenar uzunluğu : " );
        c = veri.nextInt();

        u = (a + b + c) / 2;
        alan = (int) Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print("Üçgenin Alanı : " + alan);



    }
}
