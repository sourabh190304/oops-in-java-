package oops_concepts_priyankamam;
class vechicle{
	String vcol;
	int vwheel;
	int gwheel;

 vechicle(String c,int g, int v)
 {
	vcol=c;
	gwheel=g;
	vwheel=v;
	System.out.println(c+" "+g+" "+v);
 }
 vechicle(vechicle vd)
 {
	System.out.println(vcol);
	System.out.println(gwheel);
	
 }
 void display() 
 {
	System.out.println(gwheel); 
 }
}
public class assigment_constructer {
	public static void main(String[] args) {
		vechicle v1=new vechicle("red",4,6);
		v1.display();
		vechicle v2=new vechicle("white",4,5);
		v2.display();
		
	}

}
