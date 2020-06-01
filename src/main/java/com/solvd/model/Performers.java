package com.solvd.model;

public class Performers {
	
	private Integer id_performer;
	private Integer century;
	private String music_era;
	private String genre;
	private String performer_name;
	
	public Performers() {
		
	}
	
	public Performers(Integer century, String music_era, String genre, String performer_name) {
		
		this.century = century;
		this.music_era = music_era;
		this.genre = genre;
		this.performer_name = performer_name;
	}

	public int getId_performer() {
		return id_performer;
	}

	public void setId_performer(int id_performer) {
		this.id_performer = id_performer;
	}

	public int getCentury() {
		return century;
	}

	public void setCentury(int century) {
		this.century = century;
	}

	public String getMusic_era() {
		return music_era;
	}

	public void setMusic_era(String music_era) {
		this.music_era = music_era;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPerformer_name() {
		return performer_name;
	}

	public void setPerformer_name(String performer_name) {
		this.performer_name = performer_name;
	}
	 @Override
	    public String toString() {
	        return " century: " + getCentury() +
	                " music era: " + getMusic_era() +
	                " genre: " + getGenre()+
	                " performer name: " + getPerformer_name()
	                ;
	    }
}
