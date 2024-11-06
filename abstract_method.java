package oops_concepts_priyankamam;

abstract class mydemo{
	// we can add both method in it abstract as well as default method
	// we cannot create object for abstract keyword
	abstract void vd1();
	abstract void vd2();
	void vd3() {
		System.out.println("vd3");
	}	
}

class mydemo2 extends mydemo{
	void vd1() {
		System.out.println("vd1");
	}
	void vd2() {
		System.out.println("vd2");
	}
}
public class abstract_method {
	public static void main(String[] args) {
		mydemo md=new mydemo2();
		md.vd1();
		md.vd2();
		md.vd3();
	}

}
