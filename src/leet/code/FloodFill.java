package leet.code;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {

        int[][] array = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] ints = new FloodFill().floodFill(array, 1, 1, 1);
        System.out.println("Arrays.deepToString(ints) = " + Arrays.deepToString(ints));
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int oldColor = image[sr][sc];
        dfs(image, sr, sc, newColor, oldColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int newColor, int oldColor) {


        if (sr >= image.length || sr < 0) {
            return;
        }
        if (sc >= image[sr].length || sc < 0) {
            return;
        }
        if (image[sr][sc] == newColor) {
            return;
        }
        if (oldColor != image[sr][sc]) {
            return;
        }
        image[sr][sc] = newColor;

        dfs(image, sr, sc + 1, newColor, oldColor); //R
        dfs(image, sr + 1, sc, newColor, oldColor); //D
        dfs(image, sr, sc - 1, newColor, oldColor); //L
        dfs(image, sr - 1, sc, newColor, oldColor); //W


    }
}
