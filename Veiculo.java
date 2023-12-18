package Heranca;

public abstract class Veiculo{
	public String marca;
	public Double valor;
	public String modelo;
	public String dono;
	
	public Veiculo(String _marca, Double _valor, String _modelo, String _dono) {
		this.marca = _marca;
		this.valor = _valor;
		this.modelo = _modelo;
		this.dono = _dono;	
	}
}
