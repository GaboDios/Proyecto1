/**
 * Clase que representa un producto en el sistema. Un producto tiene un codigo de barras,
 * nombre, departamento al que pertenece y su precio.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class Producto {
    private String codigoBarras;
    private String nombre;
    private String departamento;
    private double precio;

    /**
     * Constructor de la clase Producto. Inicializa el producto con los valores proporcionados.
     *
     * @param codigoBarras El codigo de barras del producto.
     * @param nombre El nombre del producto.
     * @param departamento El departamento al que pertenece el producto.
     * @param precio El precio del producto.
     */
    public Producto(String codigoBarras, String nombre, String departamento, double precio) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.departamento = departamento;
        this.precio = precio;
    }

    /**
     * Obtiene el codigo de barras del producto.
     *
     * @return El codigo de barras del producto.
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Establece un nuevo codigo de barras para el producto.
     *
     * @param codigoBarras El nuevo codigo de barras del producto.
     */
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el producto.
     *
     * @param nombre El nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el departamento al que pertenece el producto.
     *
     * @return El departamento del producto.
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Establece un nuevo departamento para el producto.
     *
     * @param departamento El nuevo departamento del producto.
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece un nuevo precio para el producto.
     *
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Muestra los detalles del producto, incluyendo su nombre, codigo de barras,
     * departamento y precio.
     */
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Codigo de Barras: " + codigoBarras);
        System.out.println("Departamento: " + departamento);
        System.out.println("Precio: $" + precio);
    }
}
