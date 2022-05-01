package entities;


public class Band {
	
	private int bandId;
	private String name;
	private String originState;
	private String firstAlbum;
	private String secondAlbum;
	
	public Band(int bandId, String name, String originState, String firstAlbum, String secondAlbum) {
		this.setBandId(bandId);
		this.setName(name);
		this.setOriginState(originState);
		this.setFirstAlbum(firstAlbum);
		this.setSecondAlbum(secondAlbum);
	}

	public int getBandId() {
		return bandId;
	}

	public void setBandId(int bandId) {
		this.bandId = bandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginState() {
		return originState;
	}

	public void setOriginState(String originState) {
		this.originState = originState;
	}

	public String getFirstAlbum() {
		return firstAlbum;
	}

	public void setFirstAlbum(String firstAlbum) {
		this.firstAlbum = firstAlbum;
	}

	public String getSecondAlbum() {
		return secondAlbum;
	}

	public void setSecondAlbum(String secondAlbum) {
		this.secondAlbum = secondAlbum;
	}
	
	
	

}
