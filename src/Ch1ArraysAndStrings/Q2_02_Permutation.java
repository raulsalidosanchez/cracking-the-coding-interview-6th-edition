package Ch1ArraysAndStrings;

import java.util.Arrays;

public class Q2_02_Permutation {

    public static void main(String[] args) {

        if (checkIsPermutation("dog", "god")) {
            System.out.println("Es permuta");
        } else {
            System.out.println("No es permuta");
        }

    }

    public static String ordenar(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean checkIsPermutation(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }

        return ordenar(word1).equals(ordenar(word2));
    }

}
