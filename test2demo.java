package oops_concepts_priyankamam;
class test1{
	int num1;
	int num2;
	}
class test2 extends test1{
	int num3;
	void get2() {
		System.out.println(num1+"\n"+num2+"\n"+num3);
	}
}
public class test2demo {
	public static void main(String[] args) {
		test2 t2=new test2();
		t2.num1=10;
		t2.num2=20;
		t2.num3=30;
		t2.get2();
	}

}
