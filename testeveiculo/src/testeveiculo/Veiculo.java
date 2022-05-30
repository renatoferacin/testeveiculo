package testeveiculo;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private String combustivel;
	private boolean ligarMotor;
	private int velocidade;
	
	public String estadoDoMotor( ) {
		if (this.ligarMotor) {
			return this.modelo + " Motor ligado!";
		} else {
			return this.modelo + " Motor desligado";
		}
	}
	
	public String ignicaoMotor() {
		if (this.ligarMotor) {
			return "O motor do " + this.modelo + " já está ligado!";
		} else {
			this.ligarMotor = true;
			return "O motor do " + this.modelo + " foi ligado agora!";
		}
	}
	
	public String acelerar(int valor) {
		if(this.ligarMotor) {
			this.velocidade += valor;
			return this.modelo + " está acelerando e em movimento!";
		} else {
			this.velocidade = 0;
			return this.modelo + " está com o motor desligado e estacionado!";
		}
	
	}	
	
	public Veiculo(String marca, String modelo, int ano, String combustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.combustivel = combustivel;
		this.ligarMotor = false;
		this.velocidade = 0;
	}
		
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public boolean isLigarMotor() {
		return ligarMotor;
	}

	public void setLigarMotor(boolean ligarMotor) {
		this.ligarMotor = ligarMotor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
}
