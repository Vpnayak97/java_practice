interface  vehiclee{
	  void start();
	 default void stop () {
		 System.out.println("THe vehicle is stoping ");
	 }
}
class carr implements vehiclee{
	public void start () {
		System.out.println("THe car is starting ");
	}

}
class bikee implements vehiclee{
	public void start () {
		System.out.println("THe bike is starting ");
	}

}
public class interfacee {

	public static void main(String[] args) {
		vehiclee v;
		v =new carr();
		v.start();
		v.stop();
		v =new bikee();
		v.start();
		v.stop();
	}

}
