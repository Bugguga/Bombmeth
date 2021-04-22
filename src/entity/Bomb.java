package entity;

import entity.base.Entity;
import entity.base.Explodable;
import entity.base.Removable;

public class Bomb extends Entity implements Explodable,Removable{
	private int length;

	public Bomb(int length) {
		this.length=length;
	}
	@Override
	public void explode(int length) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}
	
}
