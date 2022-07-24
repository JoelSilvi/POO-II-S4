package sistemaNotas;

public class PrimeroAIngles extends Ingles {

	public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroAIngles() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero A cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en inglés son: " + cantAprobados + 
				" los reprobados en inglés son: " + cantReprobados);
	}
		
}
