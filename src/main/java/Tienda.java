import java.util.ArrayList;

public class Tienda {
	private String direccion;
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

	public Tienda(String direccion, ArrayList<Cliente> clientes, ArrayList<Dispositivo> dispositivos) {
		this.direccion = direccion;
		this.clientes = clientes;
		this.dispositivos = dispositivos;
	}

	public void agregarCliente(Cliente cliente) {
		if(!this.clientes.contains(cliente)){
			clientes.add(cliente);
		}else{
			System.out.println("El cliente ya se encuentra registrado.");
		}
	}

	public String obtenerInformacion(Dispositivo dispositivo) {
		for (Dispositivo d: this.dispositivos) {
			if(d.equals(dispositivo)){
				return d.toString();
			}
		}
		return "El dispositivo no se encuentra en el catálogo";
	}

	public String obtenerInformacion(int indice) {
		return dispositivos.get(indice).toString();
	}

	public ArrayList<Dispositivo> buscarPorMarca(String marca) {
		ArrayList<Dispositivo> dispositivosCoinciden = new ArrayList<>();
		for (Dispositivo d: dispositivos) {
			if(marca.equals(d.getMarca())){
				dispositivosCoinciden.add(d);
			}
		}
		return dispositivosCoinciden;
	}

	public ArrayList<Dispositivo> buscarPorModeloYTipo(String modelo, String tipo) {
		ArrayList<Dispositivo> dispositivosCoinciden = new ArrayList<>();
		for (Dispositivo d: dispositivos) {
			if(modelo.equals(d.getModelo())&&tipo.equals(d.getTipo())){
				dispositivosCoinciden.add(d);
			}
		}
		return dispositivosCoinciden;
	}
}
