package modelo;

public class Cliente {

	private String numero;
	private String nombre;
	
	
	public Cliente(String numero, String nombre) {
		super();
		this.numero = numero;
		this.nombre = nombre;
	}


	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Cliente [numero=" + numero + ", nombre=" + nombre + "]";
	}

}
