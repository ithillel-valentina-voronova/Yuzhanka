//import java.text.SimpleDateFormat;
package org.hillel.it.yuzhanka.model.entity;
import java.util.Date;


public class Guest 
{
	String firstName;
	String lastName;
	String partonymic;
	
	String email;
	
	boolean registered;
	
	Date timeOfRegistration;
	
	int uin; //� ������� ������������ ���� ���������� �� ��
	
	// Reservation reservations[];

	public Guest(String firstName, String lastName, String partonymic,
			String email) 
	{
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.partonymic = partonymic;
		this.email = email;
		
		//������� ����� ��������������������. ���� �� ���������, ������ ��� ���������� ��������
		registered = false;
		
		//���� �� ��������������, ��� � timeOfRegistration �������� ������� ���� � �����
		
		//������ ��� �������. ���� ������������ (��) ���������������, �� ��� �������-  �� ������ ����.
		// �� ����� ���������� ��� ������ � ������� ���������� ������������
		// ��� ��� ���������� �������� � ���� � ���� ������ �� �����
		
		
		
		//���������������� uin ��������� � ����. ���� ��� ������, �� �������. ����� 
		//����������� uin �� ���� �� ����
		
		//TODO ������������� uin
		
		
	}
	
	
	
	
	
	
	

}
