package oops_concepts_priyankamam;

//superclass
class v{
	
	//method1
	void get(int n) {
		System.out.println("monday "+n);
	}
	
	//const1
	v(){
		System.err.println("output for const. : ");
		System.out.println("friday");
	}
}

//subclass
class p extends v{
	
	//method2
	void get1() {
		super.get(500); //super.method
		System.out.println("tuesday");
	}
	
	//const2
	p(){
		super(); //super.const
		System.out.println("sunday");
		System.out.println();
		System.err.println("output for method : ");
	}
}
public class super_method_const {
	public static void main(String[] args) {
		p p1=new p(); //run const
		p1.get1(); //run method
	}
	

}
