public class PaymentControl 
{
	private PaymentConsole paym= new PaymentConsole();
	public boolean excute(boolean Isdelivery,double discount,String username,double amo,String ser,String ser_prov)
	{
		
		return paym.run( Isdelivery,discount, username, amo, ser, ser_prov);
		
	}
}
