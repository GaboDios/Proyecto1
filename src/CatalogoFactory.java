public class CatalogoFactory {

    // Método estático para crear y poblar un catálogo
    public static Catalogo crearCatalogo() {
        Catalogo catalogo = new Catalogo();

        // Agregar productos al catálogo

        // Electrónica
        catalogo.agregarProducto(new Producto("001", "Televisor", "Electrónica", 500.00));
        catalogo.agregarProducto(new Producto("002", "Smartphone", "Electrónica", 700.00));
        catalogo.agregarProducto(new Producto("003", "Laptop", "Electrónica", 900.00));
        catalogo.agregarProducto(new Producto("004", "Audífonos", "Electrónica", 50.00));
        catalogo.agregarProducto(new Producto("005", "Tablet", "Electrónica", 300.00));

        // Electrodomésticos
        catalogo.agregarProducto(new Producto("006", "Refrigerador", "Electrodoméstico", 1200.00));
        catalogo.agregarProducto(new Producto("007", "Lavadora", "Electrodoméstico", 800.00));
        catalogo.agregarProducto(new Producto("008", "Microondas", "Electrodoméstico", 150.00));
        catalogo.agregarProducto(new Producto("009", "Horno", "Electrodoméstico", 500.00));
        catalogo.agregarProducto(new Producto("010", "Aspiradora", "Electrodoméstico", 200.00));

        // Productos alimenticios
        catalogo.agregarProducto(new Producto("011", "Cereal", "Producto alimenticio", 5.00));
        catalogo.agregarProducto(new Producto("012", "Arroz", "Producto alimenticio", 2.00));
        catalogo.agregarProducto(new Producto("013", "Leche", "Producto alimenticio", 1.50));
        catalogo.agregarProducto(new Producto("014", "Pan", "Producto alimenticio", 1.00));
        catalogo.agregarProducto(new Producto("015", "Mantequilla", "Producto alimenticio", 3.00));

        // Ropa
        catalogo.agregarProducto(new Producto("016", "Camiseta", "Ropa", 20.00));
        catalogo.agregarProducto(new Producto("017", "Pantalón", "Ropa", 40.00));
        catalogo.agregarProducto(new Producto("018", "Chaqueta", "Ropa", 60.00));
        catalogo.agregarProducto(new Producto("019", "Zapatos", "Ropa", 80.00));
        catalogo.agregarProducto(new Producto("020", "Sombrero", "Ropa", 15.00));

        // Muebles
        catalogo.agregarProducto(new Producto("021", "Sofá", "Muebles", 400.00));
        catalogo.agregarProducto(new Producto("022", "Mesa", "Muebles", 150.00));
        catalogo.agregarProducto(new Producto("023", "Silla", "Muebles", 50.00));
        catalogo.agregarProducto(new Producto("024", "Cama", "Muebles", 300.00));
        catalogo.agregarProducto(new Producto("025", "Escritorio", "Muebles", 200.00));

        // Juguetes
        catalogo.agregarProducto(new Producto("026", "Pelota", "Juguetes", 10.00));
        catalogo.agregarProducto(new Producto("027", "Muñeca", "Juguetes", 25.00));
        catalogo.agregarProducto(new Producto("028", "Auto de juguete", "Juguetes", 15.00));
        catalogo.agregarProducto(new Producto("029", "Rompecabezas", "Juguetes", 8.00));
        catalogo.agregarProducto(new Producto("030", "Juego de mesa", "Juguetes", 30.00));

        return catalogo;
    }
}
