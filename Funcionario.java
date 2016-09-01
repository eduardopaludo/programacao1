
public class Funcionario {
	private String nome;
	private String departamento;
	Data dataEntrada;
	private String rg;
	private double salario;
	private boolean estaNaEmpresa;
	
	public Funcionario(
			String nome,
			String departamento,
			Data dataEntrada,
			String rg,
			double salario,
			boolean estaNaEmpresa
			)
	{
		this.nome = nome;
		this.departamento = departamento;
		this.dataEntrada = dataEntrada;
		this.rg = rg;
		this.salario = salario;
		this.estaNaEmpresa = estaNaEmpresa;
	}
	public void bonifica(double aumento)
	{
		this.salario += aumento;
	}
	
	public double calculaGanhoAnual()
	{
		return this.salario * 12;
	}
	
	public void demite()
	{
		estaNaEmpresa = false;
	}
	
	public void mostra()
	{
		System.out.println("Funcionário: " + this.getNome());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Data de Entrada: " + this.dataEntrada.formataDataBr());
		System.out.println("RG: " + this.getRg());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Esta na empresa? " + this.isEstaNaEmpresa());
		
	}

	public String getNome() {
		return nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getRg() {
		return rg;
	}
	
	public double getSalario()
	{
		return this.salario;
	}
	
	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	
}
