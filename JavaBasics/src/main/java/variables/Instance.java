package variables;

public class Instance {

int age; // Instance Variable
	
	public static void main(String[] args) {
		
	Instance v2=new Instance();
	v2.faruq();
	khaled();
	mili();
	v2.sana();		
		
	}
	
	private void faruq() {
		age = 25;
		System.out.println("faruq age is" +age);		
	}
	
	public static void khaled() {
		
		Instance v3=new Instance();
		v3.age=30;
				System.out.println("khaled age is"+v3.age);
	}
	public void sana() {
		age=33;
		System.out.println("sana is"+age+"years old");	
	}
	
	public static void mili() {
		Instance v4=new Instance();
		v4.age=30;
		System.out.println("khaled age is"+v4.age);
			
	} 	
}