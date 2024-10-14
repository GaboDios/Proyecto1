public class Producto {
    private String codigoBarras;
    private String nombre;
    private String departamento;
    private double precio;

    // Constructor
    public Producto(String codigoBarras, String nombre, String departamento, double precio) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.departamento = departamento;
        this.precio = precio;
    }

    // Getters y Setters
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    // Método para mostrar los detalles del producto
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Código de Barras: " + codigoBarras);
        System.out.println("Departamento: " + departamento);
        System.out.println("Precio: $" + precio);
    }
}
