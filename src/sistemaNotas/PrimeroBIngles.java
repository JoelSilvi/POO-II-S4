package sistemaNotas;

public class PrimeroBIngles extends Ingles {

	public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroBIngles() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero B cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en inglés son: " + cantAprobados + 
				" los reprobados en inglés son: " + cantReprobados);
	}
		
}