package MovieApplicationModel;

public class Profile {
	private String name;
	private Genre preferredGenre;

	public Profile() {
	}

	public Profile(String name, Genre preferredGenre) {
		this.name = name;
		this.preferredGenre = preferredGenre;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genre getPreferredGenre() {
		return preferredGenre;
	}

	public void setPreferredGenre(Genre preferredGenre) {
		this.preferredGenre = preferredGenre;
	}

}
