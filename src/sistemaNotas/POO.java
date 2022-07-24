package sistemaNotas;

public class POO extends Notas {
	
	public int n1, n2, n3;
	
	public double promedioNotas;
	
	public POO () {
	
	}
	
	@Override
	public void mostrarDatos() {
		promedioNotas = n1 * n2 * n3;
		super.mostrarDatos();
		System.out.println("el promedio de POO es de: " + promedioNotas);
	}	
	
}
