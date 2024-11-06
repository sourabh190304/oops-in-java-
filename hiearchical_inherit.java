package oops_concepts_priyankamam;
class B11{
	void b() {
		System.out.println("base");
	}
}
class A11 extends B11 {
	void a() {
		System.out.println("derived 1");
	}	
}
class C extends B11{
	void c() {
		System.out.println("derived 2");
	}
}
public class hiearchical_inherit {
	public static void main(String[] args) {
		A11 b0= new A11();
		b0.b();
		b0.a();
		C c0= new C();
		c0.b();
		c0.c();
		
	}

}
