package com.masivian.roulette.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetDTO {

	@JsonProperty("apuesta")
	private String betValue;
	
	@JsonProperty("dinero")
	private Integer amount;
	
	@JsonProperty("resultado")
	private String result;
	
	public BetDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BetDTO(String betValue, Integer amount, String result) {
		super();
		this.betValue = betValue;
		this.amount = amount;
		this.result = result;
	}

	public String getBetValue() {
		return betValue;
	}
	
	public void setBetValue(String betValue) {
		this.betValue = betValue;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
}
