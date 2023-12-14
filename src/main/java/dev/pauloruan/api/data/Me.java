package dev.pauloruan.api.data;

public class Me {
	 private String name;
     private String occupation;
     private String[] interests;

	public Me(String name, String occupation, String[] interests) {
		this.name = name;
		this.occupation = occupation;
		this.interests = interests;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String[] getInterests() {
		return interests;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}  
}
