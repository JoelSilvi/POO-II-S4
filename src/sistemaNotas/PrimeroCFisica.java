package sistemaNotas;

public class PrimeroCFisica extends Fisica {
	
public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroCFisica() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero C cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en f�sica son: " + cantAprobados + 
				" los reprobados en f�sica son: " + cantReprobados);
	}

}
