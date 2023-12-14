package Heranca;
import java.util.Date;

public class Escola {
	public static void main(String[] args) {
		Aluno A1 = new Aluno("Rafael Damasceno","123.456.789-00",new Date());
		System.out.println("Veja como os atributos foram preenchidos \nNome: "+ A1.nome);
		System.out.println("CPF: "+A1.cpf);
		System.out.println("Data de Nascimento: "+A1.data_nascimento.toString());
		A1.matricula ="0001";
		System.out.println("A matricula e: " + A1.matricula);
		
		Professor Desenvolvimento = new Professor("Wellignton","987.654.321-11",new Date());
		Professor Matematica = new Professor("Rafael Damasceno","111.222.333.444=23",new Date());
		
		Funcionario Monitor = new Funcionario("Stewart Little","444.444.444-55",new Date());
		Funcionario Porteiro = new Funcionario("Ana Hickman","222.222.222-00",new Date());

		
		
		
		
	}

}
