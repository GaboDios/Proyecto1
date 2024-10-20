import java.util.ArrayList;
import java.util.List;

/**
 * La clase ClienteFactoryManager es responsable de gestionar la creacion de clientes para diferentes paises.
 * Utiliza las diferentes implementaciones de ClienteFactory para crear clientes especificos
 * para Mexico, Estados Unidos, y Brasil.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class ClienteFactoryManager {

    /**
     * Metodo estatico que crea una lista de clientes utilizando las fabricas de clientes
     * correspondientes a cada pais. Cada cliente es creado con informacion predefinida
     * y se agrega a una lista que es devuelta al final.
     *
     * @return Una lista de objetos Cliente creados para diferentes paises.
     */
    public static List<Cliente> crearClientes() {
        List<Cliente> clientes = new ArrayList<>();

        ClienteFactory mexicoFactory = new ClienteMexicoFactory();
        Cliente clienteMexico = mexicoFactory.crearCliente(
                "JuanPerez",
                "37RZ80",
                "Juan Perez",
                "5551234567",
                "Calle Reforma 100, Ciudad de Mexico",
                "370467798034",
                10000.00
        );
        clientes.add(clienteMexico);

        ClienteFactory usaFactory = new ClienteEEUUFactory();
        Cliente clienteUSA = usaFactory.crearCliente(
                "JohnSmith",
                "62A4X9",
                "John Smith",
                "5552345678",
                "123 Main St, New York",
                "370467798034",
                20000.00
        );
        clientes.add(clienteUSA);

        ClienteFactory brasilFactory = new ClienteBrasilFactory();
        Cliente clienteBrasil = brasilFactory.crearCliente(
                "RafaelaSantos",
                "J7O78E",
                "Rafaela Santos",
                "5553456789",
                "Rua da Liberdade 200, Sao Paulo",
                "715203160157",
                15000.00
        );
        clientes.add(clienteBrasil);

        return clientes;
    }
}
