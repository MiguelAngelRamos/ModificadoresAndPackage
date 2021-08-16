package hogar.casa;

import hogar.Persona;

class Gato {
	protected String nombre; // solo puede ser accedido dentro paquete (pero tambien por la herencia)
	protected int edad = 10;
	
	protected String maullar() {
		return "Miau Miau";
	}
	
	String jugar(Persona persona) {
		return persona.lanzarPelota() + " hacia " + nombre;
	}
	
	String comer() {
		return "Gato comiendo";
	}
	
}
