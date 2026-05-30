abstract class vehicle
{
 abstract void start();
	 void stop () {
		 System.out.println("THe vehicle is stoping ");
	 }
}
class car extends vehicle{
	public void start () {
		System.out.println("THe car is starting ");
	}

}
class bike extends  vehicle{
	public void start () {
		System.out.println("THe bike is starting ");
	}

}


public class abstractt {

	public static void main(String[] args) {
		vehicle v;
		v =new car();
		v.start();
		v.stop();
		v =new bike();
		v.start();
		v.stop();
		
	}

}
