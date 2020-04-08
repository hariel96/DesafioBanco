package banco;

public abstract class Conta {

	private Cliente cliente;
	private double saldo = 0;
	private int agencia = 0;
	private int numero = 0;
	private String titular;
	private double taxa1 = 1.2;
	private double taxa2 = 2.5;
	private double limite = -600;

	public Conta() {

	}

	public void saque(double total) {
		if (saldo >= total ) {
			saldo -= (total);

		} else {
			System.out.println("Operação invalida");
		}
	}

	public void transferir(double total, Conta conta) {
		saque(total + 4);
		conta.depositar(total);
	}

	public abstract void depositar(double total);

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;

	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getTaxa1() {
		return taxa1;
	}

	public void setTaxa1(double taxa1) {
		this.taxa1 = taxa1;
	}

	public double getTaxa2() {
		return taxa2;
	}

	public void setTaxa2(double taxa2) {
		this.taxa2 = taxa2;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setNumero(int numero) {
		if (numero < 0) {
			System.out.println("Numero invalido");
		}
		this.numero = numero;

	}

	public int getAgencia() {

		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia invalido");
		}
		this.agencia = agencia;
	}

	public double getNumero() {
		return numero;
	}

}
