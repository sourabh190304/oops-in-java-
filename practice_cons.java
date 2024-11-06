package oops_concepts_priyankamam;
class thisk{
	int id;
	String name;
	void demo(int id, String name){
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.print(id+" ");
		System.out.println(name);
	}
}
public class practice_cons {
	public static void main(String[] args) {
		thisk t1= new thisk();
		t1.demo(11, "saurabh");
		t1.display();
	}


}
