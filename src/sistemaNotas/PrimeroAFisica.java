package sistemaNotas;

public class PrimeroAFisica extends Fisica {
	
public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroAFisica() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero A cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en f�sica son: " + cantAprobados + 
				" los reprobados en f�sica son: " + cantReprobados);
	}

}
