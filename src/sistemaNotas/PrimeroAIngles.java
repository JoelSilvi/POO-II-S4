package sistemaNotas;

public class PrimeroAIngles extends Ingles {

	public int cantAlumnos, cantAprobados, cantReprobados;
	
	public PrimeroAIngles() {
		
	}
		
	@Override
	public void mostrarDatos() {
		System.out.println("Primero A cuenta con " + cantAlumnos + " Alumnos "
				+ " los aprobados en ingl�s son: " + cantAprobados + 
				" los reprobados en ingl�s son: " + cantReprobados);
	}
		
}
