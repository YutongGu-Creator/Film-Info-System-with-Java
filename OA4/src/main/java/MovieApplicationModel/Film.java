package MovieApplicationModel;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(scope = Film.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "fid")
public class Film extends Production {

	private int fid;
	private People director;
	
	//getters and setters
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public People getDirector() {
		return director;
	}

	public void setDirector(People director) {
		this.director = director;
	}

}
