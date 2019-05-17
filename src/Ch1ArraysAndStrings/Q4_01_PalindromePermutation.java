package com.ejercicios;

import java.util.Arrays;

public class Q4_01_PalindromePermutation {

    public static void main(String[] args) {
        String entrada = "tact coa";
        String str = entrada.replace(" ", "");
        System.out.println(str);

	    if(checkPalindromePermutation(str)){
            System.out.println("'" + entrada + "'" + " es un palíndromo permutado");
        } else {
            System.out.println("'" + entrada + "'" + " no es un palíndromo permutado");
        }

    }

    public static boolean checkPalindromePermutation(String entrada){
        int par = 0, impar = 0;

        for (int i=0; i<entrada.length(); i++) {
            int cont = 0;
            for(int j=0; j<entrada.length(); j++){
                if(entrada.charAt(i) == entrada.charAt(j)){
                    cont++;
                }
            }
            if(cont%2 == 0){
                par++;
            } else {
                impar++;
            }
        }

        if(impar > 1) {
            return false;
        } else {
            return true;
        }

    }

}
