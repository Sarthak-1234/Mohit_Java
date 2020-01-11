package Constructor_StaticBlock_IIBBlock;

public class ContainsAll {
	
	public ContainsAll() {
		System.out.println("I am Constructor");
	}
	
	static {
		System.out.println("I am Static Block");
	}
	
	{
		System.out.println("I am IIB Block");
	}
	
	public static void main(String args[]) {
		ContainsAll obj = new ContainsAll("Mohit");
		System.out.println("I am in PSVM");
		System.out.println("-----Rest Piece of Code-----");
		obj.ContainsAll("Sarthak");
	
		
	}
	
	public void ContainsAll(String abc) {
		System.out.println(abc);
	}
	
	public ContainsAll(String abc) {
		System.out.println(abc);
	}
	
	//I am in static block
	//I am in IIB Block
	//Mohit
	//I am in PSVM
	//----Rest Piece of Code---
	//Sarthak
	

}
