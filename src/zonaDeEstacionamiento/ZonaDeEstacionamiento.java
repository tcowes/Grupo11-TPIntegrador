package zonaDeEstacionamiento;

import java.util.ArrayList;

import inspector.Inspector;
import puntoDeVenta.PuntoDeVenta;

public class ZonaDeEstacionamiento {

	private String nombre;
	//ArrayList<Estacionamiento> estacionamientos = new ArrayList<Estacionamiento>();
	private Inspector inspector;
	private ArrayList<PuntoDeVenta> puntosDeVenta = new ArrayList<PuntoDeVenta>();
	
	public ZonaDeEstacionamiento(String s, Inspector insp) {
		nombre = s;
		inspector = insp;
	}

	public void aņadirPuntoDeVenta(PuntoDeVenta pdv) {
		puntosDeVenta.add(pdv);		
	}

	public ArrayList<PuntoDeVenta> getPuntosDeVenta() {
		return puntosDeVenta;
	}

	public Object getInspector() {
		return inspector;
	}
	
	public String nombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

/*	public void registrarEstacionamiento(Estacionamiento est) {
		estacionamientos.add(est);		
	}
*/
}