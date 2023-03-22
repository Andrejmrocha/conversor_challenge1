
public enum OpcoesTemperatura {
	CtoF("Celsius para Fahrenheit"),
	FtoC("Fahrenheit para Celsius"),
	CtoK("Celsius para Kelvin"),
	KtoC("Kelvin para Celsius"),
	FtoK("Fahrenheit para Kelvin"),
	KtoF("Kelvin to Fahrenheit ");
	
	private String descricao;
	
	
	
	OpcoesTemperatura(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
