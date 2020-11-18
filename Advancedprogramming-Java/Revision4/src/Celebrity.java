
public class Celebrity {

	String name;
	String whatTheyAreFamousFor;
	String instagramUserName;
	
	
	public Celebrity(String name) {
		this.name = name;
		
		System.out.println(this.name);
	}
	
	public Celebrity(String name, String whatTheyAreFamousFor) {
		this.name = name;
		this.whatTheyAreFamousFor = whatTheyAreFamousFor;
		
		System.out.println(this.name + "\t is a\t " + this.whatTheyAreFamousFor);
	}
	
	public Celebrity(String name, String whatTheyAreFamousFor, String instagramUserName) {
		this.name = name;
		this.whatTheyAreFamousFor = whatTheyAreFamousFor;
		this.instagramUserName = instagramUserName;
		
		System.out.println(this.name + "\t is a\t " + this.whatTheyAreFamousFor + "\t and instagram is \t@" + this.instagramUserName);
	}
	
	
}
