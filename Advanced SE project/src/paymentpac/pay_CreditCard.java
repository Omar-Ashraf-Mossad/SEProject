package paymentpac;
public class pay_CreditCard implements Payment {
	
	private int  card;
	pay_CreditCard(int c)
	{
		card = c;
	}
	public String pay(String name,double amount,String sp) {
		String s_credit=name;
		double k_credit=amount;
		String ss_credit=sp;
		return ("Congrats! "+s_credit+" ,you have paid for the service: "+ss_credit+"that costed: "+k_credit+" via credit card"+card);
	}

}