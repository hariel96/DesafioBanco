package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		
	}

	@Override
	public void depositar(double total) {
		setSaldo(getSaldo() + total);
		
	}
	
}
