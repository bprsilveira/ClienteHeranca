package clienteHeranca;

public class MainClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Cliente c1 = new Cliente("Belarmino", 1000);
		
		System.out.println("Nome:" + c1.getNome() + " Tipo de conta: " + c1.getTipoConta());
		System.out.println("Saldo: " + c1.getSaldo() + " Tarifa: " + c1.tarifa());
		
		
		
		ContaPremium c2 = new ContaPremium("Manuel", 4000);
		System.out.println("Nome:" + c2.getNome() + " Tipo de conta: " + c2.getTipoConta());
		System.out.println("Saldo: " + c2.getSaldo() + " Tarifa: " + c2.tarifa());
		
		ContaVip c3 = new ContaVip("Charlene", 15000);
		System.out.println("Nome:" + c3.getNome() + " Tipo de conta: " + c3.getTipoConta());
		System.out.println("Saldo: " + c3.getSaldo() + " Tarifa: " + c3.tarifa());
		
	}

}
