public class Log{
    String temporal;
    public void verificarUsuario(Usuario usuario){
	temporal = usuario.getNombreUsuario();
	
    }
    public void verificarContrasena(Usuario usuario){
	temporal = usuario.getContrasena();
    }
    
    public void verificarOrigen(Usuario usuario){
	temporal = usuario.getPaisOrigen();	
    }
}
