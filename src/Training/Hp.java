package Training;

import net.bytebuddy.description.modifier.SynchronizationState;

public class Hp implements Laptop {
	{
		
		
		}

	@Override
	public void ram() {
		System.out.println("ram is 5 gb");
		
	}

	@Override
	public void hdd() {
		System.out.println("ram is 500 gb");
		
	}

	@Override
	public void display() {
		System.out.println("LAPTOP IS HP");
		
	}
	
	void m1 () {
		System.out.println("EXTRAA");
	}

	public static void main(String[] args) {
		Laptop l = new Hp();
		l.display();
		l.hdd();
		l.ram();
		Hp h= new Hp();
		h.display();
		h.hdd();
		h.display();
		h.m1();
		
		
	}
	

	}


