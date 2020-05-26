package OopsConcept;

public class AbstractioDemo {
	
	private void display() {
		System.out.println("from parent class");
	}

	

}
 class B extends AbstractioDemo{
	 private void display() {
		 System.out.println("from child class");
	 }
	
	 public static void main(String[] args) {
			
		B b =new B();
		b.display();
			

		}
 }
