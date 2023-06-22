public class Cliente {
	private String nombre;
	private String correo;
	private String numeroContacto;
	private String estadoCivil;
	private String ciudad;

	public Cliente(String nombre, String correo, String numeroContacto, String estadoCivil, String ciudad) {
		this.nombre = nombre;
		this.correo = correo;
		this.numeroContacto = numeroContacto;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}
}