package com.nicorvargas.nicomon.characters;

public class Trainer {
	private String name;
	private int wins;
	private int loses;
	private int ranking;

	public Trainer(String name, int wins, int loses, int ranking) {
		this.name = name;
		this.wins = wins;
		this.loses = loses;
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fight(){

	}
}
