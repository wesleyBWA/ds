package com.devsuperior.dsmovie.dto;

public class ScoreDTO {
	
	private Long movieId;
	private String emailString;
	private Double score;
	
	public ScoreDTO() {
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	

}
