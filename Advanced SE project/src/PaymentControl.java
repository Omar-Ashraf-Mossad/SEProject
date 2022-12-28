public class PaymentControl 
{
	private PaymentConsole paym= new PaymentConsole();
	public String excute(boolean Isdelivery,double discount1,double discount2,String username,double amo,String ser_prov)
	{
		
		return paym.run( Isdelivery,discount1,discount2, username, amo, ser_prov);
		
	}
}
