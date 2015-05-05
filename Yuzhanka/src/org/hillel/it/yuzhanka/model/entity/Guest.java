//import java.text.SimpleDateFormat;
import java.util.Date;


public class Guest 
{
	String firstName;
	String lastName;
	String partonymic;
	
	String email;
	
	boolean registered;
	
	Date timeOfRegistration;
	
	int uin; //у каждого пользователя свой уникальный ай ди
	
	// Reservation reservations[];

	public Guest(String firstName, String lastName, String partonymic,
			String email) 
	{
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.partonymic = partonymic;
		this.email = email;
		
		//создаем гостя незарегестрированным. если он зарегился, меняет эту переменную сеттером
		registered = false;
		
		//если он регестрируется, что в timeOfRegistration попадает текущая дата и время
		
		//массив его заказов. если пользователь (не) зарегестрирован, но без заказов-  то массив пуст.
		// мы можем посмотреть все заказы у каждого отдельного пользователя
		// или эта информация хранится в базе и этот массив не нужен
		
		
		
		//инициализировать uin посмотрев в базу. если это первый, то единица. иначе 
		//увеличиваем uin из базы на один
		
		//TODO инициализация uin
		
		
	}
	
	
	
	
	
	
	

}
