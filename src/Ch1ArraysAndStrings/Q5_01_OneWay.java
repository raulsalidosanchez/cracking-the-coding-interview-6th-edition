package Ch1ArraysAndStrings;

public class Q5_01_OneWay {

    public static void main(String[] args) {
        String cadena1 = "pale";
        String cadena2 = "bae";

        if(checkOneWay(cadena1, cadena2)){
            System.out.println("Sí están a 1 ó 0 ediciones de distancia");
        } else {
            System.out.println("No están a 1 ó 0 ediciones de distancia");
        }
    }

    public static boolean checkOneWay(String cadena1, String cadena2){

        char[] arr1 = cadena1.toCharArray();
        char[] arr2 = cadena2.toCharArray();
        char[] arrMayor;
        char[] arrMenor;
        int cont = 0;

        if(cadena1.compareTo(cadena2) == 0){
            return true;
        }

        int lMayor = Math.max(arr1.length, arr2.length);
        int lMenor = Math.min(arr1.length, arr2.length);
        int resta = lMayor - lMenor;
        if(resta != 0 && resta != 1){
            return false;
        }

        if(arr1.length > arr2.length){
            arrMayor = arr1;
            arrMenor = arr2;
        } else {
            arrMayor = arr2;
            arrMenor = arr1;
        }

        for(int i=0; i<lMenor; i++){
            for(int j=0; j<lMayor; j++){
                if(arrMenor[i] == arrMayor[j]){
                    cont++;
                }
            }
        }

        if(cont == lMenor) {
            return true;
        } else if(resta == 0 && (cont == lMenor - 1)){
            return true;
        } else {
            return false;
        }

    }

}
