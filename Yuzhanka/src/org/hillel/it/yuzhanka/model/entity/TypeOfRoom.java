package org.hillel.it.yuzhanka.model.entity;

public class TypeOfRoom {
	int id;
	String titleOfType;
	int numberOfPlaces;
	boolean waterCloset;
	boolean shower;
	boolean airConditioner;
	boolean tv;
	boolean refrigerator;
	int descriptionID; // Здесь будеть храниться ID описания номера из таблицы
						// descriptions храняцейся в БД
	String linkToPhoto1;
	String linkToPhoto2;
	String linkToPhoto3;
	String linkToPhoto4; // ссылки на фотографии лежащие на сервере
	String linkToPhoto5;
	String linkToPhoto6;
	String linkToPhoto7;
	String linkToPhoto8;

}
