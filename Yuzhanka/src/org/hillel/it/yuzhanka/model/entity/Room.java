//������� ��� ���� ������ private ???

package org.hillel.it.yuzhanka.model.entity;
public class Room 
{
	
	int id; //���������� ����������� ������� ������. ������ �� ������ ����� �������,
	//����� ������� � ���� � ���������
	
	String description; //�������� ������� ������
	
	//����� ���� ���������� boolean
	boolean tv;
	boolean sattelite;
	boolean airConditioner;
	boolean wifi;
	boolean kettle;
	boolean fridge;
	boolean hairDryer;
	//etc.
	
	
	double price; // �� ��������� ������?
	
	String type; //������� �� ��� final static
	
	boolean active; //���� ����� �� ������� , �� �� �� �������
	
	int floor;
	
	int maxSleeps; //���������� �������� ����

	public Room(String description, boolean tv, boolean sattelite,
			boolean airConditioner, boolean wifi, boolean kettle,
			boolean fridge, boolean hairDryer, double price, String type,
			boolean active, int floor) 
	{
		
		// id �������������� ���������, ���������� �� ���� ��� ������������ �� ��
		//���� � ���� ����� � ���� ����, �������
		
		// TODO ������������� id.
		
		
		this.description = description;
		this.tv = tv;
		this.sattelite = sattelite;
		this.airConditioner = airConditioner;
		this.wifi = wifi;
		this.kettle = kettle;
		this.fridge = fridge;
		this.hairDryer = hairDryer;
		
		this.type = type;
		
		//���� �������������� ������ �� type
		//��������� ������� ����, ���� ���� ���� ������ �������� �� �����������
		
		//TODO ����������� ����
		
		this.active = active;
		this.floor = floor;
		
		//maxSleeps ���������������� ������ �� ���� �����
		
		//TODO ������������� maxSleeps;
		
		
		//TODO ���-�� ������ � ������������
	}
	
	
}
