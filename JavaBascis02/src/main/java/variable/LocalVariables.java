package variable;


public class LocalVariables {

	
	
	public static void main(String[] args) {
		age();
		name();
	}

	public static void age() {
		
		
		int age=22; 				
		System.out.println(age);	
		// MUST CONDITIONS:
		// datatype name equal sign and value = variable. Variable is a place holder
		// Int is data type, must declear data type in variable
		// age is the variable, must have name of variable
		// = is operator
		//MUST NOT CONDITIONS:
		// 22 is the value
		// local variable must declear the value.
		// scope of the local variable is only inside the method.
		// local variable cannot have any other modifier but final
		// Public, private default is not applicable for local variable only final means fixed no changes. 
		
		
		int choclate = 5;
		int soda = 5;
		int total = choclate+soda;
		System.out.println("Total cost is "+total);
		
		int fromHome=28;
		int Return = fromHome-total;
		System.out.println(Return);
		
		
	}
	
		public static void name() {
			String Fname = "Inaaya";
			String Lname = "Binte";
			String fullName=Fname+" "+Lname;
			System.out.println(fullName);
			
			
		}
	
}
