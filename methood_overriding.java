package oops_concepts_priyankamam;
class M1
{
	//method1
	void m1()
	{
		System.out.println("demo");
	}
} 
class M2 extends M1
{
	//method2
	void m1()
	{
		System.out.println("demo1");
	}
}
public class methood_overriding {
	public static void main(String[] args) {
		M2 m3=new M2();
		m3.m1(); //runmethod1
		m3.m1(); //runmethod2
		//o/p-demo1 demo1
	}

}
