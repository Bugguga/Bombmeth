package entity;

import entity.base.Entity;

public class Player extends Entity{
	private String name;
	private int lifePoint,speed;
	//private ArrayList<Ability>;
	
	public Player(String name,int lifePoint,int speed) {
		this.name=name;
		this.lifePoint=lifePoint;
		this.speed=speed;
	}
	public boolean move() {
		
		return false;
	}
	
}
