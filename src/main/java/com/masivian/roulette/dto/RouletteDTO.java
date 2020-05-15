package com.masivian.roulette.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RouletteDTO {

	@JsonProperty("resultado")
	private String result;
	
	@JsonProperty("apuestas")
	private List<BetDTO> bets;
	
	public RouletteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RouletteDTO(String resultado, List<BetDTO> apuestas) {
		super();
		this.result = resultado;
		this.bets = apuestas;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<BetDTO> getBets() {
		return bets;
	}

	public void setBets(List<BetDTO> bets) {
		this.bets = bets;
	}
	
}
