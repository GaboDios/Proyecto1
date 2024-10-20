/**
 * La clase ClienteMexicoFactory es una implementacion concreta de la clase abstracta ClienteFactory.
 * Esta clase se encarga de crear instancias de Cliente especificas para clientes de Mexico.
 * Los clientes creados por esta fabrica tienen su pais de origen predefinido como "Mexico" y
 * su departamento de descuento predefinido como "Electrodomesticos".
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class ClienteMexicoFactory extends ClienteFactory {
    /**
     * Metodo sobrescrito de ClienteFactory que crea un nuevo cliente con la informacion proporcionada.
     * El pais de origen del cliente se establece como "Mexico" y el departamento de descuento se establece en "Electrodomesticos".
     *
     * @param nombreUsuario   El nombre de usuario del cliente.
     * @param contrasenia     La contrasenia del cliente.
     * @param nombre          El nombre real del cliente.
     * @param telefono        El numero de telefono del cliente.
     * @param direccion       La direccion del cliente.
     * @param cuentaBancaria  El numero de cuenta bancaria del cliente.
     * @param saldoInicial    El saldo inicial con el que comienza el cliente.
     * @return Un objeto Cliente con la informacion proporcionada y con el pais de origen y el departamento de descuento predefinidos para Mexico.
     */
    @Override
    public Cliente crearCliente(String nombreUsuario, String contrasenia, String nombre, String telefono, String direccion, String cuentaBancaria, double saldoInicial) {
        return new Cliente(nombreUsuario, contrasenia, nombre, telefono, direccion, cuentaBancaria, "Mexico", saldoInicial, "Electrodomesticos");
    }
}