package com.kh.project.model.dao;

public class Man extends Person{
	
	public Man(int hp, String kinds) {
		super(hp, kinds);
	}
	
	@Override
	public void Hurt() {
		System.out.println("���ƾ�!");
	}
	
	public void attack2() {
		System.out.println("���ο��� ��ó�� �������ϴ�.");
	}
	
	public void hitMan() {
		System.out.println("������ hp�� 10�� �����մϴ�.");
		super.setHp(super.getHp() - 10);
		
		if(super.getHp() <= 0) {
			System.out.println("��Ż�� ����!");
		}
	}
	
}
