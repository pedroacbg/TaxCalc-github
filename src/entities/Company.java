package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double res = 0.0;
		if(numberOfEmployees > 10) {
			res = super.getAnualIncome() * 0.14;
		}else {
			res = super.getAnualIncome() * 0.16;
		}
		return res;
	}

}
