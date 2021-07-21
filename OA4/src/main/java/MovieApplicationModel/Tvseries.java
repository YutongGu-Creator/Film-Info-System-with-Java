package MovieApplicationModel;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(scope = Tvseries.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "tid")
public class Tvseries extends Production {

	private int tid;
	private People creator;

	// getters and setters
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public People getCreator() {
		return creator;
	}

	public void setCreator(People creator) {
		this.creator = creator;
	}

}
