//сделать все поля класса private ???

package org.hillel.it.yuzhanka.model.entity;
public class Room 
{
	
	int id; //уникальный индефикатор каждого номера. первый на каждом этаже еденица,
	//потом залазим в базу и вычисляем
	
	String description; //описание каждого номера
	
	//целая куча переменных boolean
	boolean tv;
	boolean sattelite;
	boolean airConditioner;
	boolean wifi;
	boolean kettle;
	boolean fridge;
	boolean hairDryer;
	//etc.
	
	
	double price; // по умолчанию гривна?
	
	String type; //сделать ли его final static
	
	boolean active; //если номер на ремонте , то он не активен
	
	int floor;
	
	int maxSleeps; //количество спальных мест

	public Room(String description, boolean tv, boolean sattelite,
			boolean airConditioner, boolean wifi, boolean kettle,
			boolean fridge, boolean hairDryer, double price, String type,
			boolean active, int floor) 
	{
		
		// id инициализирует программа, подтягивая из базы уже существующие ай ди
		//если в базе пусто в этом поле, еденица
		
		// TODO инициализация id.
		
		
		this.description = description;
		this.tv = tv;
		this.sattelite = sattelite;
		this.airConditioner = airConditioner;
		this.wifi = wifi;
		this.kettle = kettle;
		this.fridge = fridge;
		this.hairDryer = hairDryer;
		
		this.type = type;
		
		//цену инициализируем исходя из type
		//проверяем текущую дату, если июль июнь август умножаем на коэффициент
		
		//TODO образование цены
		
		this.active = active;
		this.floor = floor;
		
		//maxSleeps инициализируется исходя из типа номер
		
		//TODO инициализация maxSleeps;
		
		
		//TODO что-то решить с фотографиями
	}
	
	
}
