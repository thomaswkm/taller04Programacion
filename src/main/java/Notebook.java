public class Notebook extends Dispositivo {
	private String resolucionPantalla;
	private String tipoTecladoIncorporado;
	private String bateria;

	public Notebook(String marca, int ram, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String resolucionPantalla, String tipoTecladoIncorporado, String bateria) {
		super(marca, ram, almacenamiento, procesador, modelo, añoFabricacion, precio, stock);
		this.resolucionPantalla = resolucionPantalla;
		this.tipoTecladoIncorporado = tipoTecladoIncorporado;
		this.bateria = bateria;
	}

	@Override
	protected String getTipo() {
		return "Notebook";
	}

	@Override
	public String toString() {
		return "Notebook{" +
				"resolucionPantalla='" + resolucionPantalla + '\'' +
				", tipoTecladoIncorporado='" + tipoTecladoIncorporado + '\'' +
				", bateria='" + bateria + '\'' +
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