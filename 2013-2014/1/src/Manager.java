import java.util.ArrayList;


public class Manager extends Engineer{
	
	private ArrayList<Engineer> team = new ArrayList<Engineer>();

	public Manager(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Engineer> getTeam()	{
		return team;
	}
	public void setTeam(ArrayList<Engineer> team)	{
		this.team = team;
	}
	public String toString()	{
		String manager = getName() + "(" + getSalary() + ")\n";
		String manages = "Manages:\n";
		String engineer = "";
		for (Engineer e : team)	{
			engineer = e.getName() + "(" + e.getSalary() + ")\n";
		}
		return manager + manages + engineer;
	}
	
	public static void main(String[] args)	{
		Engineer j = new Engineer("Jo Bloggs", 15000);
		Manager m = new Manager("Sue Smith", 30000);
		ArrayList<Engineer> eng = new ArrayList<Engineer>();
		eng.add(j);
		m.setTeam(eng);
		System.out.println(m.toString());
	}

}
