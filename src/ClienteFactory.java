/**
 * La clase abstracta ClienteFactory define el metodo para crear instancias de la clase Cliente.
 * Las subclases deben implementar este metodo para proporcionar implementaciones especificas
 * segun el tipo de cliente que se desee crear.
 * Este enfoque sigue el patron Factory, permitiendo la creacion de objetos Cliente con diferentes configuraciones.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public abstract class ClienteFactory {
    /**
     * Metodo abstracto que las subclases deben implementar para crear un cliente con la informacion proporcionada.
     * Cada subclase de ClienteFactory implementara este metodo con las configuraciones especificas para diferentes paises o regiones.
     *
     * @param nombreUsuario   El nombre de usuario del cliente.
     * @param contrasenia     La contrasenia del cliente.
     * @param nombre          El nombre real del cliente.
     * @param telefono        El numero de telefono del cliente.
     * @param direccion       La direccion del cliente.
     * @param cuentaBancaria  El numero de cuenta bancaria del cliente.
     * @param saldoInicial    El saldo inicial con el que comienza el cliente.
     * @return Un objeto Cliente creado segun la implementacion especifica de la subclase.
     */
    public abstract Cliente crearCliente(String nombreUsuario, String contrasenia, String nombre, String telefono, String direccion, String cuentaBancaria, double saldoInicial);
}



