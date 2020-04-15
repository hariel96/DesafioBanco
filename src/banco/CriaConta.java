package banco;

public class CriaConta {
	public static void main(String[] args) {
		ContaPoupanca contaHariel = new ContaPoupanca(1254, 6589);
		Cliente hariel = new Cliente();
		contaHariel.setCliente(hariel);
		contaHariel.setSaldo(200);
		contaHariel.getCliente().setNome("Hariel Pereira Correia");
		contaHariel.setNumero(522);

		ContaCorrente contaAdriana = new ContaCorrente(2144, 8567);
		Cliente adriana = new Cliente();

		contaAdriana.setCliente(adriana);
		contaAdriana.setSaldo(1000);
		contaAdriana.getCliente().setNome("Adriana Pollezi");

		
//		System.out.println(contaAdriana.getSaldo());
//		System.out.println(contaHariel.getSaldo());
//		contaHariel.saque(50);
//		contaAdriana.saque(50);
//		System.out.println(contaAdriana.getSaldo());
//		System.out.println(contaHariel.getSaldo());
//		contaAdriana.saque(100.00);
//		System.out.println(contaAdriana.getSaldo());

		SeguroDeVida seguroAdriana = new SeguroDeVida();
		
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		calculadora.registra(contaAdriana);
		calculadora.registra(seguroAdriana);
		System.out.println(calculadora.getTotalImposto());
		
		
	}

}
