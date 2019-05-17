package com.ejercicios;

public class Q3_01_ReplaceWhiteSpaceString {

    public static void main(String[] args) {
	    String entrada = "Mr Jonh Smith   ";
	    String sinEspacios = entrada.trim();
	    String salida = sinEspacios.replaceAll(" ", "%20");

        System.out.println(salida);

    }

}
