package libreria;

import java.util.ArrayList;
import java.util.Collection;

public class Activo {
	
	private long id;
	private String descripcion;
	private String responsable;
	private Usuario usuario;
	private Collection<Reserva> reservasActivo = new ArrayList<>();
	
	public Activo(long id, String descripcion, String responsable, Usuario usuario,
			Collection<Reserva> reservasActivo) {
		this.id = id;
		this.descripcion = descripcion;
		this.responsable = responsable;
		this.usuario = usuario;
		this.reservasActivo = reservasActivo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Collection<Reserva> getReservasActivo() {
		return reservasActivo;
	}

	public void setReservasActivo(Collection<Reserva> reservasActivo) {
		this.reservasActivo = reservasActivo;
	}

	

	
	
	

}
