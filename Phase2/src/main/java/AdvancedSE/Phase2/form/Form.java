package AdvancedSE.Phase2.form;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;


public abstract class Form {
	
	
	
	boolean limited = false;
	boolean takeamount = true;
	
	protected String name;
	
	protected ArrayList<FormComponent> list1 = new ArrayList<FormComponent>();
	protected ArrayList<Float> amount_options = new ArrayList<Float> ();
	protected String options_Message;
	
	
	public void start() {
//Template Method	
		
		
		createComp();
		
	}
	
	
	abstract void createComp();

	@JsonProperty("Form Input components")
	public ArrayList<FormComponent> getL() {
		return list1;
	}


	public String getOptions_Message() {
		return options_Message;
	}


	public ArrayList<Float> getAmount_options() {
		return amount_options;
	}


	public String getName() {
		return name;
	}
	
}
