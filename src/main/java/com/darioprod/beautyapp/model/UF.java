package com.darioprod.beautyapp.model;

public enum UF {
	AC("AC", "Acre"), 
	AL("AL", "Alagoas"),
	AM("AM", "Amazonas"),
	BA("BA", "Bahia"),
	CE("CE", "Ceará"),
	DF("DF", "Distrito Federal"),
	ES("ES", "Espírito Santo"),
	GO("GO", "Goiás"),
	MA("MA", "Maranhão"),
	MT("MT", "Mato Grosso"),
	MS("MS", "Mato Grosso do Sul"),
	MG("MG", "Minas Gerais"),
	PA("PA", "Pará"),
	PB("PB", "Paraíba"),
	PR("PR", "Paraná"),
	PE("PE", "Pernambuco"),
	PI("PI", "Piauí"),
	RJ("RJ", "Rio de Janeiro"),
	RN("RN", "Rio Grande do Norte"),
	RS("RS", "Rio Grande do Sul"),
	RO("RO", "Rondônia"),
	RR("RR", "Roraima"),
	SC("SC", "Santa Catarina"),
	SP("SP", "São Paulo"),
	SE("SE", "Sergipe"),
	TO("TO", "Tocantins");
	
	private String stateAcronym;
	private String description;
	
	UF(String stateAcronym, String description) {
		this.stateAcronym = stateAcronym;
		this.description = description;
	}

	public String getSigla() {
		return stateAcronym;
	}

	public void setSigla(String stateAcronym) {
		this.stateAcronym = stateAcronym;
	}

	public String getDescricao() {
		return description;
	}

	public void setDescricao(String description) {
		this.description = description;
	}
	
	
	
	
}