package sistemaNotas;

public class PrimeroA_POO_II extends POO_II {
	int notaSemestral, notaAnual;
	
	public PrimeroA_POO_II() {
		
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("La nota Semestral de Primero A en POO II fue " 
				+ notaSemestral + " y la nota Anual fue " + notaAnual);
	}
}
