package java_variables_lab1;

import java.util.Scanner;

public class FacturacionLab {


    public void iniciarFacturacion() {

        // 1. -- Definir los datos
        // var entrada usu
        String nombreProducto;
        double precioProducto;
        int cantidadComprar;
        final double IMPUESTO = 0.21;
        double dineroCliente;

        // 2. -- Entrada datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Facturación ---");
        System.out.print("Nombre del producto: ");
        nombreProducto = scanner.nextLine();

        System.out.print("Precio unitario: $");
        precioProducto = scanner.nextDouble();

        System.out.print("Cantidad a comprar: ");
        cantidadComprar = scanner.nextInt();

        System.out.print("Dinero que trae el cliente: $");
        dineroCliente = scanner.nextDouble();

        scanner.close();

        // --- 3. Lógica de Negocio

        // a) Calcula el subtotal
        double subtotal = precioProducto * cantidadComprar;

        // b) Calcula el total a pagar
        double impuestoCalculado = subtotal * IMPUESTO;
        double totalAPagar = subtotal + impuestoCalculado;

        // c) Reto de Casting
        int totalRedondeado = (int) totalAPagar;

        // --- 4. Validación


        boolean puedeComprar = dineroCliente >= totalAPagar;

        // --- 5. Salida

        System.out.println("\n--- Ticket---");
        System.out.println("Artículo: " + nombreProducto + " x" + cantidadComprar);
        System.out.println("Precio Unitario: $" + precioProducto);
        System.out.println("----------------------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto del 21%: $" + impuestoCalculado);
        System.out.println("----------------------------------");
        System.out.println("TOTAL FINAL: $" + totalAPagar);
        System.out.println("Total a pagar (redondeado): $" + totalRedondeado);
        System.out.println("Dinero Cliente: $" + dineroCliente);
        System.out.println("---");
        System.out.println("¿Compra aprobada?: " + puedeComprar);
        System.out.println(puedeComprar ? "✅ Gracias por su compra" : "❌ Vuelva a intentar, saldo insuficiente.");

    }
}