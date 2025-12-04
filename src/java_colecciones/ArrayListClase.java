package java_colecciones;

// SINTAXIS BÁSICA:

import java.util.ArrayList;

//! ArrayList<TipoDeDato> nombreDeMiArrayList = new ArrayList<>();
public class ArrayListClase {
    public static void ejemplo1ArrayList() {

        ArrayList<String> frutas = new ArrayList<>();
        //! Add
        frutas.add("Pera");
        frutas.add("Banano");
        frutas.add("Sandia");
        frutas.add("Sandia");
        System.out.println("Mi lista es:" + frutas);

        // //! Insertando info
        frutas.add(2, "Uva");
        System.out.println("Mi lista es:" + frutas);

        // //! Eliminado un valor
        frutas.remove("Uva"); // o: "Uva"
        System.out.println("Mi lista es:" + frutas);

        // //! Traer un dato especifico
        String datoespecifico = frutas.get(2);
        System.out.println("Lo que está en el indice dos: " + datoespecifico);

        // //! Busqueda
        boolean tieneONo = frutas.contains("Melon");
        System.out.println("Si tiene melon o no?: " + tieneONo);

        public static void ejemplo2ArrayList(){

            ArrayList<String> nombres = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa nombres, si queires salir escribe fin");
            String nombre;
            while(!(nombre = scanner.nextLine()).equals("fin")){
                nombres.add(nombre);
            }

            //! Buscar por nombre
            System.out.println("Ingresa el nombre a buscar: ");
            String nombreBusqueda = scanner.nextLine();
            nombreBusqueda = nombreBusqueda.toLowerCase();

            if(nombres.contains(nombreBusqueda)){
                System.out.println("Si está");
            } else {
                System.out.println("No está");
            }

            //! Elimar un nobmre
            System.out.println("Ingresa el nombre a buscar: ");
            String nombreaEliminar = scanner.nextLine();

            if(nombres.remove(nombreaEliminar)){
                System.out.println("Se eliminó");
            } else {
                System.out.println("No estába, no se eliminó");
            }

            for(int i = 0; i< nombres.toArray().length; i++){
                System.out.println("Nombre " + i);
            }

            //! For each
            for (String name : nombres){
                System.out.println(name);
            }
    }
}