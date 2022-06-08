package clienteHeranca;

public class ContaPremium extends Cliente{
	
	private String tipoConta;
	
	public ContaPremium(String nome, double saldo) {
		
		super(nome, saldo);
		this.tipoConta = "Premium";
		
	}
	
    /*public String getNome() {
		
		return this.nome;
	}
	
	public String tipoConta() {
		
		return this.tipoConta;
	}*/
	

	public double tarifa() {
		
		return this.saldo * 2/100;
	}

}
