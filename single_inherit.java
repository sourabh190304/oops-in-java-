package oops_concepts_priyankamam;

class aa
{ 
	void get()
	{
		System.out.println("base class");
	}
}
class bb extends aa{
	void show() {
		System.out.println("derived class");
	}
}

public class single_inherit {
	public static void main(String[] args) {
		bb b11= new bb();
		b11.show();
		b11.get();
	}

}
