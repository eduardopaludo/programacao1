
public class Data {
	int dia;
	int mes;
	int ano;
	String data;
	
	public Data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String formataDataBr()
	{
		data = dia + "/" + mes + "/" + ano; 
		return data;
	}
}
