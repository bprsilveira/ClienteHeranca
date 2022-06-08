package clienteHeranca;

public class Cliente {
	
	protected String nome;
	private String tipoConta;
	protected double saldo;
	
	public Cliente(String nome, double saldo) {
		
		this.nome = nome;
		this.saldo = saldo;
		this.tipoConta = "Regular";
		
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public String getTipoConta() {
		
		return this.tipoConta;
	}

	public double getSaldo() {
		
		return this.saldo;
	}
	
	public double tarifa() {
		
		return this.saldo * 1/100;
	}
	

}
