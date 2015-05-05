package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class ReservationAndArrive {
	private int id;
	private Date createdAt;
	private User createdBy; // может быть как менеджер так и сам клиент
	private boolean isAcctive;
	private String nubberForClient; // что-бы номер был красивый дата+номер
									// 20150417003
	private User ownerOfReservation;
	private Date dateOfReservation;
	private float costOfReservation;
	private float prepaydOfReservation;
	private int methodOfPrepaid; // 0 - наличные 1 - картой
									// 2 - денежный перевод...
	private boolean prepaidIsGot;
	private Date dateWhenPrepaidIsGot;
	private String commentOfClient; // коментарий заказчика
	private String commentOfManager; // коментарий менеджера
	private Date dateTimeOfArrive;
	private Date dateTimeOfDeparture;
	private float amountOfStay; // сумма за проживание
	private float gotFromAmountOfStay;
	private Date dateWhenAmountIsGot;
	private int paymantMethod;// 0 - наличные 1 - картой
								// 2 - денежный перевод...

}
