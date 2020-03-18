package banco;

public class CriaConta {
	public static void main (String[] args) {
	Conta contaHariel = new Conta();
	Cliente hariel = new Cliente();
	
	
	contaHariel.setCliente(hariel);
	contaHariel.setSaldo(200);
	contaHariel.getCliente().setNome("Hariel Pereira Correia");
	contaHariel.setNumero(-522);

	
	System.out.println(contaHariel.getSaldo());
	System.out.println(hariel.getNome());
	System.out.println(contaHariel.getCliente().getNome());
	System.out.println(hariel);
	
}

}
