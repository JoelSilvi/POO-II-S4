package sistemaNotas;

public class Ingles extends Notas {

public double promedioNotas;

	public Ingles() {
		
	}


	public Ingles (int _n1, int _n2, int _n3) {
		this.n1 = _n1;
		this.n2 = _n2;
		this.n3 = _n3;	
	}
	
	@Override
	public void mostrarDatos() {
		promedioNotas = n1 * n2 * n3;
		super.mostrarDatos();
		System.out.println("el promedio de Ingles es de: " + promedioNotas);
	}

	public double getPromedioNotas() {
		return promedioNotas;
	}

	public void setPromedioNotas(double promedioNotas) {
		this.promedioNotas = promedioNotas;
	}	
}
