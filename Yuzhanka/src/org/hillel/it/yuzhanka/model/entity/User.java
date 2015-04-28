package org.hillel.it.yuzhanka.model.entity;

public class User {
int id;
String email; // об€зательное поле. ƒолжно сохран€ть уникальность.
String password; //скорее всего HASH а не сам пароль
String dateOfRegistration; // ¬озможно помен€ем на Date
String lastName;
String firstName;
String patronymic;
String dateOfBirdh;
String homeAddress;
}
