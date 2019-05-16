package Ch1ArraysAndStrings;

public class Q1_01_isUnique {

    public static void main(String[] args) {
        String cadena = "prueba";

        boolean result = isUniqueChars(cadena);

        if(result) {
            System.out.println("cadena de caracteres únicos");
        } else {
            System.out.println("cadena con caracteres repetidos");
        }
    }

    public static boolean isUniqueChars(String str) {
        if(str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for(int i=0; i<str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }

}
