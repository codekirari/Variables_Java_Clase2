package java_bucles;

public static void ejemplo2DoWhile() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú");
            System.out.println("1. Papitas");
            System.out.println("2. Papitas en salsa");
            System.out.println("3. Papitas gratinadas");
            System.out.println("4. Salir ");
            System.out.println("Selecciona tu opción");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Muy bien, eleigste papitas");
                    break;
                case 2:
                    System.out.println("Eleigste papitas en salsa");
                    break;
                case 3:
                    System.out.println("Muy bien, eleigste gratinadas");
                    break;
                case 4:
                    System.out.println("Ya traigo tu orden ");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while(opcion != 4);
    }
