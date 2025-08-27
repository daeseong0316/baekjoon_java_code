import java.util.Scanner;

public class bj2639 {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                paper[i][j] = sc.nextInt();
            }
        }

        divide(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    public static void divide(int x, int y, int size) {
        if (checkSameColor(x, y, size)) {
            if (paper[x][y] == 0) white++;
            else blue++;
            return;
        }

        int newSize = size / 2;
        divide(x, y, newSize); // 1사분면
        divide(x, y + newSize, newSize); // 2사분면
        divide(x + newSize, y, newSize); // 3사분면
        divide(x + newSize, y + newSize, newSize); // 4사분면
    }

    public static boolean checkSameColor(int x, int y, int size) {
        int color = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) return false;
            }
        }
        return true;
    }
}
