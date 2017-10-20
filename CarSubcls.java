package abst.cls.pkg;


public class CarSubcls extends Car {

	public CarSubcls(String company) {
		super(company);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void carDetails() {
		System.out.println("This car from "+ getCompany() + " has " + color + " color "+" and " + wheels + " wheels");
		
	}
	
	public static void main(String[] args) {
		Car cd= new CarSubcls("BMW");
		
		cd.carDetails();
		}

}
