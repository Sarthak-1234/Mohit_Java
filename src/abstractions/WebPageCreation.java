package abstractions;

abstract public class WebPageCreation {
	
	public void URLForWeb() {
		System.out.println("https://www.google.com");
	}
	
	public void Title() {
		System.out.println("Title");
	}
	
	abstract public void add();
	abstract public void delete();
	abstract public void modify();
	abstract public void run();

}
