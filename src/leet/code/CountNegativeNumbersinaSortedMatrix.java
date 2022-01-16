package leet.code;

public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args) {

        int i = countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}});
        System.out.println(i);
    }

    public static int countNegatives(int[][] grid) {
        fun(grid, grid.length - 1, grid[0].length - 1);
        return count;
    }

    static int count = 0;

    static void fun(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || grid[i][j] >= 0) {
            return;
        }
        count++;
        grid[i][j] = 0;
        fun(grid, i - 1, j);
        fun(grid, i - 1, j - 1);
        fun(grid, i, j - 1);
    }

}
