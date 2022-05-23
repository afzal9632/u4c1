package com.masai;

public class Car {
	
   String model;
   String companyName;
   String color;
	
	public Car(String model,String companyName, String color) {
		
		this.model =model;
		this.companyName = companyName;
		this.color = color;
		
	}
	
	public void showDetails()
	{
		System.out.println("Car Model :"+model);
		System.out.println("Car companyName :"+companyName);
		System.out.println("Car color: "+color);
		
	}

	public static void main(String[] args) {
		
		Car d1= new Car("Harrier","Tesla","black");
		
		Engine d2 = new Engine();
		
		d2.setrpm(10000);
		d2.setpower(110);
		d2.setmanufacturer("tata");
		d2.sethasTurbo(true);
		
		d1.showDetails();
		
		System.out.println("Car RPM :"+d2.getrpm());
		System.out.println("Car Power:"+d2.getpower());
		System.out.println("Car Engine Manufacturer: "+d2.getmanufacturer());
		System.out.println("Car Has Turbo: "+d2.gethasTurbo());
		
		
	}

}
class Engine{
	
	private int rpm;
	private int power;
	private String manufacturer;
	private Boolean hasTurbo = false;
	
	void Engine() {
		
	}

	public void setrpm(int rpm) {
		this.rpm = rpm;
	}
	
	public int getrpm()
	{
		return rpm;
	}
	
	public void setpower(int power) {
		this.power = power;
	}
	
	public int getpower()
	{
		return power;
	}
	
	public void setmanufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getmanufacturer()
	{
		return manufacturer;
	}
	
	public void sethasTurbo(Boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}
	
	public Boolean gethasTurbo()
	{
		return hasTurbo;
	}
	
	
}