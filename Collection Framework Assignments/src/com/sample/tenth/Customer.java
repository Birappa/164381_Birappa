package com.sample.tenth;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieDetailsList movieDetailsList=new MovieDetailsList();
		movieDetailsList.addMovie(new MovieDetails("Dabang","Salman Khan","Sonakshi Sinha","Action"));
		movieDetailsList.addMovie(new MovieDetails("Zero","Shahruk Khan","Anushka Sharma","Romantic"));
		movieDetailsList.addMovie(new MovieDetails("Tiger","Salman Khan","Katrina","Spy"));
		movieDetailsList.addMovie(new MovieDetails("Dabang2","Salman Khan","Sonakshi Sinha","Action"));
		
		
		System.out.println(movieDetailsList.findMovieByMovieName("Dabang"));
		System.out.println(movieDetailsList.findMovieByGenre("Action"));
		System.out.println(movieDetailsList.removeMovie(new MovieDetails("Dabang2","Salman Khan","Sonakshi Sinha","Action")));
		movieDetailsList.display();
		movieDetailsList.sort("leadActories");
		movieDetailsList.display();
	}

}