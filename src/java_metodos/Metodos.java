package java_metodos;

public class Metodos {

    // // Sintaxis Básica
    // // modificador TipoRetorno nombreMetodo(//parametros)
    // // {}

    public int sumar(//parametros) {
    // Cuerpo omitido
}

// Este método solo imprime un mensaje (no devuelve valor)
public static void mostrarMsjBienvenida() {
    System.out.println("Bienvenido a nuestro banco");
}

// Este método calcula el interés simple y devuelve el valor (double)
public static double calcularInteres(double capital, double tasa, int tiempo) {
    // Fórmula de Interés Simple: Capital * (Tasa/100) * Tiempo
    return capital * (tasa / 100) * tiempo;
}
}