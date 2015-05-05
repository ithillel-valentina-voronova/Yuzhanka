package org.hillel.it.yuzhanka.model.entity;

public class StandartRom extends Room {
	private boolean tv;
	private boolean bathroom;
	private boolean airconditioner;

	public StandartRom(boolean enable, int numberOfPlaces, int roomNumber) {
		super();
		this.airconditioner = true;
		this.bathroom = false;
		this.tv = true;
		this.enabled = enable;
		this.numberOfPlaces = numberOfPlaces;
		this.roomNumber = roomNumber; 
	}

}
