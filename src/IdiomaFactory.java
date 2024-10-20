/**
 * La clase IdiomaFactory es responsable de devolver una estrategia de idioma basada en el pais de origen del cliente.
 * Esta fabrica sigue el patron Factory, permitiendo seleccionar dinamicamente la implementacion de IdiomaStrategy
 * que se utilizara en el sistema.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class IdiomaFactory {

    /**
     * Devuelve una instancia de IdiomaStrategy segun el pais de origen proporcionado.
     * La implementacion por defecto en espanol en caso de que el pais no sea reconocido o es Mexico.
     *
     * @param paisOrigen El pais de origen del cliente.
     * @return Una implementacion de IdiomaStrategy correspondiente al pais de origen.
     *         Por defecto devuelve IdiomaEspanolStrategy si el pais no es reconocido o es Mexico.
     */
    public static IdiomaStrategy obtenerIdioma(String paisOrigen) {
        switch (paisOrigen) {
            case "EEUU":
                return new IdiomaInglesStrategy();
            case "Brasil":
                return new IdiomaPortuguesStrategy();
            default:
                return new IdiomaEspanolStrategy();
        }
    }
}
