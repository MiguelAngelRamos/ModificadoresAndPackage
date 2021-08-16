package hogar;

public class Persona {
	// Encapsulamiento
	private String nombre;
	private String apellido;

	public static final String GENERO_MASCULINO = "Masculino";
	public static final String GENERO_FEMENINO = "Femenino";
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		// validacion por medio un metodo
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String lanzarPelota() {
		return "Lanzo Pelota";
	}
	
	// Metodo estatico (static) no necesita ser instanciado
	public static String saludar() {
		return "Hola que tal";
	}
	

}
