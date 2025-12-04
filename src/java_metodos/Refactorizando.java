package java_metodos;

public class Refactorizando {

    public static void calculando() {
        double precio1 = 100;
        double conDescuento1 = precio1 * 0.8;
        double conIva1 = conDescuento1 * 1.19;
        System.out.println("Producto 1: $" + conIva1);

        double precio2 = 200;
        double conDescuento2 = precio2 * 0.9;
        double conIva2 = conDescuento2 * 1.19;
        System.out.println("Producto 2: $" + conIva2);
    }
}

public class RefactorizandoFunciones {

    public static double calcularPrecioFinal(double precioBase, double descuentoPorcentaje, double ivaPorcentaje) {

        double factorDescuento = descuentoPorcentaje / 100.0;
        double factorIva = ivaPorcentaje / 100.0;

        // descuento
        double precioConDescuento = precioBase * (1.0 - factorDescuento);

        // IVA
        double precioFinal = precioConDescuento * (1.0 + factorIva);

        return precioFinal;
    }

    public static void calculando() {

        double precio1 = 100;
        double conIva1 = calcularPrecioFinal(precio1, 20, 19); // 20% Desc, 19% IVA
        System.out.println("Producto 1: $" + conIva1);
    }
}