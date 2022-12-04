import java.util.Map;

public interface ServiceProvider {

	String get_name();
	String handle(Map<String,String> m,double amount);
	Form create_form();
}
