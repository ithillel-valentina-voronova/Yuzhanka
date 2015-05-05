package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class User {
	private int id;
	private String email; // об€зательное поле. ƒолжно сохран€ть уникальность.
							// Ѕудет использоватьс€ дл€ авторизации
	private String password; // скорее всего HASH а не сам пароль. ≈сли человек
								// оставл€ет бронь без регистрации выслать на
								// почту письмо с данными дл€ входа и
								// сгенерированным паролем
	private Date createdAt;
	private String lastName;
	private String firstName;
	private String patronymic;
	private Date dateOfBirdh;
	private String homeAddress;
	private String passportSerieAndNumber;
	private String passportWhereAndWhenHanded;
}
