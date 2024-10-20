import java.util.List;
import java.util.Set;
/**
 * La interfaz ICatalogo define los metodos que deben implementar las clases que representen un catalogo de productos.
 * Proporciona funcionalidades basicas como agregar, eliminar, buscar productos y obtener informacion del catalogo
 * segun diferentes criterios, como departamentos y codigo de barras.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public interface ICatalogo {
    /**
     * Agrega un producto al catalogo.
     *
     * @param producto El producto que se desea agregar al catalogo.
     */
    void agregarProducto(Producto producto);

    /**
     * Elimina un producto del catalogo.
     *
     * @param producto El producto que se desea eliminar del catalogo.
     */
    void eliminarProducto(Producto producto);

    /**
     * Devuelve una lista de todos los productos en el catalogo.
     *
     * @return Una lista de productos disponibles en el catalogo.
     */
    List<Producto> obtenerProductos();

    /**
     * Busca un producto en el catalogo utilizando su codigo de barras.
     *
     * @param codigoBarras El codigo de barras del producto que se desea buscar.
     * @return El producto correspondiente al codigo de barras, o null si no se encuentra.
     */
    Producto buscarProductoPorCodigo(String codigoBarras);

    /**
     * Devuelve un conjunto de todos los departamentos unicos en el catalogo.
     *
     * @return Un conjunto de nombres de departamentos sin duplicados.
     */
    Set<String> obtenerDepartamentos();

    /**
     * Devuelve una lista de productos que pertenecen a un departamento especifico.
     *
     * @param departamento El nombre del departamento del cual se desea obtener los productos.
     * @return Una lista de productos que pertenecen al departamento especificado.
     */
    List<Producto> obtenerProductosPorDepartamento(String departamento);
}
