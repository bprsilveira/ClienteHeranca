package clienteHeranca;

public class ContaVip extends Cliente {

	private String tipoConta;
	
	public ContaVip (String nome, double saldo) {
		
		super(nome, saldo);
		this.tipoConta = "Vip";
	}
	
    /*public String getNome() {
		
		return this.nome;
	}
	
	public String tipoConta() {
		
		return this.tipoConta;
	}*/
	
	public double tarifa() {
		
		return this.saldo * 4/100;
	}
	
	
}
