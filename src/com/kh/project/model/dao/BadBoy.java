package com.kh.project.model.dao;

public class BadBoy extends Person{
	
	public BadBoy(int hp, String kinds) {
		super(hp, kinds);
	}
	
	@Override
	public void Hurt() {
		System.out.println("����!");
	}
	
	public void attack() {
		System.out.println("������ ����� �����߽��ϴ�.");
	}
	
	public void hitBadBoy() {
		System.out.println("���ΰ��� hp�� 10�� �����մϴ�.");
		super.setHp(super.getHp() - 10);
		
		if(super.getHp() <= 0) {
			System.out.println("����� ���� Ż������ ���߽��ϴ�.");
		}
	}
}
