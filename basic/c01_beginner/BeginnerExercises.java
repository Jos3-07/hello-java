package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre = "Jose";
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 18;
        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.82;
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean me_gusta_programar = true;
        // 5. Declara una constante con tu email.
        final String EMAIL = "jose.raposo1@udc.es";
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'J';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Vega de Valcarce";
        System.out.println(localidad);
        localidad = "A Coruña";
        System.out.println(localidad);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 3;
        int b = 5;
        System.out.println(a + b);
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        
    }
}
