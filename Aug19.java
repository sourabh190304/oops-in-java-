package oops_concepts_priyankamam;
class demoo{
	demoo(){
		System.out.println("hey i am constructor!..");
	}
	
	demoo(int n,String ch)
	{
		System.out.println(n+" "+ch);	
	}
	demoo(int n,String ch,String pr){
		System.out.println(n+" "+ch+" "+pr);
	}
}
public class Aug19 {
	public static void main(String[] args) {
		
		demoo d1=new demoo(9,"saurabh","student");
	}
	

}
