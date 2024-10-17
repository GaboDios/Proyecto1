import java.util.Scanner;

public class CheemsMart {

    // Método main
    public static void main(String[] args) {
        // Cliente de México
        ClienteFactory mexicoFactory = new ClienteMexicoFactory();
        Cliente clienteMexico = mexicoFactory.crearCliente(
                "JuanPerez",
                "37RZ80",
                "Juan Perez",
                "5551234567",
                "Calle Reforma 100, Ciudad de México",
                "370467798034",
                1000.00
        );

        // Cliente de Estados Unidos
        ClienteFactory usaFactory = new ClienteEEUUFactory();
        Cliente clienteUSA = usaFactory.crearCliente(
                "JohnSmith",
                "62A4X9",
                "John Smith",
                "5552345678",
                "123 Main St, New York",
                "370467798034",
                2000.00
        );

        // Cliente de Brasil
        ClienteFactory brasilFactory = new ClienteBrasilFactory();
        Cliente clienteBrasil = brasilFactory.crearCliente(
                "RafaelaSantos",
                "J7O78E",
                "Rafaela Santos",
                "5553456789",
                "Rua da Liberdade 200, São Paulo",
                "715203160157",
                1500.00
        );

        // Crear el catálogo
        Catalogo catalogo = new Catalogo();

        // Agregar productos al catálogo

        // Electrónica
        catalogo.agregarProducto(new Producto("001", "Televisor", "Electrónica", 500.00));
        catalogo.agregarProducto(new Producto("002", "Smartphone", "Electrónica", 700.00));
        catalogo.agregarProducto(new Producto("003", "Laptop", "Electrónica", 900.00));
        catalogo.agregarProducto(new Producto("004", "Audífonos", "Electrónica", 50.00));
        catalogo.agregarProducto(new Producto("005", "Tablet", "Electrónica", 300.00));

        // Electrodomésticos
        catalogo.agregarProducto(new Producto("006", "Refrigerador", "Electrodoméstico", 1200.00));
        catalogo.agregarProducto(new Producto("007", "Lavadora", "Electrodoméstico", 800.00));
        catalogo.agregarProducto(new Producto("008", "Microondas", "Electrodoméstico", 150.00));
        catalogo.agregarProducto(new Producto("009", "Horno", "Electrodoméstico", 500.00));
        catalogo.agregarProducto(new Producto("010", "Aspiradora", "Electrodoméstico", 200.00));

        // Productos alimenticios
        catalogo.agregarProducto(new Producto("011", "Cereal", "Producto alimenticio", 5.00));
        catalogo.agregarProducto(new Producto("012", "Arroz", "Producto alimenticio", 2.00));
        catalogo.agregarProducto(new Producto("013", "Leche", "Producto alimenticio", 1.50));
        catalogo.agregarProducto(new Producto("014", "Pan", "Producto alimenticio", 1.00));
        catalogo.agregarProducto(new Producto("015", "Mantequilla", "Producto alimenticio", 3.00));

        // Ropa
        catalogo.agregarProducto(new Producto("016", "Camiseta", "Ropa", 20.00));
        catalogo.agregarProducto(new Producto("017", "Pantalón", "Ropa", 40.00));
        catalogo.agregarProducto(new Producto("018", "Chaqueta", "Ropa", 60.00));
        catalogo.agregarProducto(new Producto("019", "Zapatos", "Ropa", 80.00));
        catalogo.agregarProducto(new Producto("020", "Sombrero", "Ropa", 15.00));

        // Muebles
        catalogo.agregarProducto(new Producto("021", "Sofá", "Muebles", 400.00));
        catalogo.agregarProducto(new Producto("022", "Mesa", "Muebles", 150.00));
        catalogo.agregarProducto(new Producto("023", "Silla", "Muebles", 50.00));
        catalogo.agregarProducto(new Producto("024", "Cama", "Muebles", 300.00));
        catalogo.agregarProducto(new Producto("025", "Escritorio", "Muebles", 200.00));

        // Juguetes
        catalogo.agregarProducto(new Producto("026", "Pelota", "Juguetes", 10.00));
        catalogo.agregarProducto(new Producto("027", "Muñeca", "Juguetes", 25.00));
        catalogo.agregarProducto(new Producto("028", "Auto de juguete", "Juguetes", 15.00));
        catalogo.agregarProducto(new Producto("029", "Rompecabezas", "Juguetes", 8.00));
        catalogo.agregarProducto(new Producto("030", "Juego de mesa", "Juguetes", 30.00));

        // Mensaje de bienvenida en tres idiomas
        System.out.println("Bienvenido a CheemsMart");
        System.out.println("Welcome to CheemsMart");
        System.out.println("Bem-vindo ao CheemsMart");

        // Escáner para entrada de datos
        Scanner scanner = new Scanner(System.in);
        Cliente[] clientes = {clienteMexico, clienteUSA, clienteBrasil};

        // Validación de usuario
        Cliente clienteActual = null;
        while (clienteActual == null) {
            System.out.println("Por favor, introduce tu nombre de usuario:");
            String nombreUsuario = scanner.nextLine();

            // Buscar el cliente por nombre de usuario
            for (Cliente cliente : clientes) {
                if (cliente.getNombreUsuario().equals(nombreUsuario)) {
                    clienteActual = cliente;
                    break;
                }
            }

            if (clienteActual == null) {
                System.out.println("Usuario no encontrado. Intenta nuevamente.");
            }
        }

        // Validación de contraseña con 3 intentos
        int intentosRestantes = 3;
        boolean accesoConcedido = false;
        while (intentosRestantes > 0 && !accesoConcedido) {
            System.out.println("Por favor, introduce tu contraseña:");
            String contrasenia = scanner.nextLine();

            if (clienteActual.getContrasenia().equals(contrasenia)) {
                accesoConcedido = true;
                System.out.println("Acceso concedido. Bienvenido " + clienteActual.getNombre() + "!");
            } else {
                intentosRestantes--;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + intentosRestantes);
            }
        }

