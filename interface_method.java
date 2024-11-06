package oops_concepts_priyankamam;

interface car{
	// in interface every varible declare as as public final variable 
	int a=10;
	// interface methoods are by default abstract methoods 
	void jeep();
	void contessa();
	// if we want to declare default method we use default keyword
	default void ford() {
		System.out.println("mustang----->");
	}
}

abstract class carcompany implements car{
	abstract void toyota();
	public void jeep() {
		System.out.println("meridian...!");
	}
	public void contessa() {
		System.out.println("heritage...!");
	}
}

class showroom extends carcompany{
	public void toyota() {
		System.out.println("corrolla altis____");
	}
}
public class interface_method {
	public static void main(String[] args) {
		carcompany c1=new showroom();
	//  reference obj_name = DMA constructer
		c1.jeep();
		c1.contessa();
		c1.ford();
		c1.toyota();
		
	}
}
