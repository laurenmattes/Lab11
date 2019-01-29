
public class Movie {

	private String title;
	private String category;

	public Movie() {
		title = "King Kong";
		category = "horror";

	}

	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Movie(String title, String category) {
		this.category = category;
		this.title = title;
	}

	public String category() {
		return category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Movie(title=" + title + ", category=" + category + ")";
	}

}
