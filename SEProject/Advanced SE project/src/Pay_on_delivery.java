
public class Pay_on_delivery implements Payment {
	public boolean pay(String name,double amount,String sp) {
		String s=name;
		double k=amount;
		String ss=sp;
		System.out.println("Congrats! "+s+" ,you have paid for the service: "+sp+"that costed: "+amount+" on delivery");
		return true;
	}

}
