package java_colecciones;

//! Accedo a los elementos por medio de sus indices
//! Sintaxis:
//! String[] nombreArray = new String[tamañoArray]
public class ArrayClase {
    public static void ejemplo1Array(){

        //! Creamos un array fijo de 3 nombres
        String[] nombres = new String[3];

        //! Asignación manual de valores
        nombres[0] = "Sebas";
        nombres[1] = "MariaP";
        nombres[2] = "Diana";

        //! AAcceso a único valor
        System.out.println(nombres[1]);

        String[] nombre = { "Victoria","Juan","Pedrito"};
        //? Array de numeros:

        int[] numeros = {10, 20, 30, 40, 50};

    }
}
