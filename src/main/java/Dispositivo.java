public abstract class Dispositivo {
	protected String marca;
	protected int ram;
	protected int almacenamiento;
	protected String procesador;
	protected String modelo;
	protected int añoFabricacion;
	protected int precio;
	protected int stock;

	public Dispositivo(String marca, int ram, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock) {
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.precio = precio;
		this.stock = stock;
	}

	protected abstract String getTipo();

	protected String getMarca() {
		return this.marca;
	}

	protected String getModelo() {
		return this.modelo;
	}
}