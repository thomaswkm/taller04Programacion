public class Computador extends Dispositivo {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantalla;

	public Computador(String marca, int ram, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
		super(marca, ram, almacenamiento, procesador, modelo, añoFabricacion, precio, stock);
		this.tarjetaVideo = tarjetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
		this.pantalla = pantalla;
	}

	@Override
	protected String getTipo() {
		return "Computador";
	}

	@Override
	public String toString() {
		return "Computador{" +
				"tarjetaVideo='" + tarjetaVideo + '\'' +
				", fuentePoder='" + fuentePoder + '\'' +
				", chasis='" + chasis + '\'' +
				", pantalla=" + pantalla +
				", marca='" + marca + '\'' +
				", ram=" + ram +
				", almacenamiento=" + almacenamiento +
				", procesador='" + procesador + '\'' +
				", modelo='" + modelo + '\'' +
				", añoFabricacion=" + añoFabricacion +
				", precio=" + precio +
				", stock=" + stock +
				'}';
	}
}