        if (!accesoConcedido) {
            System.out.println("Demasiados intentos fallidos. El programa se cerrará.");
            System.exit(0);
        }

        mostrarMenu(clienteActual, scanner);

    }

    // Método para mostrar el menú según el país del cliente
    public static void mostrarMenu(Cliente cliente, Scanner scanner) {
        System.out.println("Entr al menu");
        boolean salir = false;
        System.out.println(cliente.getPaisOrigen());
        System.out.println("Asigno el booleano de salir");
        while (!salir) {
            System.out.println("Entra al Switch");
            switch (cliente.getPaisOrigen()) {
                case "México":
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Consultar catálogo");
                    System.out.println("2. Revisar carrito de compras");
                    System.out.println("3. Revisar saldo");
                    System.out.println("4. Pagar");
                    System.out.println("5. Salir de la tienda");
                    break;
                case "EEUU":
                    System.out.println("Select an option:");
                    System.out.println("1. Browse catalog");
                    System.out.println("2. View shopping cart");
                    System.out.println("3. Check balance");
                    System.out.println("4. Pay");
                    System.out.println("5. Exit the store");
                    break;
                case "Brasil":
                    System.out.println("Selecione uma opção:");
                    System.out.println("1. Consultar catálogo");
                    System.out.println("2. Ver carrinho de compras");
                    System.out.println("3. Ver saldo");
                    System.out.println("4. Pagar");
                    System.out.println("5. Sair da loja");
                    break;
            }

            // Obtener la opción seleccionada
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Opción para consultar catálogo seleccionada.");
                    break;
                case "2":
                    System.out.println("Opción para revisar carrito de compras seleccionada.");
                    break;
                case "3":
                    System.out.println("Opción para revisar saldo seleccionada.");
                    System.out.println("Saldo disponible: $" + cliente.getSaldoDisponible());
                    break;
                case "4":
                    System.out.println("Opción para pagar seleccionada.");
                    break;
                case "5":
                    System.out.println("Gracias por visitar CheemsMart. ¡Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}
