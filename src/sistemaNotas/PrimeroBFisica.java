package sistemaNotas;

public class PrimeroBFisica extends Fisica{
public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroBFisica() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero B cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en física son: " + cantAprobados + 
				" los reprobados en física son: " + cantReprobados);
	}
}
