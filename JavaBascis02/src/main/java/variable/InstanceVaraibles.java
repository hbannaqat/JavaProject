package variable;

public class InstanceVaraibles {

	
	String name;
	int age=22;
		
	
		// MUST HAVE CONDITIONS:
		// Scope= inside the class but outside the method. As a results variable are common for all the methods. 
		// Instance Variable must have a data type.
		// Must declear name
		// instance variable does not have to declear value 
		// If you do not declear value than it takes default value. [int=0, string=null,boolean=false]
		// Instance variable can take any modifier.
		// 

	
	public static void main(String[] args) {
		
		InstanceVaraibles ins = new InstanceVaraibles();
		ins.name();
		ins.age();	

	}
	public  void name() {
		name= "Inaaya";
		System.out.println(name);
		
	}
	
	public void age() {
		System.out.println(age);
		
	}
	
	
	
}
