package libreria;

public class Usuario {
	
	private long id;
	private int number;
	private String correo;
	public Usuario(long id, int number, String correo) {
		this.id = id;
		this.number = number;
		this.correo = correo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
