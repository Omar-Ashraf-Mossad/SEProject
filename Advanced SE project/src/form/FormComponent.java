package form;

import java.util.ArrayList;
public class FormComponent {
	
	
	private String mapkey;
	private String type;
	private String Message;
	private boolean hasoptions = false;
	private ArrayList<String> options;
	
	
	FormComponent(String m,String t,String M, boolean h)
	{
		mapkey = m;
		type = t;
		Message = M;
		hasoptions = h;
	}

	public void add_options(ArrayList<String> o )
	{
		options = o;
	}
	public String getMapkey() {
		return mapkey;
	}


	public String getType() {
		return type;
	}


	public String getMessage() {
		return Message;
	}


	public boolean isHasoptions() {
		return hasoptions;
	}


	public ArrayList<String> getOptions() {
		return options;
	}
	
	
}
