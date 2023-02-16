package modelo;

import java.util.LinkedList;
import java.util.Queue;

public class ColaEspera {
	private Queue<DatosCliente> colaEspera;
	private Queue<DatosCliente> colaAtendidos;

	public ColaEspera() {
		colaEspera = new LinkedList<DatosCliente>();
		colaAtendidos = new LinkedList<DatosCliente>();
		
	}
	
	public void nuevoCliente( Cliente c) {
		DatosCliente datos = new DatosCliente(c);
		colaEspera.add(datos);
	}

}
