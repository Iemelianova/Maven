package com.solvd.model;

public class Composers {
	
	private Integer id_composer;
	private Integer century;
	private String era;
	private String kind;
	private String composer_name;
	
	public Composers() {
		
	}
	
	public Composers(Integer century, String era, String kind, String composer_name) {
		
		this.century = century;
		this.era = era;
		this.kind = kind;
		this.composer_name = composer_name;
	}

	public Integer getCentury() {
		return century;
	}

	public void setCentury(Integer century) {
		this.century = century;
	}

	public String getEra() {
		return era;
	}

	public void setEra(String era) {
		this.era = era;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getComposer_name() {
		return composer_name;
	}

	public void setComposer_name(String composer_name) {
		this.composer_name = composer_name;
	}

	 @Override
	    public String toString() {
	        return " century: " + getCentury() +
	                " music era: " + getEra() +
	                " kind: " + getKind()+
	                " composer name: " + getComposer_name()
	                ;
	    }

	public Integer getId_composer() {
		return id_composer;
	}

	public void setId_composer(Integer id_composer) {
		this.id_composer = id_composer;
	}

}
