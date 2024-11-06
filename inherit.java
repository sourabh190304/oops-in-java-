package oops_concepts_priyankamam;
// parent class
class A
{
	void demo() 
	{
		System.out.print("property parent + ");
	}
}
//child class
class B extends A // inherit a class A by using Extend keyword
{
	void demo2()
	{
		System.out.println("property child = /n "
				+"total property");
	}
}
public class inherit {
	public static void main(String[] args) {
		B B1=new B();
		B1.demo();
		B1.demo2();
	}

}
