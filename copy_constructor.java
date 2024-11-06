package oops_concepts_priyankamam;
class demo9{
	int id;
	String name;
	demo9(int i,String n)
	{
		id=i;
		name=n;
	}
	demo9(demo9 dd) // copy constructor from d1 object
	{
		id=dd.id;
		name=dd.name;
	}
	void display()
	{
		System.out.println(id);
		System.out.println(name);	
	}
}

public class copy_constructor {
	public static void main(String[] args) {
		demo9 d1=new demo9(9,"saurabh");
		d1.display();
		demo9 d2=new demo9(d1);
	}

}
