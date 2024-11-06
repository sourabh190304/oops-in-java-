package oops_concepts_priyankamam;

class abc
{
    void demo() {
    	System.out.println("hello ");
    }
}
class xyz
{
	abc a1=new abc();
	void demo1() {
		System.out.println("sky ");
	}
}

class pqr
{
	//agregate function object of recent class in another class
	xyz xy=new xyz();
	void demo2() {
		System.out.println("god");
	}
	
}

public class agreaeter {
	public static void main(String[] args) {
		pqr pq=new pqr();
		//calling c1 object using c3 object
		pq.xy.a1.demo();
		////calling c2 object using c3 object
		pq.xy.demo1();
		pq.demo2();
	}

}
