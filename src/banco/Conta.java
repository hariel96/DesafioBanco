package banco;

public class Conta {

	private Cliente cliente;
	private double saldo = 0;
	private int agencia = 0;
	private int numero = 0;
	private String titular;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setNumero(int numero) {
		if (numero < 0)
		{
			System.out.println("Numero invalido");
		}
		this.numero = numero;

	}

	public int getAgencia() {
		
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia<=0)
		{
			System.out.println("Agencia invalido");
		}
		this.agencia = agencia;
	}

	public double getNumero() {
		return numero;
	}

}
