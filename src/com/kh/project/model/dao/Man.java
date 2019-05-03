package com.kh.project.model.dao;

public class Man extends Person{
	
	public Man(int hp, String kinds) {
		super(hp, kinds);
	}
	
	@Override
	public void Hurt() {
		System.out.println("으아악!");
	}
	
	public void attack2() {
		System.out.println("범인에게 상처를 입혔습니다.");
	}
	
	public void hitMan() {
		System.out.println("범인의 hp가 10이 감소합니다.");
		super.setHp(super.getHp() - 10);
		
		if(super.getHp() <= 0) {
			System.out.println("방탈출 성공!");
		}
	}
	
}
