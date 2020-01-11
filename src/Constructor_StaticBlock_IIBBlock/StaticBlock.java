package Constructor_StaticBlock_IIBBlock;

public class StaticBlock {
	
	
	StaticBlock(){
		System.out.println("I am Constructor");
	}
	
	public static void main(String args[]) {
		
		System.out.println("I am in psvm");
		
		
		//------
		
		
		StaticBlock obj = new StaticBlock();
	}
	
	
	static {
		System.out.println("I am static Block");
	}
	
	
	//ek class ke ander sabse pehle static block chalta hai
	
	
	//static block ---run hota h jab class load hoti hai
	//constructor call ---jab class ka object banate h

}
