package testeveiculo;

public class Carro {
	
	public static void main(String[] args) {
		
		Veiculo carro1 = new Veiculo("Volkswagem", "Gol", 2018, "Flex");
		
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getCombustivel());
		
		System.out.println(carro1.estadoDoMotor());
		
		System.out.println(carro1.ignicaoMotor());
		
		System.out.println(carro1.acelerar(0));
		
	}
	
	
}
