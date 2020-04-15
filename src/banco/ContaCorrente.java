package banco;

public class ContaCorrente extends Conta implements Tributavel  {

	public ContaCorrente(int agencia, int numero) {
		
		
	}
	@Override
	public void saque (double total) {
		if (getSaldo() >= total + getTaxa1()) {
			setSaldo(getSaldo() - (getTaxa1() + total));

		} else if (getSaldo() - getTaxa2() - total >= getLimite()) {
			setSaldo(getSaldo() - (getTaxa2() + total));

		} else {
			System.out.println("Operação invalida");
		}
	}
	@Override
	public void depositar(double total) {
		setSaldo(getSaldo() + total);
		
	}
	@Override
	public double getValotImposto() {
		return super.getSaldo() * 0.01;
	}
	
}
