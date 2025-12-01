package java_bucles;

public class For {
//!! Sintaxis
//!! for (Inicialización, condición, actualización){
//!!   Código
//!!   Formas de incrementar
//    i = i + 1;
//    i += 1;
//    i++

    public static void comparacionWhileFor(){
        for(int i=0; i < 10; i++){
            System.out.println(i);
        }
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
    }

    public static void ejercicio1For(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio2For(){
        // Contador que va de 10 a 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
    public static void ejercicio3For(){
        for(int i = 0; i < 10; i++){
            System.out.println("Numero: " + i);
        }
    }


}