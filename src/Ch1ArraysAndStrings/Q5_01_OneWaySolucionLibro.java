package Ch1ArraysAndStrings;

public class Q5_01_OneWaySolucionLibro {

    public static void main(String[] args) {

        System.out.println(oneEditAway("pale", "bae"));

    }

    public static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditinsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditinsert(second, first);
        }
        return false;
    }

    public static boolean oneEditReplace(String sl, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < sl.length(); i++) {
            if (sl.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    public static boolean oneEditinsert(String sl, String s2) {
        int indexl = 0;
        int index2 = 0;
        while (index2 < s2.length() && indexl < sl.length()) {
            if (sl.charAt(indexl) != s2.charAt(index2)) {
                if (indexl != index2) {
                    return false;
                }
                index2++;
            } else {
                indexl++;
                index2++;
            }
        }
        return true;
    }

}
