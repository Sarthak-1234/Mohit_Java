package Constructor_StaticBlock_IIBBlock;

public class Constructors {
	
	//Constructor = Function
	
	//Diff - 1. Constructor ka naam = Class Ka naam
	//2. Constructor by default call hote h on creating object
	//3. Function ka retrun type hota hai...constructor ka nhi hota
	
	
	//bydefault constructor
	public Constructors(){
		
	}
	
	//Parameterized Constructor
	public Constructors(String abc) {
		
	}
	
	public Constructors (int i, String ab) {
		System.out.println(i+"-----"+ab);
	}
	
	public void Constructors() {
		System.out.println("I am function not constructor as i have retrun type");
	}

}
