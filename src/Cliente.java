import java.util.UUID;

public class Cliente implements Observador {
    private String nombreUsuario;
    private String contraseña;
    private String nombre;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private String paisOrigen;
    private UUID idUnico;

    // Constructor
    public Cliente(String nombreUsuario, String contraseña, String nombre, String telefono, String direccion, String cuentaBancaria, String paisOrigen) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
        this.paisOrigen = paisOrigen;
        this.idUnico = UUID.randomUUID(); // Genera un ID único para el cliente
    }

    // Getters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
        return this.nombreUsuario.equals(nombreUsuario) && this.contraseña.equals(contraseña);
    }

    // Implementación del método de la interfaz Observador
    @Override
    public void actualizar(String mensajeOferta) {
        System.out.println(nombre + " ha recibido una nueva oferta: " + mensajeOferta);
    }

    // Otros métodos según sea necesario, como actualizar información, etc.
}
