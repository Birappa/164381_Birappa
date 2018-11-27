package com.sample.tenth;

import java.util.Comparator;

public class MovieDetails implements Comparator<MovieDetails>{

	private String movieName;
	private String leadActor;
	private String leadActories;
	private String genre;
	
	public MovieDetails() {
		// TODO Auto-generated constructor stub
		this.movieName=null;
		this.leadActor=null;
		this.leadActories=null;
		this.genre=null;
	}

	public MovieDetails(String movieName, String leadActor,
			String leadActories, String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActories = leadActories;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActories() {
		return leadActories;
	}

	public void setLeadActories(String leadActories) {
		this.leadActories = leadActories;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int compare(MovieDetails arg0, MovieDetails arg1) {
		
		return arg0.movieName.compareTo(arg1.movieName);
		
	}

	@Override
	public boolean equals(Object arg0) {
		
		MovieDetails movie=(MovieDetails)arg0;
		return movieName.equals(movie.getMovieName())&&
				leadActor.equals(movie.getLeadActor())&&
				leadActories.equals(movie.getLeadActories())&&
				genre.equals(movie.getGenre());
	}
	
	@Override
	public String toString() {
		return "MovieName : " + movieName + "\nLeadActor : "
				+ leadActor + "\nLeadActories : " + leadActories + "\nGenre : "
				+ genre;
	}
	
}