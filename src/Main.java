import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---1. Variables ---");

        //! Declarando la variable
        int edad;
        //! Asignar valor a la variable;
        edad = 60;
        //! 2x1 Declarar y asignar al tiempo
        int temperatura =30;

        temperatura = 40;

        System.out.println("La edad es: " + edad);
        System.out.println("La temperatura es: "+ temperatura);

        int numLearners = 100;

        //? Error
        //int x;
        //sout(x)

        byte miByte = -128;
        short miShort = 32000;
        int miNumero = 10000;
        long poblacionMundialL = 8000000000L;

        System.out.println("Byte: " + miByte);
        System.out.println("Short: " + miShort);
        System.out.println("Int : " + miNumero);

        System.out.println("--- 1. Más datos primitivos ---");

        double numDouble = 0.1234567891234567;
        float numFlotante = 0.1234567891234567f;

        System.out.println("Double: " + numDouble);
        System.out.println("Float: " + numFlotante);

        //! Decimales
        float altura = 1.65f;
        double precio = 9.99;

        //! Booleanos
        boolean esTrue = true;
        boolean esFalse = false;
        //! Caracteres //con comilla simple
        char letra = 'A';
        char simbolo = '@';

        System.out.println("--- 2. Casting conversion de datos");
        // Casting implícito
        int numEntero = 100;
        double nuevoDouble = numEntero;
        System.out.println("Casteo implícito: " + nuevoDouble);
        // Casting explícito
        double notaFinal = 3.5;
        int notaEntera = (int) notaFinal;
        System.out.println("Nota entera: " + notaEntera);
        //! Interferencia

        var mNuevoNum =10;
        var miNombre = "Pepito";

        System.out.println("\n--- 5. Operadores Aritméticos ---");

        int num1 = 10;
        int num2 = 3;

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Div: " + (num1 / num2));
        System.out.println("Div correcta: " + ((double) num1 / num2));
        System.out.println("Multi: " + (num1 + num2));

        num1++;
        System.out.println("Incremento: " + num1);

        num2--;
        System.out.println("Incremento: " + num2);

        System.out.println("\n--- 6. Operadores Comparación ---");

        int num3 = 5;
        int num4 = 10;

        boolean esMayor = num3 > num4;
        boolean iguales = num3 == num4;
        boolean diferentes = num3 != num4;

        int miUltimaVariable = 200;

        System.out.println(miUltimaVariable += 10);
        System.out.println(miUltimaVariable + 10);
        System.out.println(miUltimaVariable *= 10);
        System.out.println(miUltimaVariable /= 10);

        System.out.println("\n--- 7. Interacción ---");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        int edad2 = scanner.nextInt();

        // Limpieza de buffer
        // La línea nextInt() lee el número, pero deja el salto de línea (Enter)
        // en el buffer de entrada. Esto se consume con nextLine().
        //
        // Limpiamos el buffer
        scanner.nextLine();

        // Pide y lee una cadena (nombre)
        System.out.println("Dime tu nombre: ");
        String nombre = scanner.nextLine();

        // Imprime el resultado
        System.out.println("Hola: " + nombre);

        // Cierra el Scanner
        scanner.close();


    }
}