package com.nicorvargas.nicomon.characters;

import javax.swing.*;

public class Nicomon {
	private String name;
	private Type type;
	private Race race;
	private int hp;
	private int hpMax;
	private int atk;
	private int def;
	private int speed;
	private boolean alive;
	private ImageIcon texture;

	public Nicomon(
			String name,
			Type type,
			Race race,
			int hp,
			int hpMax,
			int atk,
			int def,
			int speed,
			boolean alive,
			ImageIcon texture
	) {
		this.name = name;
		this.type = type;
		this.race = race;
		this.hp = hp;
		this.hpMax = hpMax;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.alive = alive;
		this.texture = texture;
	}

	public void appear() {
		//aparece textura
	}

	public void disappear() {
		//tira textura
	}

	public void die(){
		this.alive = false;
	}

	//public void attack(Skill skill, Nicomon target);
		//fazer o ataque
}
