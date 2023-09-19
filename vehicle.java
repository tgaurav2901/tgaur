package car_dealer;

public class vehicle {

	private String model;
	private int yearofmanuf;
	private double cost;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearofmanuf() {
		return yearofmanuf;
	}
	public void setYearofmanuf(int yearofmanuf) {
		this.yearofmanuf = yearofmanuf;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
public double loantaken(customer c,vehicle v) {
	if(c.finance(c,v)==true && c.getCibilScore()>=750) {
	double d=getCost()-c.getCashinHand();
	//
	return d;
	}
	else {
	System.out.println("cash payment");
		return 0;
	}
	
}
	public double EmiOption(int a,customer c,vehicle v) {
		if(loantaken(c,v)==0) {
			//System.out.println("No loan can be granted");
			
		}
		else
		{
			System.out.println("Loan of"+" "+loantaken(c,v)+" "+"Granted");
		
		if(a==12) {
			double b=loantaken(c,v)+((loantaken(c,v)*12*12)/100);
			double d=b/12;
			return d;
		}
		else if(a==18) {
			double b=loantaken(c,v)+((loantaken(c,v)*14*18)/100);
			double d=b/18;
			return d;
		}
		else if(a==24) {
			double b=loantaken(c,v)+((loantaken(c,v)*16*24)/100);
			double d=b/24;
			return d;
		}
		else if(a==36) {
			double b=loantaken(c,v)+((loantaken(c,v)*18*36)/100);
			double d=b/36;
			return d;
		}}
		return 0;
	}
	
}
