// 4. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

import java.util.Arrays;

class task_4 {

    private static boolean with_safety(char[][] mat, int r, int c) {

        for (int i = 0; i < r; i++) {
            if (mat[i][c] == 'Ф') {
                return false;
            }
        }

        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == 'Ф') {
                return false;
            }
        }

        for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
            if (mat[i][j] == 'Ф') {
                return false;
            }
        }

        return true;
    }

    private static void print_result(char[][] mat) {
        for (char[] chars : mat) {
            System.out.println(Arrays.toString(chars).replaceAll(",", ""));
        }
        System.out.println();
    }

    private static void ferz(char[][] mat, int r) {

        if (r == mat.length) {
            print_result(mat);
            return;
        }

        for (int i = 0; i < mat.length; i++) {

            if (with_safety(mat, r, i)) {

                mat[r][i] = 'Ф';

                ferz(mat, r + 1);

                mat[r][i] = '.';
            }
        }
    }

    public static void main(String[] args) {

        int N = 8;

        char[][] mat = new char[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(mat[i], '.');
        }

        ferz(mat, 0);
    }
}