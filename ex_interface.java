package oops_concepts_priyankamam;

//i1
interface sam11
{
	int c=55;
	void square();
}

//i2
interface sam22
{
	float f=3.3f;
	void sub();
	default void show1() {
		this.myfun();
	}
	public static void show(op op1) {
		System.out.println("static");
	}
	private void myfun() {
		System.out.println("myfun");
	}
}

class op implements sam11,sam22{
	
	public void square() {
		int a=10;
		System.out.println(a*a);
		System.out.println(c+" "+f);
	}
	
	public void sub() {
		int d=10;
		int e=20;
		System.out.println(e-d);
	}
	
	  
}
public class ex_interface {
	public static void main(String[] args) {
		op op1=new op();
		op1.square();
		op1.sub();
		sam22.show(op1);
		op1.show1();
	}
	

}
