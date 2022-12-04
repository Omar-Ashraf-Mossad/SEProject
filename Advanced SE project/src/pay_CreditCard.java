
public class pay_CreditCard implements Payment {
	public boolean pay(String name,double amount,String sp) {
		String s_credit=name;
		double k_credit=amount;
		String ss_credit=sp;
		System.out.println("Congrats! "+s_credit+" ,you have paid for the service: "+ss_credit+"that costed: "+k_credit+" via credit card");
		return true;
	}

}