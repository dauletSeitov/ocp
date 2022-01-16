package leet.code;

public class LongPressedName {
    public static void main(String[] args) {
        boolean longPressedName = isLongPressedName("pyplrz", "ppyypllr");
        System.out.println("longPressedName = " + longPressedName);
    }

    public static boolean isLongPressedName(String name, String typed) {

        if (name.equals(typed)) {
            return true;
        }
        if (name.length() > typed.length()) {
            return false;
        }

        int namePointer = 0;
        int typedPointer = 0;
        char prev = ' ';
        while (namePointer < name.length() && typedPointer < typed.length()) {

            if (name.charAt(namePointer) == typed.charAt(typedPointer)) {
                namePointer++;
                typedPointer++;
            } else if (prev == typed.charAt(typedPointer)) {
                typedPointer++;
            } else {
                return false;
            }

            prev = typed.charAt(typedPointer - 1);
        }
        if(namePointer < name.length()){
            return false;
        }
        for (int i = typedPointer; i < typed.length(); i++) {
            if (prev != typed.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
