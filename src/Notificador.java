import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private List<Observador> observadores; // Lista de clientes suscritos

    // Constructor
    public Notificador() {
        this.observadores = new ArrayList<>();
    }

    // Método para agregar un observador (suscribir un cliente)
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
        System.out.println("Cliente suscrito a notificaciones.");
    }

    // Método para eliminar un observador (desuscribir un cliente)
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
        System.out.println("Cliente desuscrito de notificaciones.");
    }

    // Método para notificar a todos los observadores sobre una nueva oferta
    public void notificarObservadores(String mensajeOferta) {
        for (Observador observador : observadores) {
            observador.actualizar(mensajeOferta);
        }
    }
}
