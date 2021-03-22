package variable;

public class StaticAndNonstaticArea {
	

	static String name="Banna";
	String name1="Nahid";
	
	
	public static void main(String[] args) {
		
		//In java class there are two types of area. Static and NonStatic.
		//You must declear a static keyword to make it static.
		//By default everything is non-static means INSTANCE
		
		//Access Specifier 
		// if it is static it is easy to access.
		// Static property will have direct access to any area. 
		// Instance to instance direct access 
		// instance to static in-direct access
		
		
		StaticAndNonstaticArea sta = new StaticAndNonstaticArea();
		sta.m1();
		m2();
	}

	public void m1() {
		
		System.out.println(name);	
	}
	
	public static void m2() {
		
		// Class Referantial access
		// Class name, var, = new class name ();
		
		StaticAndNonstaticArea sta = new StaticAndNonstaticArea();
		System.out.println(sta.name1);
		System.out.println(name);
		
	}
	
	public void m3() {
		
		
		
	}	
	
}
