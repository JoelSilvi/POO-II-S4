package sistemaNotas;

public class PrimeroCFisica extends Fisica {
	
public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroCFisica() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero C cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en física son: " + cantAprobados + 
				" los reprobados en física son: " + cantReprobados);
	}

}
