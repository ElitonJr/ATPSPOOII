package ATPS;

public class Software {
	String Nome;
	String Fabricante;
	int Versao;
	int Numero_da_nota_fiscal;
	int Data_de_aquisi��o;
	double Chave_de_Licen�a;
	int Validade_da_Chave_de_Licen�a;
	int Classifica��o;
	String Necessidade_de_Backup;
	
	//getters e setters
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public int getVersao() {
		return Versao;
	}
	public void setVersao(int versao) {
		Versao = versao;
	}
	public int getNumero_da_nota_fiscal() {
		return Numero_da_nota_fiscal;
	}
	public void setNumero_da_nota_fiscal(int numero_da_nota_fiscal) {
		Numero_da_nota_fiscal = numero_da_nota_fiscal;
	}
	public int getData_de_aquisi��o() {
		return Data_de_aquisi��o;
	}
	public void setData_de_aquisi��o(int data_de_aquisi��o) {
		Data_de_aquisi��o = data_de_aquisi��o;
	}
	public double getChave_de_Licen�a() {
		return Chave_de_Licen�a;
	}
	public void setChave_de_Licen�a(double chave_de_Licen�a) {
		Chave_de_Licen�a = chave_de_Licen�a;
	}
	public int getValidade_da_Chave_de_Licen�a() {
		return Validade_da_Chave_de_Licen�a;
	}
	public void setValidade_da_Chave_de_Licen�a(int validade_da_Chave_de_Licen�a) {
		Validade_da_Chave_de_Licen�a = validade_da_Chave_de_Licen�a;
	}
	public int getClassifica��o() {
		return Classifica��o;
	}
	public void setClassifica��o(int classifica��o) {
		Classifica��o = classifica��o;
	}
	public String getNecessidade_de_Backup() {
		return Necessidade_de_Backup;
	}
	public void setNecessidade_de_Backup(String necessidade_de_Backup) {
		Necessidade_de_Backup = necessidade_de_Backup;
	}	

}