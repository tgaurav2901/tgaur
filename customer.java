package car_dealer;

public class customer {

	private String name;
	private String address;
	private double cashinHand;
	private int cibilScore;
	private int emi;
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	vehicle v=new vehicle();
	employee e=new employee();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCashinHand() {
		return cashinHand;
	}
	public void setCashinHand(double cashinHand) {
		this.cashinHand = cashinHand;
	}
	
	public boolean finance(customer c,vehicle v) {
		if(getCashinHand()>=v.getCost()) {
			//System.out.println("No loan needed, customer will pay in cash");
			return false;
		}
		else if(getCashinHand()<v.getCost()) {
			//System.out.println("Need loan for finance");
			return true;
		}
		return true;
	}
	
	
	
	public void deal(customer c,vehicle v,employee e) {
		boolean f=finance(c,v);
		double f1=0;
		f1=v.EmiOption(c.emi, c,v);
		if(f==true && f1!=0) {
			
		System.out.println(c.getName()+" has choosen"+" "+v.getModel()+" "+"and emi for which is="+" "+f1);
	}
		else if(f1!=0 || f==false){
			System.out.println(c.getName()+" had choosen"+" "+v.getModel()+" "+"whose cost is="+" "+v.getCost()+"and mode payment is cash");
		}
		if(f1!=0|| f==false) {
		System.out.println("Employee name is"+" "+e.getname()+" "+"whose id is:"+" "+e.getId()+" "+"sold vehicle of:"+" "+v.getCost());
	}
		}
	
}
