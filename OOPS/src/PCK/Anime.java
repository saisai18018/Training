
package PCK;

public class Anime {

	private String name;

	private int year;

	public Anime() {

		System.out.println("Heaven");

	}

	// Constructor using fields

	public Anime(String name, int year) {

		this.name = name;

		this.year = year;

	}

	// Getters and Setters

	public String getname() {

		return name;

	}

	public void setname(String name) {

		this.name = name;

	}

	public int getyear() {

		return year;

	}

	public void setyear(int year) {

		this.year = year;

	}

	@Override

	public String toString() {

		return "Anime [name=" + name + ", year=" + year + "]";

	}

}
