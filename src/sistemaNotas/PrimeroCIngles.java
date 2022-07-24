package sistemaNotas;

public class PrimeroCIngles extends Ingles {

	public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroCIngles() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero C cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en inglés son: " + cantAprobados + 
				" los reprobados en inglés son: " + cantReprobados);
	}
		
}
