import java.util.Scanner;

public class Validador {
    public static void main(String[] args) {
        //1. --Datos y variables de entrada
        Scanner scanner = new Scanner(System.in);
        String nombreUsuario;
        int edad;
        double saldoCuenta;
        boolean esPremium;

        System.out.println("--🎬 Validador perfil 🎬--");

        System.out.println("Ingresa tu nombre de usuario: ");
        nombreUsuario = scanner.nextLine();
        System.out.print("2. Ingresa tu edad: ");
        edad = scanner.nextInt();
        System.out.print("3. Ingresa tu saldo en la cuenta: ");
        saldoCuenta = scanner.nextDouble();

        System.out.print("4. ¿Tu cuenta es Premium? (true or false): ");
        esPremium = scanner.nextBoolean();

        System.out.println("\n--- Validando en el sistema... ---");
        scanner.close();

        // 2. -- Lógica de validacion

        boolean accesoExclusivo = (edad >= 18) && esPremium;

        // 2. calificaPromocion
        boolean calificaPromocion = (saldoCuenta > 1000) || (edad < 25);

        // 3. perfilIncompleto
        boolean perfilIncompleto = (saldoCuenta == 0) || (!nombreUsuario.equals("invitado"));

        // 4. perfilActivoTotal

        boolean perfilActivoTotal = !perfilIncompleto && (accesoExclusivo || calificaPromocion);

        // 3. -- Resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Acceso Exclusivo: " + accesoExclusivo);
        System.out.println("Califica para Promoción: " + calificaPromocion);
        System.out.println("Perfil Incompleto: " + perfilIncompleto);
        System.out.println("\nPerfil activo: " + perfilActivoTotal);
    }
}
