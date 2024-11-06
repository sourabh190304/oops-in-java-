package oops_concepts_priyankamam;
class aa1
{ 
	void get()
	{
		System.out.println("base class");
	}
}
class bb1 extends aa{
	void show() {
		System.out.println("derived class");
	}
}
class cc extends bb1{
	void display() {
		System.out.println("1 derived class");
	}
}

public class multilevel_inherit {
	public static void main(String[] args) {
		cc c1= new cc();
		c1.get();
		c1.display();
		c1.show();
	}

}
