import java.util.ArrayList;

public class SystemServices {
	private ArrayList<User> list = new ArrayList<User>();
	
	private static SystemServices mainobject;
	
	
	public static SystemServices getInstance () {
		if (mainobject == null) { mainobject = new SystemServices(); }
		return mainobject;
	}
}
