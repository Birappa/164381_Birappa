package com.collection.tenth;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieDetailsList movieDetailsList=new MovieDetailsList();
		movieDetailsList.addMovie(new MovieDetails("Dabang","Salman Khan","Sonakshi Sinha","Action movie"));
		movieDetailsList.addMovie(new MovieDetails("Zero","Shahruk Khan","Anushka Sharma","Love Movie"));
		movieDetailsList.addMovie(new MovieDetails("Tiger","Salman Khan","Katrina","Spy movie"));
		movieDetailsList.addMovie(new MovieDetails("Dabang2","Salman Khan","Sonakshi Sinha","Action movie"));
		
		
		System.out.println(movieDetailsList.findMovieByMovieName("Dabang"));
	}

}
