 class Animal {
	void sound() {
		System.out.println("Animal is  makig sound ");
	}
}
 class dog extends Animal{
		 
	 void eat()
	 {
		 System.out.println("dog is eating ");}
	 }
 class cat extends dog{
	 void run() {
		 System.out.println("Cat is running");
	 }
 }
 class puppy extends cat {
	 void sleep () {
		 System.out.println("Puppy is sleeping ");
	 }
 }
	 
public class oops2 {

	public static void main(String[] args) {
		puppy g=new puppy();
g.eat();
g.sound();
g.run();
g.sleep();
	}
}
