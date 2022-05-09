public class PermutationinString {
    public static void main(String[] args) {
        System.out.println(new PermutationinString().checkInclusion("adc", "yui", 0));
    }

    public boolean checkInclusion(String s1, String s2, int startPoint) {

        char[] set = new char[26];
        fill(set, s1);

        int firstMatchIndex = -1;
        for (int i = startPoint; i < s2.length(); i++) {

            if (firstMatchIndex > -1) {
                if (set[s2.charAt(i) - 'a'] > 0) {
                    set[s2.charAt(i) - 'a']--;
                    continue;
                } else if (isEmpty(set)) {
                    return true;
                } else {
                    return checkInclusion(s1, s2, firstMatchIndex + 1);

                }

            }

            if (set[s2.charAt(i) - 'a'] > 0) {
                firstMatchIndex = i;
                set[s2.charAt(i) - 'a']--;
            }
        }

        return isEmpty(set);
    }


    private boolean isEmpty(char[] array) {
        for (char ch : array) {
            if (ch != 0) {
                return false;
            }
        }
        return true;
    }

    private void fill(char[] array, String str) {
        for (char ch : str.toCharArray()) {
            array[ch - 'a']++;
        }
    }
}
