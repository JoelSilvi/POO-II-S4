package sistemaNotas;

public class PrimeroCIngles extends Ingles {

	public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroCIngles() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero C cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en ingl�s son: " + cantAprobados + 
				" los reprobados en ingl�s son: " + cantReprobados);
	}
		
}
