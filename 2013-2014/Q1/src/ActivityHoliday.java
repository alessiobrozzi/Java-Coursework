import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class ActivityHoliday extends Holiday {
	
	private HashMap<String, Cost> activities;

	public ActivityHoliday(String destination, int days) {
		super(destination, days);
		activities = new HashMap<String, Cost>(10);
	}
	
	public void addActivity(String name, Cost cost)	{
		activities.put(name, cost);
	}
	public String toString()	{
		String values = "";
		for (String key : activities.keySet()) {
			values = values + String.format("%s %s\n", key, activities.get(key).toString());
		}
		String init = destination + " (" + days + ")\n" + "Activities: \n";
		return init + values;
	}
	
	public static void main (String[] args)	{
		ActivityHoliday hol = new ActivityHoliday("alessio", 13);
		Cost c = new Cost();
		hol.addActivity("gioco", c);
		System.out.println(hol.toString());
	}

}
