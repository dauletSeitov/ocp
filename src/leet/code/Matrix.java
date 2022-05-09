package leet.code;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matrix {
    public static void main(String[] args) {
//        new Matrix().updateMatrix(new int[][]{
//                {0, 0, 0},
//                {0, 1, 0},
//                {0, 0, 0}});

//        int[][] ints = new Matrix().updateMatrix(new int[][]{
//                {0, 0, 0},
//                {0, 1, 0},
//                {1, 1, 1}});
//        System.out.println(Arrays.deepToString(ints));


//        int i1 = new Matrix().magicMathod(new int[][]{
//                {0, 0, 0},
//                {0, 1, 0},
//                {1, 1, 1}}, 2, 0);
//        System.out.println(i1);


        int[][] mat = new int[][]{
                {1, 0, 1, 1, 0, 0, 1, 0, 0, 1},
                {0, 1, 1, 0, 1, 0, 1, 0, 1, 1},
                {0, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 0, 1, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 0},
                {1, 1, 1, 1, 0, 1, 0, 0, 1, 1}};

        System.out.println(Arrays.deepToString(new Matrix().updateMatrix(mat)));

//        int[][] ints = new Matrix().updateMatrix(new int[][]{
//                { 1},
//                { 0},
//                {1}});
//        System.out.println(Arrays.deepToString(ints));

    }

    public int[][] updateMatrix(int[][] mat) {
        int count =0;
        int[][] result = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat[i].length; k++) {
                if (mat[i][k] == 1 || mat[i][k] < 0) {
                    count++;
                    int i1 = magicMathod(mat, i, k, count);
                    result[i][k] = i1;
                }
            }
        }
        return result;
    }

    private int magicMathod(int[][] mat, int i, int k, int count) {

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(i, k, 0));
       // boolean[][] visitedMap = new boolean[mat.length][mat[0].length];

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            if (point.i < 0 || point.i >= mat.length) {
                continue;
            }

            if (point.k < 0 || point.k >= mat[i].length) {
                continue;
            }

            if (mat[point.i][point.k] == -count) {//already visited
                continue;
            }

            if (mat[point.i][point.k] == 0) {//think about it
                return point.layer;
            }

            mat[point.i][point.k] = -count;


            queue.offer(new Point(point.i, point.k + 1, point.layer + 1));//R
            queue.offer(new Point(point.i + 1, point.k, point.layer + 1));//D
            queue.offer(new Point(point.i, point.k - 1, point.layer + 1));//L
            queue.offer(new Point(point.i - 1, point.k, point.layer + 1));//U

        }

        return 0;


    }


    class Point {
        int i;
        int k;
        int layer;

        Point(int i, int k, int layer) {
            this.i = i;
            this.k = k;
            this.layer = layer;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "i=" + i +
                    ", k=" + k +
                    '}';
        }
    }


}

