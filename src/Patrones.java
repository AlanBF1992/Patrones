import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número n");

        int n = sc.nextInt();

        System.out.println("Patron 1");
        patron(n, "*.");

        System.out.println("Patron 2");
        patron(n, "1234");

        System.out.println("Patron 3");
        patron(n, "||*");
    }

    private static void patron(int n, String pat) {
        System.out.println(pat.repeat((int) Math.ceil((double) n/pat.length())).substring(0,n));
    }
}
