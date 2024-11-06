package oops_concepts_priyankamam;
class bank{
	void namebank() {
		System.out.println("hdfc bank");
	}
}
class atm extends bank{
	void atm1(){
		System.out.println("atm of hdfc bank");
	}
}
class customer extends atm 
{
	void cust() { 
		System.out.println("customer of hdfc bank");
	}
}

public class ex_multilevel {
	public static void main(String[] args) {
		customer c12= new customer();
		c12.atm1();
		c12.cust();
		c12.namebank();
	}

	
	

}
