import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TiendaTest {

    Tienda tienda;
    Cliente cliente;
    Computador computador;
    Pantalla pantalla;
    Notebook notebook;
    Tablet tablet;

    @BeforeEach
    void setUp() {
        tienda = new Tienda("direccion",new ArrayList<>(),new ArrayList<>());
        cliente = new Cliente("nombre","correo@correo.com","123456789","estado","ciudad");
        pantalla = new Pantalla("LG","modelo","2020");
        computador = new Computador("Marca", 8, 500, "Procesador", "Modelo", 2023, 999, 10, "Tarjeta de Video", "Fuente de Poder", "Chasis", pantalla);
        notebook = new Notebook("Marca", 16, 1000, "Procesador", "Modelo", 2023, 1499, 5, "1920x1080", "Teclado Retroiluminado", "Batería de Litio");

        ArrayList<String> accesorios = new ArrayList<>();
        accesorios.add("Funda protectora");
        accesorios.add("Lápiz táctil");
        accesorios.add("Cargador adicional");

        tablet = new Tablet("Marca", 4, 64, "Procesador", "Modelo", 2023, 799, 3, "1280x800", accesorios);

    }

    @Test
    void agregarCliente() {
        assertTrue(tienda.agregarCliente(cliente)); //cuando el arreglo esta vacio, debería retornar true.
        assertFalse(tienda.agregarCliente(cliente)); //cuando el cliente ya existe dentro del arreglo, debería retornar false
    }

    @Test
    void agregarDispositivo() {
        assertTrue(tienda.agregarDispositivo(notebook)); //misma lógica que prueba anterior.
        assertFalse(tienda.agregarDispositivo(notebook));
    }

    @Test
    void agregarDispositvo(){
        tienda.agregarDispositivo(computador);
        tienda.agregarDispositivo(notebook);
        tienda.agregarDispositivo(tablet);
        assertTrue(tienda.getDispositivos().size()==3);
    }

    @Test
    void obtenerInformacion() {
        tienda.agregarDispositivo(computador);
        assertEquals(tienda.obtenerInformacion(computador),computador.toString());
    }

    @Test
    void ObtenerInformacionDos() {
        tienda.agregarDispositivo(notebook);
        assertEquals(tienda.obtenerInformacion(0),notebook.toString());
    }

    @Test
    void buscarPorMarca() {
        //esta prueba compara el tamaño del arreglo obtenido(el cual coinciden los parametros de busqueda) con un entero el cual es el tamaño esperado.
        tienda.agregarDispositivo(computador);
        System.out.println(computador.getMarca());
        assertEquals(tienda.buscarPorMarca(computador.getMarca()).size(),1);

    }

    @Test
    void buscarPorModeloYTipo() {
        //misma logica que la prueba anterior.
        tienda.agregarDispositivo(computador);
        System.out.println(computador.getModelo());
        System.out.println(computador.getTipo());
        assertEquals(tienda.buscarPorModeloYTipo(computador.getModelo(), computador.getTipo()).size(),1);
    }

}