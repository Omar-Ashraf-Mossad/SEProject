package userPack;

public interface Isign {
	public String sign_up(String name,String email,String password);
	public boolean log_in(String email,String password);
}
