package org.hillel.it.yuzhanka.model.entity;

public class LuxRoom extends Room {

	private boolean tv;
	private boolean bathroom;
	private boolean airconditioner;

	public LuxRoom(boolean enable, int numberOfPlaces, int roomNumber) {
		super();
		this.airconditioner = true;
		this.bathroom = true;
		this.tv = true;
		this.enabled = enable;
		this.numberOfPlaces = numberOfPlaces;
		this.roomNumber = roomNumber; 
	}

}
