public class Producto {

    // Atributos
    private String nombre;
    private String codigoBarras;
    private String departamento;
    private double precio;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con todos los atributos
    public Producto(String nombre, String codigoBarras, String departamento, double precio) {
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.departamento = departamento;
        this.precio = precio;
    }

    // Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
