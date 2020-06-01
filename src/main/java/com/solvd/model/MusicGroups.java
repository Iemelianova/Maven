package com.solvd.model;

public class MusicGroups {
		
		private Integer id_group;
		private Integer century;
		private String music_era;
		private String genre;
		private String music_group_name;
		
		public MusicGroups() {
			
		}
		
		public MusicGroups(Integer century, String era, String genre, String music_group_name) {
			
			this.century = century;
			this.music_era = music_era;
			this.genre = genre;
			this.music_group_name = music_group_name;
		}

		public Integer getCentury() {
			return century;
		}

		public void setCentury(Integer century) {
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

		public String getMusic_group_name() {
			return music_group_name;
		}

		public void setMusic_group_name(String music_group_name) {
			this.music_group_name = music_group_name;
		}

		@Override
	    public String toString() {
	        return " century: " + getCentury() +
	                " music era: " + getMusic_era() +
	                " genre: " + getGenre()+
	                " Music group name: " + getMusic_group_name()
	                ;
	    }

}
