package week1day1assessment;

public class Mobile {
public void makecall() {
	String mobileModel="realme";
	float mobileWeight=109.5f;
	System.out.println("Mobilemodel name " +mobileModel);
	System.out.println("mobile weight " +mobileWeight);
}
public void sendMsg() {
	boolean FullCharged=true;
	int mobilecost=18000;
	System.out.println("Is mobile fully charged " +FullCharged);
	System.out.println("Mobile cost " +mobilecost);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my mobile");
		Mobile obj=new Mobile();
		obj.makecall();
		obj.sendMsg();
	}

}
