package overriding;

class Animal{
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog extends Animal{
	public void move() {
		System.out.println("Dog can walk & run");
	}
}

public class testDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		Animal b= new Dog();
		a.move();
		b.move();
		

	}

}
