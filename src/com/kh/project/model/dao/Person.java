package com.kh.project.model.dao;

public class Person {
	private int hp;
	private String kinds;
	
	public Person() {}
	
	public Person(int hp, String kinds) {
		this.hp = hp;
		this.kinds = kinds;
	}

	public int getHp() {
		return hp;
	}

	public String getKinds() {
		return kinds;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public void Hurt() {}
}
