package leet.code;

public class RichestCustomerWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {

        int maxResult = Integer.MIN_VALUE;
        int maxCurrent = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                maxCurrent += accounts[i][j];
            }

            if (maxCurrent > maxResult) {
                maxResult = maxCurrent;
            }
            maxCurrent = 0;
        }
        return maxResult;
    }
}
