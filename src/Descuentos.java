import java.util.Random;
import java.util.LinkedList;

public class Descuentos{
    double descuento = 0;
    LinkedList<Usuario> usuarios = new LinkedList<Usuario>(); 

    public void aplicarDescuentos(Producto producto){
	//Delimitar random para descuentos del 25, 50, 75%
	Random random1 = new Random();
	int descuento1 = random1.nextInt(3);
	if(descuento1 == 25){
	    descuento =  25;
       	}else if(descuento1 == 50){
	    descuento = 50;
       	}else{
	    descuento = 75;
	}
    }

    public LinkedList<Usuario> getUsuario(){
	return usuarios;
    }

    public Double getDescuento(){
	return descuento;
    }

    public void setCantidadDeDescuento(double descuento){
	this.descuento = descuento;
    }

    public void notificarUsuario(){
	if(usuarios.size()>0){
	    System.out.println("Tienes un descuento del" + descuento + "%");
	    for(Usuario us: usuarios){
		//Falta colocar metodo actualizar en usuario
		us.actualizarDescuento();
	    }
	}
    }

    public void removerUsuario(Usuario usuario){
	System.out.println("El usuariio" + usuario.getNombre() + "ha sido removido de la notificacion de descuentos");
    }

    public void registrarUsuario(Usuario usuario){
	usuarios.add(usuario);
	System.out.println("El usuariio" + usuario.getNombre() + "ha sido registrado para recibir notificacion");

    }       
}
