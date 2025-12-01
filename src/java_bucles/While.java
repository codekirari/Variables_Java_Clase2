package java_bucles;

import java.util.Scanner;

public class While {
    //! Componentes:
    //! Inicialización, Condición, Cuerpo del while, Actualización

    //2 Sintaxis:
    // inicialización;
    // while(condición){
    //      actualización;
    // }

    public static void ejemplo1While(){
        int contador = 1;

        while (contador <= 3){
            System.out.println("Iteración: " + contador);
            contador++;
        }
        System.out.println(contador);
    }
}

public static void ejemplo2While(){

    while (bandera){
        System.out.println("¿Quieres pasar el curso si/no?");
        opcion = scanner.nextLine();

        if(opcion.equalsIgnoreCase("si")){
            System.out.println("Súper!!! Felicitaciones");
            bandera = false;
        } else {
            System.out.println("Muy mal");
        }
    }
}

public class ValidacionAcceso {

    public static void validarUsuario() {
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1233";

        int intentosRestantes = 3;
        boolean accesoConcedido = false;

        Scanner scanner = new Scanner(System.in);

        while (intentosRestantes > 0 && !accesoConcedido) {
            System.out.println("\n--- INICIO DE SESIÓN ---");
            System.out.println("Intentos restantes: " + intentosRestantes);

            System.out.print("Nombre de usuario: ");
            String nombreUsuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            if (nombreUsuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
                System.out.println("\n✅ Acceso concedido. ¡Bienvenido, " + nombreUsuario + "!");
                accesoConcedido = true;
            } else {
                System.out.println("❌ Usuario o contraseña incorrectos.");
                intentosRestantes--;
            }
        }

        if (!accesoConcedido) {
            System.out.println("\n🛑 ¡Sistema Bloqueado! Ha agotado sus " + 3 + " intentos fallidos.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        validarUsuario();
    }
}
