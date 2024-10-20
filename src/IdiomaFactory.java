public class IdiomaFactory {

    public static IdiomaStrategy obtenerIdioma(String paisOrigen) {
        switch (paisOrigen) {
            case "México":
                return new IdiomaEspanolStrategy();
            case "EEUU":
                return new IdiomaInglesStrategy();
            case "Brasil":
                return new IdiomaPortuguesStrategy();
            default:
                return new IdiomaEspanolStrategy(); // Default a español si no se reconoce el país
        }
    }
}
