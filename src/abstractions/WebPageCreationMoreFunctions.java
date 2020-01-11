package abstractions;

abstract public class WebPageCreationMoreFunctions extends WebPageCreation{

	@Override
	public void add() {
		System.out.println("add");
	}

	@Override
	public void delete() {
		System.out.println("delete");
	}

	@Override
	public void modify() {
		System.out.println("modify");
	}

	abstract public void run();
	
	//inhertiance ===extends
	//interface -----implements
	//abstractions =====extends

}
