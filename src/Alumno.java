
public class Alumno {
	private String nombre;
	private String apellido;
	private String dni;
	
	public Alumno(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	
	
}
