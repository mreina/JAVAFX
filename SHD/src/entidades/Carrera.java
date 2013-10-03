package entidades;

public class Carrera {
	private String nombre,siglas,jefe;
	private int matricula,id;
	private boolean acreditada;
	
	/*MEJORANDO CODIGO HILL BILL*/
	
	public Carrera() {
		// TODO Auto-generated constructor stub
		this.acreditada=false;
		this.nombre="";
		this.siglas="";
		this.matricula=0;
		this.jefe="";
		this.id=0;
	}

	public Carrera(String nombre, String siglas, String jefe, int matricula,
			int id, boolean acreditada) {
		super();
		this.nombre = nombre;
		this.siglas = siglas;
		this.jefe = jefe;
		this.matricula = matricula;
		this.id = id;
		this.acreditada = acreditada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAcreditada() {
		return acreditada;
	}

	public void setAcreditada(boolean acreditada) {
		this.acreditada = acreditada;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre.toString();
	}
	
	
	
	
	
}
