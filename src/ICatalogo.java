import java.util.List;
import java.util.Set;

public interface ICatalogo {
    void agregarProducto(Producto producto);
    void eliminarProducto(Producto producto);
    List<Producto> obtenerProductos();
    Producto buscarProductoPorCodigo(String codigoBarras);
    Set<String> obtenerDepartamentos();
    List<Producto> obtenerProductosPorDepartamento(String departamento);
}
