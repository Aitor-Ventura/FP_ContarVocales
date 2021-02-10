package es.ulpgc.eii.strings;

public class StringUtils { //clase
    public static int vocales(String s1){ //creamos método con parámetro del tipo String
        int c = 0;  //creamos una variable c que actuará de contador
        String s2 = "AEIUOaeiouÁÉÍÓÚáéíóúÜü";
        for (int i = 0; i < s1.length(); i++){ //bucle que recorre la primera string (que nos dan)
            for (int j = 0; j < s2.length(); j++){ //bucle que recorre la segunda string (la de carácter)
                if (s2.charAt(j) == s1.charAt(i)){  //si el caracter de la segunda string es igual a una de las primeras
                    c++;    //sumar
                }
            }
        }
        return c;   //devolvemos el numero de vocales
    }

}