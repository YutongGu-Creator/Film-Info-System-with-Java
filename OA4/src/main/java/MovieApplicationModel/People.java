package MovieApplicationModel;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(scope = People.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "pid")
public class People implements Comparable<People> {
	private int pid;
	private String name;

	public People() {
	}

	public People(int pid, String name) {
		this.pid = pid;
		this.name = name;
	}

	// getters and setters
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(People p) {
		return this.getName().compareToIgnoreCase(p.getName());
	}

}
