package modelo;

public class DatosCliente {
	private Cliente cliente;
	private long entrada, salida;

	public DatosCliente(Cliente c) {
		this.cliente = c;
		this.entrada = Reloj.ahora();
	}
	
	public void atiende () {
		this.salida = Reloj.ahora();
	}

}
