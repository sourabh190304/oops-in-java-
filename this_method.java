package oops_concepts_priyankamam;

class demo1
{
	void get() {
		System.out.println("first");
	}
	void get1() {
		this.get();
		System.out.println("second");
	}
	void get2() {
		this.get1();
		System.out.println("third");
		System.out.println();
	}
	
}
// this keyword for constructor
class school
{
	school(String add)
	{
		System.out.println("sadhna highschool: " +add);
	}
	school(int n)
	{
		this("hadapasar");
		System.out.println("modern highschool" +n);
	}
	
}
public class this_method {
	public static void main(String[] args) {
		// printing methood
		demo1 d11=new demo1();
		d11.get2();
		
		//printing constructor
		school d12=new school(2);
	}

}
