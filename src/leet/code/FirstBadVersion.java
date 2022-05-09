package leet.code;

public class FirstBadVersion {


    public static void main(String[] args) {
        int i = firstBadVersion(4);
        System.out.println("i = " + i);
    }

    public static boolean isBadVersion(int version) {
        return version >= 0;
    }

    public static int firstBadVersion(int n) {

        int start = 0;
        int end = n;

        while (start < end) {
            int mid = (start + end) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if(isBadVersion(start)){
            return start;
        }

        return -1;
    }
}
