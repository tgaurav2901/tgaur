package car_dealer;

public class dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v= new vehicle();
		employee e=new employee();
		customer c=new customer();
		c.setName("Gaurav");
		c.setAddress("Noida");
		c.setCashinHand(10000000);
		c.setCibilScore(807);
		c.setEmi(24);
e.setId(12);
e.setname("Ayush");
v.setCost(1200000);
v.setModel("Scorpio");
v.setYearofmanuf(2022);

c.deal(c,v,e);

	}

}
