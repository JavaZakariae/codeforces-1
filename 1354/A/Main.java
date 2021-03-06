import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            System.out.println(solve(a, b, c, d));
        }

        sc.close();
    }

    static long solve(int a, int b, int c, int d) {
        if (a <= b) {
            return b;
        }
        if (c <= d) {
            return -1;
        }

        return b + (a - b + c - d - 1L) / (c - d) * c;
    }
}