package sistemaNotas;

public class PrimeroBFisica extends Fisica{
public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroBFisica() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero B cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en f�sica son: " + cantAprobados + 
				" los reprobados en f�sica son: " + cantReprobados);
	}
}
