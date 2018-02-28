
public class Car {
	
	private double totalCost;
	private double downPayment;
	private double months;
	private double interestRate;
	
	public Car(double totalCost, double downPayment, double months, double interestRate) {
		super();
		this.totalCost = totalCost;
		this.downPayment = downPayment;
		this.months = months;
		this.interestRate = interestRate;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public double getMonths() {
		return months;
	}
	public void setMonths(double months) {
		this.months = months;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double Monthly() {
		double iR = (interestRate/100)/12;
		double answer = totalCost * ((iR*Math.pow(1+iR,months)/(Math.pow(1+iR,months)-1)));
		return Math.round(answer*100.0)/100.0;
	}
	
	public double interestPaid() {
		double iR = (interestRate/100)/12;
		double answer = ((totalCost * ((iR*Math.pow(1+iR,months)/(Math.pow(1+iR,months)-1)))) * months) - totalCost;
		return Math.round(answer*100.0)/100.0;
	}

}
