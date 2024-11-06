package oops_concepts_priyankamam;
class s1{
	int a=10;
}
class s2 extends s1
{
	int a=20;
     void display() {
    	 System.out.println(a+" "+super.a); //using supeer keyword 
    	                                    //we access the data of a 
    	 									//in superclass(super.a)
     }
}
public class superk {
	public static void main(String[] args) {
		s2 s4=new s2();
		s4.display();
	}

}
