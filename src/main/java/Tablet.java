import java.util.ArrayList;

public class Tablet extends Dispositivo {
	private String resolucionPantalla;
	private ArrayList<String> accesorios;

	public Tablet(String marca, int ram, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String resolucionPantalla, ArrayList<String> accesorios) {
		super(marca, ram, almacenamiento, procesador, modelo, añoFabricacion, precio, stock);
		this.resolucionPantalla = resolucionPantalla;
		this.accesorios = accesorios;
	}

	@Override
	protected String getTipo() {
		return "Tablet";
	}

	@Override
	public String toString() {
		return "Tablet{" +
				"resolucionPantalla='" + resolucionPantalla + '\'' +
				", accesorios=" + accesorios +
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