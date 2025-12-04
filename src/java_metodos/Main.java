// **PASO 1: Esta línea es crucial y debe ser la primera.**
package java_metodos;

//public class Main {
//    public static void main(String[] args) {
//        //==========================================
//        // ! Primera parte
//        Metodos.mostrarMsjBienvenida();
//
//        Metodos.calcularInteres(capital: 1000, tasa: 5.5, tiempo: 180);
//        calcularInteres(capital: 1000, tasa: 5.5, tiempo: 180);
//        double interes = calcularInteres(capital: 1000, tasa: 5.5, tiempo: 180);
//        System.out.println("El interés de tu crédito es: " + interes);
//
//        //==========================================
//        // ==========================================
//
//        // ! Segunda parte Api java
//
//        String email = "user@hola.com";
//        String password = "User1234";
//
//        System.out.println("Longitud: " + email.length());
//        System.out.println("Esto es un email valido? : " + email.contains("@"));
//        System.out.println("Primer caracter: " + email.charAt(0));
//    }
//}

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Ejecutando Código Refactorizado ---");

        // Llamamos al método 'calculando()' dentro de la clase 'RefactorizandoFunciones'.
        // Este método usará la función calcularPrecioFinal() que creaste.
        RefactorizandoFunciones.calculando();

        System.out.println("--------------------------------------");

        // Opcional: Si también quieres ver el resultado del código original:
        // System.out.println("--- Ejecutando Código Original ---");
        // Refactorizando.calculando();
        // System.out.println("--------------------------------------");
    }
}