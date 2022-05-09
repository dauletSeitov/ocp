package leet.code;

public class ValidSudoku {
    public static void main(String[] args) {

        char[][] param = new char[][]{
                {'.','.','4','.','.','.','6','3','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','9','.'},
                {'.','.','.','5','6','.','.','.','.'},
                {'4','.','3','.','.','.','.','.','1'},
                {'.','.','.','7','.','.','.','.','.'},
                {'.','.','.','5','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}};
        boolean validSudoku = isValidSudoku(param);
        System.out.println("validSudoku = " + validSudoku);
    }
    public static boolean isValidSudoku(char[][] board) {
        int[] row = new int[10];
        int[] column = new int[10];


        for(int i = 0; i < board.length; i++){
            for(int k = 0; k < board[i].length; k++){
                if(board[i][k] != '.'){
                    row[Character.getNumericValue(board[i][k])] ++;
                }

                if(board[k][i] != '.'){
                    column[Character.getNumericValue(board[k][i])] ++;
                }
            }
            if(!isValid(row) || !isValid(column)){
                return false;
            }


        }


        int[][] subSqueareCordinats = new int[][]{{0, 3}, {3, 6}, {6, 9}};
        for(int[] srow : subSqueareCordinats){
            for(int[] scolumn : subSqueareCordinats){

                int index = 0;
                for(int i = srow[0]; i < srow[1]; i++){
                    for(int k = scolumn[0]; k < scolumn[1]; k++){
                        if(board[i][k] != '.'){
                            row[Character.getNumericValue(board[i][k])] ++;
                        }
                    }
                }
                if(!isValid(row) ){
                    return false;
                }
            }
        }
        return true;
    }


    private static boolean isValid( int[] array){
        boolean result = true;
        for(int i = 1; i< array.length; i++){
            if(array[i] > 1){
                result = false;
            }
            array[i] = 0;
        }
        return result;
    }
}
