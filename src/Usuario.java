public class Usuario {

    // Atributos
    private String nombreUsuario;
    private String contrasena;
    private String nombre;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private String paisOrigen;

    //Implementacion Oberver
    public Double notificacion;
    public Descuentos descuentos;
    
    // Constructor vacío
    public Usuario() {
    }

    // Constructor con todos los atributos
    public Usuario(String nombreUsuario, String contrasena, String nombre, String telefono, String direccion, String cuentaBancaria, String paisOrigen, Descuentos descuentos) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
        this.paisOrigen = paisOrigen;
	this.descuentos = descuentos;
        notificacion = descuentos.getDescuento();
	
    }

    //falta implementar metodo notificar para Obeserver

    public void actualizarDescuento(){
	notificacion = descuentos.getDescuento();
    }

    public void mostrarDescuento(){
	//colocar a que departamento corresponde el descuento dependiendo del origen del usuario
	System.out.println("!felicidades tienes un descuento en:" + "del "+ notificacion);
	
    }

    
    // Métodos Get y Set
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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
}
