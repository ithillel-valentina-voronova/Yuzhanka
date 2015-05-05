package org.hillel.it.yuzhanka.model.entity;


public class Feedback 
{
	int id;//нужен ли номер отзыва??
	
	
	int guestUin; //кто написал
	
	
	//String notCheckedFeedback - может отзыв сначала попадает сюда?
	String feedback; //текст отзыва
	
	//по uin пользователя проверить, зарегестрирован ли он
	//если нет - нет доступа к написания отзыва
}
