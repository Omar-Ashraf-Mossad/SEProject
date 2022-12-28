
public class Pay_on_delivery implements Payment {
	public String pay(String name,double amount,String sp) {
		String s=name;
		double k=amount;
		String ss=sp;
		return "Congrats! "+s+" ,you have paid for the service: "+sp+"that costed: "+amount+" on delivery";
	}

}
