import java.util.ArrayList;
import java.util.List;

public class ClienteFactoryManager {

    // Método para crear los clientes de diferentes países
    public static List<Cliente> crearClientes() {
        List<Cliente> clientes = new ArrayList<>();

        // Cliente de México
        ClienteFactory mexicoFactory = new ClienteMexicoFactory();
        Cliente clienteMexico = mexicoFactory.crearCliente(
                "JuanPerez",
                "37RZ80",
                "Juan Perez",
                "5551234567",
                "Calle Reforma 100, Ciudad de México",
                "370467798034",
                10000.00
        );
        clientes.add(clienteMexico);

        // Cliente de Estados Unidos
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

        // Cliente de Brasil
        ClienteFactory brasilFactory = new ClienteBrasilFactory();
        Cliente clienteBrasil = brasilFactory.crearCliente(
                "RafaelaSantos",
                "J7O78E",
                "Rafaela Santos",
                "5553456789",
                "Rua da Liberdade 200, São Paulo",
                "715203160157",
                15000.00
        );
        clientes.add(clienteBrasil);

        return clientes;
    }
}
