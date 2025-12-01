
public class ProcesarPedido {
    public static void aplicarTarifaEnvio(double valorPedido, boolean esClientePremium) {
        System.out.println("\n --- 2. Tarifa envio con If-else");

        double costoEnvio = 15;

        if(esClientePremium){
            System.out.println("Envio gratis");
            costoEnvio = 0;
        } else {
            System.out.println("Vamos a calcular tu valor de envío");
        }

        if(valorPedido >= 100){
            System.out.println("El envio te queda en 5 dolares");
            costoEnvio = 5;
        } else if (valorPedido >= 50){
            System.out.println("Tiene un 50% de desc en el envio");
            costoEnvio *= 0.5;
        } else {
            System.out.println("Tu envío sería de 15");
        }
        System.out.println("");

    }
}

