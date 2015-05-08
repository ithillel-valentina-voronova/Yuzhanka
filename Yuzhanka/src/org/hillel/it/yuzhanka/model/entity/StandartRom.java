package org.hillel.it.yuzhanka.model.entity;

public class StandartRom extends Room {
	private boolean tv;
	private boolean bathroom;
	private boolean airconditioner;

	public StandartRom(boolean active, int numberOfPlaces, int roomNumber) {
		super();
		this.airconditioner = true;
		this.bathroom = false;
		this.tv = true;
		this.active = active;
		this.numberOfPlaces = numberOfPlaces;
		this.roomNumber = roomNumber; 
	}

}
