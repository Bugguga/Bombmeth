package logic;

import entity.base.Entity;

public class Cell {
	private Entity<ArrayList> entity;
	private boolean isEmpty;
	
	public Cell() {
		this.
		this.isEmpty=true;
	}

	
	public boolean isEmpty() {
		return isEmpty;
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		if(isEmpty) {
			this.entity=entity;
			this.isEmpty=false;
		}
		else {
			
		}
	}
	


	
}
