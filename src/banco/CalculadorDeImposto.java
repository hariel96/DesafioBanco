package banco;

public class CalculadorDeImposto {

	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValotImposto();
		
		this.totalImposto +=valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
