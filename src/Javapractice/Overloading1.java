package Javapractice;

public class Overloading1 {
	void add() {
		System.out.println("without arg");
	}
	
	void add(int a) {
		System.out.println("with arg ");
	}
	
	void add(char a) {
		System.out.println("with char arg ");
	}

	public static void main(String[] args) {
		Overloading1 t=new Overloading1();
		//t.add();
		//t.add(2);
		t.add('a');
		
		
		

	}

}
