package libreria;

import java.time.LocalDateTime;

public class Reserva {
	
	private long id;
	private Activo activo;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public Reserva(long id, Activo activo, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		this.id = id;
		this.activo = activo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Activo getActivo() {
		return activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
}
