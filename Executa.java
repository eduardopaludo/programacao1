public class Executa {

	public static void main(String[] args) {
		Data dataEntrada = new Data(15,8,2008);
		Funcionario f1 = new Funcionario(
				"Eduardo",
				"TI",
				dataEntrada,
				"4.842.737",
				5000,
				true
				);
		
		/* 
		 * Funcionario.salario = 1234; 
		 * 
		 * Nesse caso nao funciona, pois minha variavel salario é private,
		 * caso ela fosse public funcionaria desde que fosse colocado
		 * static na frente da variavel, porém caso eu tivesse mais de um objeto
		 * do tipo Funcionario e eu mudasse o valor de salario,
		 * esse valor seria alterado em todos os objetos, pois salario nao seria 
		 * mais uma variavel de objeto e sim de classe.
		 * 
		 * */
		
		/* 
		 * Funcionario.calculaGanhoAnual();
		 * 
		 * Nesse caso o metodo tambem teria que usar static,
		 * com isso ele se torna o metodo da classe e nao do objeto,
		 * se ele nao utilizar outros metodos ou variaveis nao estaticos da classe,
		 * poderia colocar o static na frente do metodo e a forma correta para chamar
		 * ele seria da forma acima, usando o nome da classe e nao do objeto.
		 *  
		 */
		
		f1.mostra();
		
	}

}
