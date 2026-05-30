class animal{
	void sound()
	{
		System.out.println("Animal making sounds");
	}
}
class dogg extends animal
{ void sound() {
	System.out.println("dog making sounds");
}}
class catt extends animal
{ void sound() {
	System.out.println("cat making sounds");
}}

public class overiding {

	public static void main(String[] args) {
	animal a=new animal();
	dogg d = new dogg();
	catt c=new catt();
	a.sound();
	d.sound();
	c.sound();
	}

}
