package MovieApplicationModel;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(scope = Genre.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "gid")
public class Genre implements Comparable<Genre> {
	private int gid;
	private String genre;

	public Genre() {
	}

	public Genre(int gid, String genre) {
		this.gid = gid;
		this.genre = genre;
	}

	// getters and setters
	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int compareTo(Genre o) {
		return this.getGenre().compareToIgnoreCase(o.getGenre());
	}
}
