package Java_Operadores_C2;

public class MainOperadores {
    public static void main(String[] args) {
        //
        System.out.println("Clase 2. Parte 2.");

        System.out.println("\n --- OPERADORES LÓGICOS ---");
        boolean tienesDinero = true;
        boolean tienesTarjetaCredito = false;
        boolean estaHaciendoFrio = true;

        // ! AND &&
        boolean puedeComprar = tienesDinero && tienesTarjetaCredito;
        System.out.println("¿Puede comprar? " + puedeComprar);

        int edad = 20;

        boolean puedeEntrar = (edad >= 18) && estaHaciendoFrio;
        // ! OR ||
        boolean puedeEntran2 = (edad >= 18) || estaHaciendoFrio;

        estaHaciendoFrio = false;

        // ! NOT !
        boolean estaHaciendoFrio2 = !true;
    }
}