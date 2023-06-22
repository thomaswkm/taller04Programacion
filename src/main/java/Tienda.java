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

	public boolean agregarCliente(Cliente cliente) {
		if(!this.clientes.contains(cliente)){
			clientes.add(cliente);
			return true;
		}else{
			System.out.println("El cliente ya se encuentra registrado.");
			return false;
		}
	}

	public boolean agregarDispositivo(Dispositivo dispositivo){
		if(!this.dispositivos.contains(dispositivo)){
			dispositivos.add(dispositivo);
			return true;
		}else{
			System.out.println("El dispositivo ya se encuentra en el catálogo");
			return false;
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

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Dispositivo> getDispositivos() {
		return dispositivos;
	}
}
