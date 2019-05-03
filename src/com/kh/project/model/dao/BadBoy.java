package com.kh.project.model.dao;

public class BadBoy extends Person{
	
	public BadBoy(int hp, String kinds) {
		super(hp, kinds);
	}
	
	@Override
	public void Hurt() {
		System.out.println("으악!");
	}
	
	public void attack() {
		System.out.println("범인이 당신을 공격했습니다.");
	}
	
	public void hitBadBoy() {
		System.out.println("주인공의 hp가 10이 감소합니다.");
		super.setHp(super.getHp() - 10);
		
		if(super.getHp() <= 0) {
			System.out.println("당신은 방을 탈출하지 못했습니다.");
		}
	}
}
