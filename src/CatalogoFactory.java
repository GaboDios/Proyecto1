/**
 * La clase CatalogoFactory es responsable de crear y poblar un catalogo de productos.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class CatalogoFactory {

    /**
     * Metodo estatico para poblar un catalogo con productos.
     * Agrega productos a diferentes departamentos como Electronica, Electrodomesticos, Productos alimenticios, Ropa, Muebles, y Juguetes.
     *
     * @param catalogo El catalogo que se desea poblar con productos.
     * @return El catalogo poblado con productos.
     */
    public static Catalogo poblarCatalogo(Catalogo catalogo) {
        catalogo.agregarProducto(new Producto("001", "Televisor", "Electronica", 500.00));
        catalogo.agregarProducto(new Producto("002", "Smartphone", "Electronica", 700.00));
        catalogo.agregarProducto(new Producto("003", "Laptop", "Electronica", 900.00));
        catalogo.agregarProducto(new Producto("004", "Audifonos", "Electronica", 50.00));
        catalogo.agregarProducto(new Producto("005", "Tablet", "Electronica", 300.00));

        catalogo.agregarProducto(new Producto("006", "Refrigerador", "Electrodomestico", 1200.00));
        catalogo.agregarProducto(new Producto("007", "Lavadora", "Electrodomestico", 800.00));
        catalogo.agregarProducto(new Producto("008", "Microondas", "Electrodomestico", 150.00));
        catalogo.agregarProducto(new Producto("009", "Horno", "Electrodomestico", 500.00));
        catalogo.agregarProducto(new Producto("010", "Aspiradora", "Electrodomestico", 200.00));

        catalogo.agregarProducto(new Producto("011", "Cereal", "Alimentos", 50.00));
        catalogo.agregarProducto(new Producto("012", "Arroz", "Alimentos", 20.00));
        catalogo.agregarProducto(new Producto("013", "Leche", "Alimentos", 10.50));
        catalogo.agregarProducto(new Producto("014", "Pan", "Alimentos", 10.00));
        catalogo.agregarProducto(new Producto("015", "Mantequilla", "Alimentos", 30.00));

        catalogo.agregarProducto(new Producto("016", "Camiseta", "Ropa", 60.00));
        catalogo.agregarProducto(new Producto("017", "Pantalon", "Ropa", 70.00));
        catalogo.agregarProducto(new Producto("018", "Chaqueta", "Ropa", 80.00));
        catalogo.agregarProducto(new Producto("019", "Zapatos", "Ropa", 90.00));
        catalogo.agregarProducto(new Producto("020", "Sombrero", "Ropa", 40.00));

        catalogo.agregarProducto(new Producto("021", "Sofa", "Muebles", 400.00));
        catalogo.agregarProducto(new Producto("022", "Mesa", "Muebles", 1500.00));
        catalogo.agregarProducto(new Producto("023", "Silla", "Muebles", 500.00));
        catalogo.agregarProducto(new Producto("024", "Cama", "Muebles", 300.00));
        catalogo.agregarProducto(new Producto("025", "Escritorio", "Muebles", 200.00));

        catalogo.agregarProducto(new Producto("026", "Pelota", "Juguetes", 10.00));
        catalogo.agregarProducto(new Producto("027", "Munieca", "Juguetes", 25.00));
        catalogo.agregarProducto(new Producto("028", "Auto de juguete", "Juguetes", 15.00));
        catalogo.agregarProducto(new Producto("029", "Rompecabezas", "Juguetes", 8.00));
        catalogo.agregarProducto(new Producto("030", "Juego de mesa", "Juguetes", 30.00));

        return catalogo;
    }
}
