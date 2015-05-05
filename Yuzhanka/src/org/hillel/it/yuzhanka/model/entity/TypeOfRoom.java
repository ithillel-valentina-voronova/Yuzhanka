package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class TypeOfRoom {
	private int id;
	private Date createdAt;
	private User createdBy;
	private String titleOfType;
	private int numberOfPlaces;
	private boolean waterCloset;
	private boolean shower;
	private boolean airConditioner;
	private boolean tv;
	private boolean refrigerator;
	private String description; // Будет хранить статью с описанием.Возможно
								// стоит вынести в отдельный тип.
	private String linkToPhoto;

}
