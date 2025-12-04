package java_metodos;

public class ApiJava {

    public static void validarEmail(String email){
        if(email.length() > 5 && email.contains("@") && email.contains(".") ){
            System.out.println("El email es valido");
        } else {
            System.out.println("Ingrese un email valido");
        }
    }

    public static String validarPassword(String password){
        if(password.length() >= 8){
            return "Password correcta";
        }
        return "La contraseña es demasiado corta";
    }
}