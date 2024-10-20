import java.util.UUID;

/**
 * La clase Cliente representa un cliente en el sistema.
 * Contiene informacion personal del cliente, asi como metodos para manejar su saldo y autenticacion.
 * Provee funcionalidad para verificar credenciales y modificar el saldo disponible.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class Cliente {
    private String nombreUsuario;
    private String contrasenia;
    private String nombre;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private String paisOrigen;
    private double saldoDisponible;
    private String departamentoDesc;
    private UUID idUnico;

    /**
     * Constructor para inicializar un cliente con su informacion basica.
     * Genera un identificador unico para cada cliente.
     *
     * @param nombreUsuario    El nombre de usuario del cliente.
     * @param contrasenia      La contrasenia del cliente.
     * @param nombre           El nombre real del cliente.
     * @param telefono         El numero de telefono del cliente.
     * @param direccion        La direccion del cliente.
     * @param cuentaBancaria   El numero de cuenta bancaria del cliente.
     * @param paisOrigen       El pais de origen del cliente.
     * @param saldoInicial     El saldo inicial del cliente.
     * @param depDesc          El departamento donde aplica el descuento del cliente.
     */
    public Cliente(String nombreUsuario, String contrasenia, String nombre, String telefono, String direccion, String cuentaBancaria, String paisOrigen, double saldoInicial, String depDesc) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
        this.paisOrigen = paisOrigen;
        this.saldoDisponible = saldoInicial;
        this.departamentoDesc = depDesc;
        this.idUnico = UUID.randomUUID();
    }

    /**
     * Metodo para mostrar el usuario del cliente.
     *
     * @return Regresa un String con el usuario del cliente.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Metodo para asignar el usuario del cliente.
     *
     * @param nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Metodo para mostrar la contrasenia del cliente.
     *
     * @return Regresa un String con la contrasenia del cliente.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Metodo para asignar una contrasenia al cliente.
     *
     * @param contrasenia La contrasenia a asignar
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Metodo para obtener el nombre del cliente.
     *
     * @return Regresa un String con el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para asignar el nombre del cliente.
     *
     * @param nombre El nombre a asignar al cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el telefono del cliente.
     *
     * @return Regresa un String con el telefono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo para asignar un telefono al cliente.
     *
     * @param telefono El telefono a asignar al cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo para obtener el departamento al que aplica los descuentos.
     *
     * @return Regresa un String con el departamento al que le aplican los descuentos.
     */
    public String getDepartamentoDesc(){
        return departamentoDesc;
    }

    /**
     * Metodo para obtener la direccion del cliente.
     *
     * @return Regresa un String con la direccion del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo para asignar una direccion al cliente.
     *
     * @param direccion La direccion a asignar al cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo para obtener la cuenta bancaria del cliente.
     *
     * @return Regresa un String con la cuenta bancaria del cliente.
     */
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    /**
     * Metodo para asignar una cuenta bancaria al cliente.
     *
     * @param cuentaBancaria La cuenta bancaria que se asignara al cliente.
     */
    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    /**
     * Metodo para obtener el pais de origen del cliente.
     *
     * @return Regresa un String con el pais de origen del cliente.
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Metodo para asignar un pais de origen al cliente.
     *
     * @param paisOrigen El pais de origen que se le asignara al cliente.
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * Metodo para obtener el ID unico del cliente
     * @return Regresa un UUID unico del cliente.
     */
    public UUID getIdUnico() {
        return idUnico;
    }

    /**
     * Metodo para mostrar la informacion del cliente en pantalla.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Cuenta bancaria: " + cuentaBancaria);
        System.out.println("País de origen: " + paisOrigen);
    }

    /**
     * Metodo para verificar si las credenciales del cliente son correctas.
     *
     * @param nombreUsuario El nombre de usuario proporcionado.
     * @param contrasenia   La contrasenia proporcionada.
     * @return true si las credenciales son correctas, false en caso contrario.
     */
    public boolean autenticar(String nombreUsuario, String contrasenia) {
        return this.nombreUsuario.equals(nombreUsuario) && this.contrasenia.equals(contrasenia);
    }

    /**
     * Metodo para obtener el saldo disponible del cliente.
     *
     * @return El saldo disponible del cliente.
     */
    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    /**
     * Metodo para aumentar el saldo disponible del cliente.
     *
     * @param monto El monto que se desea agregar al saldo disponible.
     */
    public void aumentarSaldo(double monto) {
        if (monto > 0) {
            this.saldoDisponible += monto;
            System.out.println("Saldo aumentado en $" + monto + ". Saldo actual: $" + this.saldoDisponible);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    /**
     * Metodo para disminuir el saldo disponible del cliente.
     *
     * @param monto El monto que se desea restar del saldo disponible.
     * @return true si la operacion es exitosa, false si el saldo es insuficiente o el monto es invalido.
     */
    public boolean disminuirSaldo(double monto) {
        if (monto > 0 && this.saldoDisponible >= monto) {
            System.out.println(monto);
            this.saldoDisponible -= monto;
            System.out.println("Saldo disminuido en $" + monto + ". Saldo actual: $" + this.saldoDisponible);
            return true;
        } else {
            System.out.println("Saldo insuficiente o monto inválido.");
            return false;
        }
    }

}
