import java.util.List;
import java.util.Set;
import java.util.Random;
import java.util.Scanner;

public class CheemsMart {

    public static void main(String[] args) {
        CatalogoProxy catalogoProxy = new CatalogoProxy();

        List<Cliente> clientes = ClienteFactoryManager.crearClientes();

        Scanner scanner = new Scanner(System.in);

        Cliente clienteActual = null;
        CarritoCompras carritoCompras = new CarritoCompras();
        String nombreUsuario = null;
        IdiomaStrategy idioma = new IdiomaEspanolStrategy();

        idioma.imprimirBienvenida();

        while (clienteActual == null) {
            idioma.imprimirMensajeUsuario();
            nombreUsuario = scanner.nextLine();

            for (Cliente cliente : clientes) {
                if (cliente.getNombreUsuario().equals(nombreUsuario)) {
                    clienteActual = cliente;
                    break;
                }
            }

            if (clienteActual == null) {
                idioma.imprimirMensajeUsuarioNoEncontrado();
            }
        }

        idioma = IdiomaFactory.obtenerIdioma(clienteActual.getPaisOrigen());

        int intentosRestantes = 3;
        boolean accesoConcedido = false;
        String contrasenia = null;

        while (intentosRestantes > 0 && !accesoConcedido) {
            idioma.imprimirMensajeContrasenia();
            contrasenia = scanner.nextLine();

            if (clienteActual.getContrasenia().equals(contrasenia)) {
                accesoConcedido = true;
                idioma.imprimirMensajeAccesoConcedido(clienteActual.getNombre());
            } else {
                intentosRestantes--;
                idioma.imprimirMensajeContraseniaIncorrecta(intentosRestantes);
            }
        }

        if (!accesoConcedido) {
            idioma.imprimirMensajeIntentosFallidos();
            System.exit(0);
        }

        catalogoProxy.autenticar(clienteActual, nombreUsuario, contrasenia);

        Random random = new Random();
        int tieneDescuento = random.nextInt(2); // 0 o 1
        double cantidadDescuento;

        if (tieneDescuento == 1) {
            cantidadDescuento = 0.05 + (0.75 - 0.05) * random.nextDouble(); // Descuento entre 0.05 y 0.75
            idioma.imprimirMensajeDescuento(cantidadDescuento, clienteActual.getDepartamentoDesc());
        } else {
            cantidadDescuento = 1;
            idioma.imprimirMensajeSinDescuento();
        }

        boolean salir = false;

        while (!salir) {
            idioma.imprimirMenuOpciones();
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    idioma.imprimirMensajeAgregarCarrito();
                    if (catalogoProxy.obtenerDepartamentos() != null) {
                        Set<String> departamentos = catalogoProxy.obtenerDepartamentos();
                        idioma.departamentosDisponibles();
                        int i = 1;
                        for (String departamento : departamentos) {
                            System.out.println(i + ". " + departamento);
                            i++;
                        }

                        idioma.seleccionarDepartamento();
                        int seleccionDepartamento = Integer.parseInt(scanner.nextLine());

                        // Obtener la lista de productos de ese departamento
                        String departamentoSeleccionado = (String) departamentos.toArray()[seleccionDepartamento - 1];
                        List<Producto> productosDepartamento = catalogoProxy.obtenerProductosPorDepartamento(departamentoSeleccionado);

                        idioma.productosEnDepartamentoSelec(departamentoSeleccionado);
                        for (Producto producto : productosDepartamento) {
                            System.out.println("Codigo de Barras: " + producto.getCodigoBarras() + ", Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
                        }
                    }
                    break;

                case "2":
                    idioma.imprimirMensajeAgregarCarrito();
                    idioma.ingresarCodigoDeBarras();
                    String codigoBarras = scanner.nextLine().trim();

                    Producto producto = catalogoProxy.buscarProductoPorCodigo(codigoBarras);

                    if (producto != null) {
                        carritoCompras.agregarProducto(producto);
                    } else {
                        idioma.imprimirMensajeCodigoNoValido();
                    }
                    break;

                case "3":
                    idioma.imprimirMensajeRevisarCarrito();
                    if (carritoCompras.obtenerProductos().isEmpty()) {
                        idioma.elCarritoEstaVacio();
                    } else {
                        idioma.productosEnCarrito();
                        for (Producto productoCarrito : carritoCompras) {
                            double precioOriginal = productoCarrito.getPrecio();
                            double precioConDescuento = precioOriginal;

                            if (cantidadDescuento != 1) {
                                precioConDescuento = Math.round((precioOriginal * (1 - cantidadDescuento)) * 100.0) / 100.0;
                            }

                            idioma.informacionProducto(productoCarrito.getCodigoBarras(),productoCarrito.getNombre(),precioOriginal,cantidadDescuento,precioConDescuento);
                        }
                        idioma.totalAPagar(carritoCompras.calcularTotal());
                    }
                    break;

                case "4":
                    idioma.imprimirMensajeSaldoDisponible(clienteActual.getSaldoDisponible());
                    break;

                case "5":
                    int intentosCuenta = 3;
                    boolean cuentaValida = false;

                    while (intentosCuenta > 0 && !cuentaValida) {
                        idioma.ingresarCuentaBancaria();
                        String cuentaIngresada = scanner.nextLine();

                        if (clienteActual.getCuentaBancaria().equals(cuentaIngresada)) {
                            cuentaValida = true;
                            idioma.cuentaVerificada();
                        } else {
                            intentosCuenta--;
                            idioma.cuentaIncorrecta(intentosCuenta);
                        }
                    }

                    if (!cuentaValida) {
                        idioma.tarjetaBloqueada();
                        System.exit(0);
                    }

                    double totalCarritoConDescuento = 0.0;
                    for (Producto productoCarrito : carritoCompras) {
                        double precioOriginal = productoCarrito.getPrecio();
                        double precioConDescuento = precioOriginal;

                        if (cantidadDescuento != 1) {
                            precioConDescuento = Math.round((precioOriginal * (1 - cantidadDescuento)) * 100.0) / 100.0;
                        }

                        totalCarritoConDescuento += precioConDescuento;
                    }

                    idioma.totalPagarNeto(totalCarritoConDescuento);

                    if (clienteActual.getSaldoDisponible() >= totalCarritoConDescuento) {
                        clienteActual.disminuirSaldo(totalCarritoConDescuento);
                        idioma.pagoRealizado(clienteActual.getSaldoDisponible());
                        carritoCompras.vaciarCarrito();
                        idioma.tiempoDeEntrega(clienteActual.getDireccion());
                    } else {
                        idioma.saldoInsuficiente();
                    }
                    break;

                case "6":
                    idioma.imprimirMensajeDespedida();
                    salir = true;
                    break;

                default:
                    idioma.imprimirMensajeCodigoNoValido();
                    break;
            }
        }
    }

}
