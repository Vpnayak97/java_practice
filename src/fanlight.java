interface  control {
	  void on();
	  void off ();
}
class fan  implements control{
	 public void on() {
		 System.out.println("the fan switched on ");
	 }
	 public   void off () {
		  System.out.println("the fan switched off ");
	  }
}
class light  implements control{
	 public void on() {
		 System.out.println("the light switched on ");
	 }
	 public   void off () {
		  System.out.println("the light switched off ");
	  }
}
public class fanlight {

	public static void main(String[] args) {
		control l;
		l=new fan();
		l.on();
		l.off();
		l=new light();
		l.on();
		l.off();
		
	}
	}

