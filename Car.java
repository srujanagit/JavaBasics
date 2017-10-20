package abst.cls.pkg;
//this is changed classfrom srujana2
public abstract class Car {

	protected String color ="red";
	protected int wheels=4;
	private String company;
	
	
	public Car(String company) {
		
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public abstract void carDetails();
	
}
