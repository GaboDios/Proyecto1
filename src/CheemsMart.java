import com.sun.tools.jconsole.JConsoleContext;

import java.util.List;
import java.util.Set;
import java.util.Random;
import java.util.Scanner;

public class CheemsMart {

    // Método main
    public static void main(String[] args) {
        // Se inicializa el proxy
        CatalogoProxy catalogoProxy = new CatalogoProxy(crearCatalogo());
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

        // Mensaje de bienvenida en tres idiomas
        System.out.println("Bienvenido a CheemsMart");
        System.out.println("Welcome to CheemsMart");
        System.out.println("Bem-vindo ao CheemsMart");

        // Escáner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        Cliente[] clientes = {clienteMexico, clienteUSA, clienteBrasil};

        // Validación de usuario
        Cliente clienteActual = null;
        CarritoCompras carritoCompras = new CarritoCompras();
        String nombreUsuario = null;
        while (clienteActual == null) {
            System.out.println("Por favor, introduce tu nombre de usuario:");
            nombreUsuario = scanner.nextLine();

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
        String contrasenia = null;
        while (intentosRestantes > 0 && !accesoConcedido) {
            System.out.println("Por favor, introduce tu contraseña:");
            contrasenia = scanner.nextLine();

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
        catalogoProxy.autenticar(clienteActual,nombreUsuario,contrasenia);

        Random random = new Random();
        int tieneDescuento = random.nextInt(2); // 0 o 1
        double cantidadDescuento;

        if (tieneDescuento == 1) {
            cantidadDescuento = 0.05 + (0.75 - 0.05) * random.nextDouble(); // Descuento entre 0.05 y 0.75
            System.out.println("Felicidades, tienes un descuento del " + (int)(cantidadDescuento * 100) + "% en " + clienteActual.getDepartamentoDesc()+".");
        } else {
            cantidadDescuento = 1; // Sin descuento
            System.out.println("No tienes descuento en esta ocasión.");
        }

        boolean salir = false;

        while (!salir) {
            switch (clienteActual.getPaisOrigen()) {
                case "México":
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Consultar catálogo");
                    System.out.println("2. Agregar al carrito de compras");
                    System.out.println("3. Revisar el carrito de compras");
                    System.out.println("4. Revisar saldo");
                    System.out.println("5. Pagar");
                    System.out.println("6. Salir de la tienda");
                    break;
                case "EEUU":
                    System.out.println("Select an option:");
                    System.out.println("1. Browse catalog");
                    System.out.println("2. Add to shopping cart");
                    System.out.println("3. View shopping cart");
                    System.out.println("4. Check balance");
                    System.out.println("5. Pay");
                    System.out.println("6. Exit the store");
                    break;
                case "Brasil":
                    System.out.println("Selecione uma opção:");
                    System.out.println("1. Consultar catálogo");
                    System.out.println("2. Adicionar ao carrinho de compras");
                    System.out.println("3. Ver carrinho de compras");
                    System.out.println("4. Ver saldo");
                    System.out.println("5. Pagar");
                    System.out.println("6. Sair da loja");
                    break;
            }

            // Obtener la opción seleccionada
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Opción para consultar catálogo seleccionada.");
                    if (catalogoProxy.obtenerDepartamentos() != null) {
                        Set<String> departamentos = catalogoProxy.obtenerDepartamentos();
                        System.out.println("Departamentos disponibles:");
                        int i = 1;
                        for (String departamento : departamentos) {
                            System.out.println(i + ". " + departamento);
                            i++;
                        }

                        // Seleccionar un departamento
                        System.out.println("Seleccione un departamento:");
                        int seleccionDepartamento = Integer.parseInt(scanner.nextLine());

                        // Obtener la lista de productos de ese departamento
                        String departamentoSeleccionado = (String) departamentos.toArray()[seleccionDepartamento - 1];
                        List<Producto> productosDepartamento = catalogoProxy.obtenerProductosPorDepartamento(departamentoSeleccionado);

                        System.out.println("Productos en el departamento de " + departamentoSeleccionado + ":");
                        for (Producto producto : productosDepartamento) {
                            System.out.println("Código de Barras: " + producto.getCodigoBarras() + ", Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
                        }
                    }
                    break;
                case "2":
                    System.out.println("Opción para agregar al carrito de compras seleccionada.");

                    // Ingresar código de barras para agregar productos
                    System.out.println("Por favor, ingrese el código de barras del producto que desea agregar al carrito:");
                    String codigoBarras = scanner.nextLine().trim(); // Asegúrate de eliminar espacios en blanco

                    // Buscar el producto en el catálogo
                    Producto producto = catalogoProxy.buscarProductoPorCodigo(codigoBarras);

                    // Verificar si el producto existe
                    if (producto != null) {
                        carritoCompras.agregarProducto(producto); // Agregar producto al carrito
                    } else {
                        System.out.println("El código de barras no concuerda con ningún artículo.");
                    }
                    break;
                case "3":
                    System.out.println("Opción para revisar el carrito de compras seleccionada.");

                    if (carritoCompras.obtenerProductos().isEmpty()) {
                        System.out.println("El carrito está vacío.");
                    } else {
                        System.out.println("Productos en el carrito:");
                        for (Producto productoCarrito : carritoCompras.obtenerProductos()) {
                            double precioOriginal = productoCarrito.getPrecio();
                            double precioConDescuento = precioOriginal;

                            // Aplicar el descuento si es necesario
                            if (cantidadDescuento != 1) { // Si hay un descuento aplicado
                                precioConDescuento = precioOriginal * (1-cantidadDescuento);
                            }

                            // Mostrar la información del producto
                            System.out.println("Código de Barras: " + productoCarrito.getCodigoBarras() +
                                    ", Artículo: " + productoCarrito.getNombre() +
                                    ", Precio Original: $" + precioOriginal +
                                    (cantidadDescuento != 1 ? ", Precio con Descuento: $" + precioConDescuento : ""));
                        }
                        System.out.println("Total a pagar (sin descuento aplicado a todo): $" + carritoCompras.calcularTotal());
                    }
                    break;
                case "4":
                    System.out.println("Opción para revisar saldo seleccionada.");
                    System.out.println("Saldo disponible: $" + clienteActual.getSaldoDisponible());
                    break;
                case "5":
                    System.out.println("Opción para pagar seleccionada.");

                    // Solicitar la cuenta bancaria para proceder con el pago
                    int intentosCuenta = 3;
                    boolean cuentaValida = false;

                    while (intentosCuenta > 0 && !cuentaValida) {
                        System.out.println("Por favor, ingrese su número de cuenta bancaria para realizar el pago:");
                        String cuentaIngresada = scanner.nextLine();

                        if (clienteActual.getCuentaBancaria().equals(cuentaIngresada)) {
                            cuentaValida = true;
                            System.out.println("Cuenta bancaria verificada con éxito.");
                        } else {
                            intentosCuenta--;
                            System.out.println("Número de cuenta incorrecto. Intentos restantes: " + intentosCuenta);
                        }
                    }

                    if (!cuentaValida) {
                        System.out.println("Tarjeta bloqueada. Se ha excedido el número de intentos. Saliendo de la tienda...");
                        System.exit(0); // Salir del programa
                    }

                    // Calcular el total del carrito con descuentos aplicados
                    double totalCarritoConDescuento = 0.0;
                    for (Producto productoCarrito : carritoCompras.obtenerProductos()) {
                        double precioOriginal = productoCarrito.getPrecio();
                        double precioConDescuento = precioOriginal;

                        // Aplicar el descuento si es necesario
                        if (cantidadDescuento != 1) { // Si hay un descuento aplicado
                            precioConDescuento = Math.round((precioOriginal * (1 -cantidadDescuento))*100.0)/100.0;
                        }

                        totalCarritoConDescuento += precioConDescuento;
                    }

                    // Mostrar el total a pagar
                    System.out.println("Total a pagar: $" + totalCarritoConDescuento);

                    // Verificar si el cliente tiene suficiente saldo
                    if (clienteActual.getSaldoDisponible() >= totalCarritoConDescuento) {
                        // Resta el total del saldo disponible del cliente
                        clienteActual.disminuirSaldo(totalCarritoConDescuento);
                        System.out.println("Pago realizado con éxito. Su nuevo saldo disponible es: $" + clienteActual.getSaldoDisponible());

                        // Vaciar el carrito de compras
                        carritoCompras.vaciarCarrito();
                    } else {
                        // No hay suficiente saldo, no se puede realizar el pago
                        System.out.println("Saldo insuficiente. No se puede realizar el pago.");
                    }
                    break;
                case "6":
                    switch (clienteActual.getPaisOrigen()) {
                        case "EEUU":
                            System.out.println("Thank you for visiting CheemsMart. See you soon!");
                            break;
                        case "Brasil":
                            System.out.println("Obrigado por visitar CheemsMart. Até breve!");
                            break;
                        default:
                            System.out.println("Gracias por visitar CheemsMart. ¡Hasta pronto!");
                            break;
                    }
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }

    }

    public static Catalogo crearCatalogo() {
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

        return catalogo;
    }

    // Método para obtener la estrategia de descuento según el país
    public static DescuentoStrategy obtenerDescuentoStrategy(String paisOrigen) {
        switch (paisOrigen) {
            case "México":
                return new DescuentoMexico();
            case "Brasil":
                return new DescuentoBrasil();
            case "Estados Unidos":
                return new DescuentoEEUU();
            default:
                return null;
        }
    }

}
