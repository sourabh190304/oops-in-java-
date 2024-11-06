package oops_concepts_priyankamam;
class emp{
	int id;
	String name;
	int pin;
	String add;
	int pinnum;
	String city;
	int srno;
	String tal_gaon;
	
}
public class day1 {
	public static void main(String[] args) {
		emp e1= new emp();
		int x=e1.id=001;
		String y=e1.name="ram";
		int z=e1.pin=1234;
		String k=e1.add="hadapsar_gaon";
		System.out.println("1) "+x+"\n2) "+y+"\n3) "+z+"\n4) "+k);
		
		emp e2=new emp();
		int n=e2.pinnum=411028;
		String c=e2.city="pune";
		int s=e2.srno=203;
		String t=e2.tal_gaon="hadapasar_gaon";
		System.out.println("\n"+"1) "+n+"\n2) "+c+"\n3) "+s+"\n4) "+t);
	}

}
