public class ClienteView {
    // Método para mostrar los detalles del cliente
    public void mostrarDetallesCliente(Cliente cliente) {
        System.out.println("Detalles del Cliente:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Cuenta Bancaria: " + cliente.getCuentaBancaria());
        System.out.println("País de Origen: " + cliente.getPaisOrigen());
    }
}
