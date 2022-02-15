import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matris = {{2, 3, 4}, {5, 6, 4}};

        System.out.println(Arrays.deepToString(transpose(matris)));

    }

    static int[][] transpose(int[][] matris) {

        int row = matris.length;
        int col = matris[0].length;

        int[][] transpose = new int[col][row];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpose[j][i] = matris[i][j];
            }

        }
        return  transpose;

    }
}

