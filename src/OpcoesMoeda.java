
public enum OpcoesMoeda {
	RtoD("Real a Dólar"),
	DtoR("Dólar a Real"),
	RtoE("Real a Euro"),
	EtoR("Euro a Real"),
	RtoL("Real a Libra"),
	LtoR("Libra a Real"),
	RtoW("Real a Won Coreano"),
	WtoR("Won Coreano a Real");
	
	
	private String descricao;
	
	OpcoesMoeda(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
