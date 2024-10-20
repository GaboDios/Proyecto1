import java.util.UUID;

public class Cliente implements Observador {
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

    // Constructor
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
        this.idUnico = UUID.randomUUID(); // Genera un ID único para el cliente
    }

    // Getters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDepartamentoDesc(){
        return departamentoDesc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public UUID getIdUnico() {
        return idUnico;
    }

    // Método para mostrar información del cliente (por ejemplo, en la vista)
    public void mostrarInformacion() {
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Cuenta bancaria: " + cuentaBancaria);
        System.out.println("País de origen: " + paisOrigen);
    }

    // Método para verificar si las credenciales son correctas
    public boolean autenticar(String nombreUsuario, String contraseña) {
        return this.nombreUsuario.equals(nombreUsuario) && this.contrasenia.equals(contraseña);
    }

    // Implementación del método de la interfaz Observador
    @Override
    public void actualizar(String mensajeOferta) {
        System.out.println(nombre + " ha recibido una nueva oferta: " + mensajeOferta);
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void aumentarSaldo(double monto) {
        if (monto > 0) {
            this.saldoDisponible += monto;
            System.out.println("Saldo aumentado en $" + monto + ". Saldo actual: $" + this.saldoDisponible);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

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
